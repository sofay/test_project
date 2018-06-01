package cn.fay.spring.aop;

import org.aopalliance.aop.Advice;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/5/29 上午10:16.
 */
public class TargetAdvisor implements Advice {

    public void before() {
        System.err.println("before run:");
    }

    public void after(Object result) {
        System.err.println("after run:[" + result.getClass() + "]" + result);
    }
}
