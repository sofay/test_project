package cn.fay.spring.source_code_analyze;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by fay on 2017/12/21.
 */
@Target(ElementType.TYPE)
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface Fay {
}
