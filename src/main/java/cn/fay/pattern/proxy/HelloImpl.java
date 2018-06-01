package cn.fay.pattern.proxy;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/19 上午10:37.
 */
public class HelloImpl implements Hello {
    @Override
    public String hello() {
        System.out.println(privateTest());
        return "hello proxy";
    }

    private String privateTest() {
        return "private";
    }
}
