package cn.fay.spring.springboot;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/4/10 下午3:23.
 */
@lombok.Data
public class Data implements BeanNameAware {
    private String url;
    private String username;
    private String password;
    private Integer dbIndex;
    private String notExistValue;

    public void setUrl(String url) {
        System.err.println("data set url:" + url);
        this.url = url;
    }

    public void setBeanName(String name) {
        System.err.println("Data bean name:" + name);
    }
}
