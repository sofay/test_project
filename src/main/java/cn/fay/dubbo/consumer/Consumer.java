package cn.fay.dubbo.consumer;

import cn.fay.dubbo.GrayService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Collections;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/2/25 上午11:49.
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        GrayService grayService = (GrayService) context.getBean("grayService");
//        System.err.println(grayService.hello(Collections.singletonList(1075401508L)));
        System.err.println(grayService.test().getClass());
        System.err.println(grayService.test());
        System.in.read();
//        System.err.println(grayService.test());
//        System.err.println(grayService.getShops(Collections.singletonList(1075401508L)));
    }
}
