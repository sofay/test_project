package cn.fay.spring.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/29 下午6:55.
 */
//@EnableWebMvc
@Configuration
@ComponentScan
public class WebConfig extends WebMvcConfigurationSupport {

}
