package cn.fay.spring.tx;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.*;
import org.springframework.core.Ordered;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/6/4 下午1:36.
 */
public class BeanFactoryPost implements SmartInstantiationAwareBeanPostProcessor,Ordered {
    private String beanName;

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (AnnotationTransactionAttributeSource.class.equals(beanClass) || (AnnotationTransactionAttributeSource.class.getName() + "#0").equals(beanName)) {
            this.beanName = beanName;
            return new AnnotationTransactionAttributeSource(false);
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        return beanClass;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
