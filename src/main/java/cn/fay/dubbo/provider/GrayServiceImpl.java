package cn.fay.dubbo.provider;

import cn.fay.dubbo.GrayService;

import java.util.List;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/2/25 上午11:47.
 */
public class GrayServiceImpl implements GrayService {
    @Override
    public String hello(List<Long> shopIds) {
        return "world " + shopIds;
    }
}
