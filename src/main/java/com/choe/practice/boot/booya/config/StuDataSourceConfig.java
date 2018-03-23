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
@MapperScan(basePackages = "com.wisedu.cpdaily.hotguy.mapper.stu", sqlSessionTemplateRef = "stuSqlSessionTemplate")
public class StuDataSourceConfig {

  @Value("${spring.datasource.stu.password}")
  private String passWord;

  @Value("${spring.datasource.stu.username}")
  private String userName;

  @Value("${spring.datasource.stu.url}")
  private String url;

  @Bean(name = "stuDataSource")
  // @ConfigurationProperties(prefix = "spring.datasource.stu")
  public DataSource stuDataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl(url);
    dataSource.setUsername(userName);
    dataSource.setPassword(passWord);
    return dataSource;
  }

  @Bean(name = "stuSqlSessionFactory")
  public SqlSessionFactory stuSqlSessionFactory(@Qualifier("stuDataSource") DataSource dataSource)
      throws Exception {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    // bean.setMapperLocations(new PathMatchingResourcePatternResolver()
    // .getResources("classpath:mybatis/mapper/stu/*.xml"));
    return bean.getObject();
  }

  @Bean(name = "stuTransactionManager")
  public DataSourceTransactionManager stuTransactionManager(
      @Qualifier("stuDataSource") DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }

  @Bean(name = "stuSqlSessionTemplate")
  public SqlSessionTemplate stuSqlSessionTemplate(
      @Qualifier("stuSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
    return new SqlSessionTemplate(sqlSessionFactory);
  }

}
