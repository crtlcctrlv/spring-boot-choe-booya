package com.choe.practice.boot.booya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BooyaApplication {

  public static void main(String[] args) {
    SpringApplication.run(BooyaApplication.class, args);
  }

}
