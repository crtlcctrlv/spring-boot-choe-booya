package com.choe.practice.boot.booya.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ChoeFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    // nothing
  }

  @Override
  public void destroy() {
    // nothing
  }

  @Override
  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
      throws IOException, ServletException {

    chain.doFilter(req, resp);

  }

}
