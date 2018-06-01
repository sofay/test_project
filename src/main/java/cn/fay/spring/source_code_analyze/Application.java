package cn.fay.spring.source_code_analyze;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.env.StandardEnvironment;

import java.io.IOException;

/**
 * Created by fay on 2017/10/9.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        System.setProperty("spring.profiles.active", "fay");//spring.profiles.active
//        System.setProperty("spring.getenv.ignore", "true");//是否不加载本地环境到spring自身维护的property里面,默认空即false
        /**
         * //表示从根路径/开始，如果只有一个/表示相对当前目录的路径，具体可看{@link FileSystemXmlApplicationContext#getResourceByPath}
         */
        ConfigurableApplicationContext applicationContext = new FileSystemXmlApplicationContext(new String[]{"/${PWD}/src/main/java/cn/fay/spring/source_code_analyze/source_code_analyze.xml"});
//        applicationContext.getEnvironment().setRequiredProperties("fay");
        System.out.println(((TestA) applicationContext.getBean("a")).getValue());
//        System.out.println(applicationContext.getBean("fayTest.InnerClass"));
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
//        System.out.println(applicationContext);
        System.out.println(Application.class);
    }
}
