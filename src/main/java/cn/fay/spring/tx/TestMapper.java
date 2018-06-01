package cn.fay.spring.tx;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Map;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/5/29 下午3:05.
 */
public interface TestMapper {
    @Select("select * from test where id = #{id}")
    Map<String, Object> get(@Param("id") String id);

    @Update("update test set name = #{name} where id = #{id}")
    Integer update(@Param("id") String id, @Param("name") String name);

    @Delete("delete from test where id = #{id}")
    Integer delete(@Param("id") String id);
}
