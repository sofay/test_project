package cn.fay.spring.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/4/11 上午10:50.
 */
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return "test_value".equals(context.getEnvironment().getProperty("test"));
    }
}
