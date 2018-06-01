package cn.fay.spring.source_code_analyze;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by fay on 2017/10/10.
 */
public class TestA implements InitializingBean, BeanFactoryAware, ApplicationContextAware, SmartInitializingSingleton {
    @Autowired
    private FayTest fayTest;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    static {
        System.out.println("test a static block");
    }

    public TestA() {
        System.out.println("test a init.");
    }

    public void show() {
        System.out.println("test a init method: show");
    }

    public void end() {
        System.out.println("test a destroy method: end");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("test a after properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean factory aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context aware");
    }

    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("after singletons instantiated");
    }
}
