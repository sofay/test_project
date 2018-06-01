package cn.fay.spring.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/4/11 上午10:44.
 */
public class BeImportedConfig {
    @Bean
    @ConfigurationProperties(prefix = "cn.fay.db") // @ConfigurationProperties是通过set方法注入  @Value是通过反射注入
    @TestConditional
    public Data data() {
        return new Data();
    }
}
