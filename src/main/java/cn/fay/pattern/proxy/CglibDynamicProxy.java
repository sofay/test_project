package cn.fay.pattern.proxy;



import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/19 下午1:33.
 */
public class CglibDynamicProxy {
    public static void main(String[] args) {
        final Hello h = new HelloImpl();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloImpl.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("method:" + method.getName());
                System.err.println(method);
                System.err.println(methodProxy);
                return methodProxy.invoke(h, objects);
            }
        });
        Hello hello = (Hello) enhancer.create();
        System.out.println(hello.hello());
//        System.out.println(hello.getClass().getName());
    }
}
