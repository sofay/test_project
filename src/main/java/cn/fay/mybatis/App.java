package cn.fay.mybatis;

import cn.fay.mybatis.dao.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/20 下午4:58.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(Arrays.toString(applicationContext.getBeanNamesForType(TestMapper.class)));
//        TestMapper dao = (TestMapper) applicationContext.getBean("testDao");
        TestMapper dao = ((SqlSession) applicationContext.getBean("sqlSession")).getMapper(TestMapper.class);
        System.out.println(dao.get("54324"));
//        System.out.println(dao.get("54324"));// test cache
//        System.out.println(dao.get("54324"));
    }
}
