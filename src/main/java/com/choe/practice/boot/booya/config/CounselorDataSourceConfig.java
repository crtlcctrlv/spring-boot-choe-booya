package com.choe.practice.boot.booya.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan(basePackages = "com.wisedu.cpdaily.hotguy.mapper.counselor", sqlSessionTemplateRef = "counselorSqlSessionTemplate")
public class CounselorDataSourceConfig {

  @Value("${spring.datasource.counselor.password}")
  private String passWord;

  @Value("${spring.datasource.counselor.username}")
  private String userName;

  @Value("${spring.datasource.counselor.url}")
  private String url;

  @Bean(name = "counselorDataSource")
  public DataSource counselorDataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl(url);
    dataSource.setUsername(userName);
    dataSource.setPassword(passWord);
    return dataSource;
  }

  @Bean(name = "counselorSqlSessionFactory")
  public SqlSessionFactory counselorSqlSessionFactory(
      @Qualifier("counselorDataSource") DataSource dataSource) throws Exception {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    return bean.getObject();
  }

  @Bean(name = "counselorTransactionManager")
  public DataSourceTransactionManager counselorTransactionManager(
      @Qualifier("counselorDataSource") DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }

  @Bean(name = "counselorSqlSessionTemplate")
  public SqlSessionTemplate counselorSqlSessionTemplate(
      @Qualifier("counselorSqlSessionFactory") SqlSessionFactory sqlSessionFactory)
      throws Exception {
    return new SqlSessionTemplate(sqlSessionFactory);
  }

}
