package cn.fay.spring.aop;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/5/29 上午10:11.
 */
public class TargetObject {

    public String run(String s) {
        return "echo:" + s;
    }
}
