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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan(basePackages = "com.wisedu.cpdaily.hotguy.mapper.cpdaily", sqlSessionTemplateRef = "cpdailySqlSessionTemplate")
public class CpdailyDataSourceConfig {

  @Value("${spring.datasource.cpdaily.password}")
  private String passWord;

  @Value("${spring.datasource.cpdaily.username}")
  private String userName;

  @Value("${spring.datasource.cpdaily.url}")
  private String url;

  @Bean(name = "cpdailyDataSource")
  // @ConfigurationProperties(prefix = "spring.datasource.cpdaily")
  @Primary
  public DataSource cpdailyDataSource() {

    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl(url);
    dataSource.setUsername(userName);
    dataSource.setPassword(passWord);
    return dataSource;
  }

  @Bean(name = "cpdailySqlSessionFactory")
  @Primary
  public SqlSessionFactory cpdailySqlSessionFactory(
      @Qualifier("cpdailyDataSource") DataSource dataSource) throws Exception {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    bean.setMapperLocations(new PathMatchingResourcePatternResolver()
        .getResources("classpath:mybatis/mapper/cpdaily/*.xml"));
    return bean.getObject();
  }

  @Bean(name = "cpdailyTransactionManager")
  @Primary
  public DataSourceTransactionManager cpdailyTransactionManager(
      @Qualifier("cpdailyDataSource") DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }

  @Bean(name = "cpdailySqlSessionTemplate")
  @Primary
  public SqlSessionTemplate cpdailySqlSessionTemplate(
      @Qualifier("cpdailySqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
    return new SqlSessionTemplate(sqlSessionFactory);
  }

}
