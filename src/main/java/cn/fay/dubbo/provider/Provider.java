package cn.fay.dubbo.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/2/25 上午11:50.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        // press any key to exit
        System.in.read();
    }
}
