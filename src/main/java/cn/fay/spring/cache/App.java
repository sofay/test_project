package cn.fay.spring.cache;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/5/29 下午3:11.
 */
public class App {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("//${PWD}/src/main/java/cn/fay/spring/cache/cache.xml");
        OptServiceImpl optService = (OptServiceImpl) applicationContext.getBean("opt");
        System.out.println(optService.getSome("abc"));
        System.out.println(optService.getSome("abc"));
        optService.update("abc");
        System.out.println(optService.getSome("abc"));
    }
}
