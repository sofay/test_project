package cn.fay.spring.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/15 下午2:33.
 */
public class BeanB {
    private BeanA beanA;

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }

    public BeanA getBeanA() {
        return beanA;
    }
}
