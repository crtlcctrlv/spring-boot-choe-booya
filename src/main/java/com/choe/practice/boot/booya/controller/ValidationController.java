package com.choe.practice.boot.booya.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choe.practice.boot.booya.entity.model.JavaBean;

@RestController
public class ValidationController {

  private static final Logger logger = LoggerFactory.getLogger(ValidationController.class);

  @GetMapping("/validate")
  public String validate(@Valid JavaBean bean, BindingResult result) {

    if (result.hasErrors()) {

      logger.error("bean validate failed, {}", result.getFieldError());

      return "Object has validation errors";
    } else {
      return "No errors";
    }
  }

}
