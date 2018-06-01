package cn.fay.mybatis;

import cn.fay.mybatis.dao.TestMapper;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/20 下午4:58.
 */
@Configurable
@ComponentScan("cn.fay.mybatis.*")
public class Config {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
//        sqlSessionFactoryBean.setMapperLocations(new Resource[]{new ClassPathResource("test.xml")});
        return sqlSessionFactoryBean;
    }

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setUsername("root");
        config.setPassword("Ladyship77");
        config.setJdbcUrl("jdbc:mysql://rm-wz957s9v4cf3a2422o.mysql.rds.aliyuncs.com:3306/test");
        return new HikariDataSource(config);
    }

    @Bean
    public SqlSession sqlSession(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

//    @Bean
    public MapperFactoryBean<TestMapper> mapperMapperFactoryBean(SqlSessionFactory sqlSessionFactory) {
        MapperFactoryBean<TestMapper> factoryBean = new MapperFactoryBean<>();
        factoryBean.setMapperInterface(TestMapper.class);
        factoryBean.setSqlSessionFactory(sqlSessionFactory);
        return factoryBean;
    }
}
