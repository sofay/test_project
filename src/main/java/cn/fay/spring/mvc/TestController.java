package cn.fay.spring.mvc;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/29 下午7:02.
 */
@RestController
@RequestMapping("/test")
public class TestController implements InitializingBean {
    @RequestMapping("/hello.do")
    public String test() {
        return "test hello";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println(this.getClass().getPackage() + " do");
    }
}
