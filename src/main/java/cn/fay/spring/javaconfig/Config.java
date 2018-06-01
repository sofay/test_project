package cn.fay.spring.javaconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/15 下午2:33.
 */
@Configurable
public class Config {
    @Bean
    @Qualifier("fay")
    public BeanA a() {
        return new BeanA();
    }

    @Bean
    public BeanB b(@Qualifier("fay") BeanA a) {
        BeanB b = new BeanB();
        b.setBeanA(a);
        return b;
    }
}
