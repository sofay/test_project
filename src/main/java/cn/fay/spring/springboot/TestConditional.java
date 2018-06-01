package cn.fay.spring.springboot;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/5/29 上午10:00.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(MyCondition.class)
public @interface TestConditional {
}
