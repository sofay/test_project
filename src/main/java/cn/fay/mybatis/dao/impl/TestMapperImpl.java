package cn.fay.mybatis.dao.impl;

import cn.fay.mybatis.dao.AbstractDao;
import cn.fay.mybatis.dao.TestMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/20 下午5:17.
 */
//@Repository
public class TestMapperImpl extends AbstractDao implements TestMapper {
    @Override
    public Map<String, Object> get(String id) {
        Map<String, Object> map = new HashMap<>(1);
        map.put("id", id);
        return sqlSession.selectOne("test_namespace.get", map);
    }
}
