package cn.fay.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/19 上午10:34.
 */
public class JDKDynamicProxy {
    public static void main(String[] args) {
//        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        final Hello hello = new HelloImpl();
        Hello proxy = (Hello) Proxy.newProxyInstance(JDKDynamicProxy.class.getClassLoader(), new Class[]{Hello.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("proxy method:" + method.getName() + " args:" + Arrays.toString(args));
                return method.invoke(hello, args);
            }
        });
        System.out.println(proxy.hello());
    }
}
