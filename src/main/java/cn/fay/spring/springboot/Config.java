package cn.fay.spring.springboot;

import cn.fay.spring.mvc.WebConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/4/10 下午5:25.
 */
@Configuration
@PropertySource("classpath:config.properties")
@Import({BeImportedConfig.class, WebConfig.class})
public class Config {
}
