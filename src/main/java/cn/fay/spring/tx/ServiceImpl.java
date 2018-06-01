package cn.fay.spring.tx;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/5/29 下午3:04.
 */
public class ServiceImpl {
    private TestMapper testMapper;

    public void someOpt() {
        System.err.println(testMapper.get("2"));
        System.err.println(testMapper.update("2", "zzzzzz"));
        System.err.println(testMapper.get("2"));
        throw new RuntimeException("roll back");
    }

    public void setTestMapper(TestMapper testMapper) {
        this.testMapper = testMapper;
    }
}
