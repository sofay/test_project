package cn.fay.java;

import com.alibaba.fastjson.JSON;
import org.springframework.asm.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by fay on 2017/12/20.
 */
public class ASMTest {
    private static final Long aLong = 100000L;
    private static final Integer integer = 100;
    private static final String string = "ffftest";

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        final ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classWriter.visit(Opcodes.V1_7, Opcodes.ACC_PUBLIC, "HaTest", null, "java/lang/Object", null);
        MethodVisitor init = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        init.visitVarInsn(Opcodes.ALOAD, 0); // like this
        //执行父类的init初始化
        init.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        //从当前方法返回void
        init.visitInsn(Opcodes.RETURN);
        init.visitMaxs(1, 1);
        init.visitEnd();
        MethodVisitor test = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "test", "(Ljava/lang/String;)Ljava/lang/Object;", null, null); // ()括号里面表示参数 后面的表示返回值L表示对象类型
        test.visitCode();
//        test.visitLdcInsn("hello world");
        test.visitVarInsn(Opcodes.ALOAD, 1);
        test.visitInsn(Opcodes.ARETURN);
        test.visitMaxs(1, 1);
        test.visitEnd();
        classWriter.visitEnd();
        final byte[] bytes = classWriter.toByteArray();
        new FileOutputStream("/data/HaTest.class").write(bytes);
        Class clazz = new ClassLoader() {
            @Override
            protected Class<?> findClass(String name) {
                return defineClass("HaTest", bytes, 0, bytes.length);
            }
        }.loadClass("HaTest");
        Object object = clazz.newInstance();
        Method method = clazz.getMethod("test", String.class);
        System.out.println(method.invoke(object, "hello world"));
    }

}
