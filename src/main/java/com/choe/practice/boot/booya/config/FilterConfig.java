package com.choe.practice.boot.booya.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.choe.practice.boot.booya.filter.ChoeFilter;

@Configuration
public class FilterConfig {

  @Bean
  public FilterRegistrationBean choeFilter() {
    FilterRegistrationBean frb = new FilterRegistrationBean();

    frb.setFilter(new ChoeFilter());
    frb.addUrlPatterns("/*");

    return frb;
  }

}
