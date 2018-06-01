package cn.fay.spring.tx;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/5/29 下午3:11.
 */
public class App {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("//${PWD}/src/main/java/cn/fay/spring/tx/tx.xml");
        ServiceImpl service = (ServiceImpl) applicationContext.getBean("service");
        System.err.println(service.getClass());
        service.pubOpt();
    }
}
