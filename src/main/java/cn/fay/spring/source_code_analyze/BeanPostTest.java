package cn.fay.spring.source_code_analyze;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by fay on 2018/1/5.
 */
@Component
public class BeanPostTest implements BeanPostProcessor, InitializingBean {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("a".equals(beanName))
            System.out.println("test a post process before init:" + beanName + ":" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("a".equals(beanName))
            System.out.println("test a post process after  init:" + beanName + ":" + bean);
        return bean;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after bean post test");
    }
}
