package cn.fay.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * Created by fay on 2018/1/7.
 */
@Controller
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@EnableConfigurationProperties // 使用了@EnableAutoConfiguration后不必自己显示使用
public class HelloWorld {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "hello world";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HelloWorld.class, args);
        System.err.println(Arrays.toString(context.getBeanNamesForType(BeImportedConfig.class)));
        String[] names = context.getBeanNamesForType(Data.class);
        if (names != null && names.length > 0) {
            System.err.println(context.getBean(names[0]));
        }
    }
}
