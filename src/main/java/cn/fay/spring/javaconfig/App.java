package cn.fay.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/15 下午2:36.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(context.getBean("a"));
        System.out.println(context.getBean("b"));
        System.out.println(context.getBean("b", BeanB.class).getBeanA());
    }
}
