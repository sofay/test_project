package cn.fay.spring.tx;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/5/29 下午3:04.
 */
public class ServiceImpl {
    private TestMapper testMapper;

    @Transactional
    public void pubOpt() { // 不能在非事务方法里面调用事务方法，如果这样调用事务方法将不会被事务管理
        someOpt();
    }

//    @Transactional
    private void someOpt() {
        System.err.println(testMapper.get("2"));
        System.err.println(testMapper.update("2", "zzzzzz"));
        System.err.println(testMapper.get("2"));
        throw new RuntimeException("roll back");
    }

    public void setTestMapper(TestMapper testMapper) {
        this.testMapper = testMapper;
    }
}
