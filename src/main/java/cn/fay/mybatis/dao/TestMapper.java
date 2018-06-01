package cn.fay.mybatis.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/20 下午5:16.
 */
public interface TestMapper {
    @Select("select * from test where id = #{id}")
    Map<String, Object> get(String id);
}
