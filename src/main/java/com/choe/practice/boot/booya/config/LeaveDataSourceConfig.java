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
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan(basePackages = "com.wisedu.cpdaily.hotguy.mapper.leave", sqlSessionTemplateRef = "leaveSqlSessionTemplate")
public class LeaveDataSourceConfig {

  @Value("${spring.datasource.leave.password}")
  private String passWord;

  @Value("${spring.datasource.leave.username}")
  private String userName;

  @Value("${spring.datasource.leave.url}")
  private String url;

  @Bean(name = "leaveDataSource")
  // @ConfigurationProperties(prefix = "spring.datasource.leave")
  public DataSource leaveDataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl(url);
    dataSource.setUsername(userName);
    dataSource.setPassword(passWord);
    return dataSource;
  }

  @Bean(name = "leaveSqlSessionFactory")
  public SqlSessionFactory leaveSqlSessionFactory(
      @Qualifier("leaveDataSource") DataSource dataSource) throws Exception {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    bean.setMapperLocations(new PathMatchingResourcePatternResolver()
        .getResources("classpath:mybatis/mapper/leave/*.xml"));
    return bean.getObject();
  }

  @Bean(name = "leaveTransactionManager")
  public DataSourceTransactionManager leaveTransactionManager(
      @Qualifier("leaveDataSource") DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }

  @Bean(name = "leaveSqlSessionTemplate")
  public SqlSessionTemplate leaveSqlSessionTemplate(
      @Qualifier("leaveSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
    return new SqlSessionTemplate(sqlSessionFactory);
  }
}
