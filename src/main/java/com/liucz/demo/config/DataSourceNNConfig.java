package com.liucz.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.liucz.demo.mapper.niuniu", sqlSessionTemplateRef  = "nnSqlSessionTemplate")
public class DataSourceNNConfig {

    @Bean(name = "nnDataSource")
    @ConfigurationProperties(prefix = "spring.datasource-nn")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "nnSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("nnDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/niuniu/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "nnTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("nnDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "nnSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("nnSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
