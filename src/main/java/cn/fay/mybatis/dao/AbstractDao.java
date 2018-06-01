package cn.fay.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/20 下午5:16.
 */
public abstract class AbstractDao {
    @Autowired
    protected SqlSession sqlSession;
}
