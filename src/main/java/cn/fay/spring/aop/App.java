package cn.fay.spring.aop;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/5/29 上午10:21.
 */
public class App {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "fay");
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("//${PWD}/src/main/java/cn/fay/spring/aop/aop.xml");
        TargetObject bean = (TargetObject) applicationContext.getBean("target");
        System.out.println(bean.getClass());
        System.out.println(bean.run("abc"));
    }
}
