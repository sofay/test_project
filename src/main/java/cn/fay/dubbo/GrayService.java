package cn.fay.dubbo;

import java.util.List;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/2/25 上午11:45.
 */
public interface GrayService {
    String hello(List<Long> shopIds);
}
