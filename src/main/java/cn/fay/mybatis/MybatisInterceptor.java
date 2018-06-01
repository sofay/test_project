package cn.fay.mybatis;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.CachingExecutor;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.executor.resultset.ResultSetWrapper;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/21 下午3:43.
 */
@Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class})
//,@Signature(type = ResultSetHandler.class, method = "handleRowValues", args = {ResultSetWrapper.class, ResultMap.class, ResultHandler.class, RowBounds.class, ResultMapping.class})
})
public class MybatisInterceptor implements Interceptor {
    private static final Pattern pattern = Pattern.compile("select([ *()\\w]+?)from");
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object target = invocation.getTarget();
        Object[] args = invocation.getArgs();
        if (target instanceof Executor) {
            BoundSql boundSql = (BoundSql) args[5];
            String sql = boundSql.getSql();
        }
        if (target instanceof ResultSetHandler) {

        }
        return invocation.getMethod().invoke(invocation.getTarget(), invocation.getArgs());
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
//        return target;
    }

    @Override
    public void setProperties(Properties properties) {

    }

    public static void main(String[] args) {
        String sql = "select * from xxx";
        System.out.println(sql.replaceFirst("select[ \\*()\\w]+?from", "select[MATCH]from"));
        sql = "select id from xxx";
        System.out.println(sql.replaceFirst("select[ \\*()\\w]+?from", "select[MATCH]from"));
        sql = "select * from (select id from xxx) t";
        System.out.println(sql.replaceFirst("select[ \\*()\\w]+?from", "select[MATCH]from"));
    }
}
