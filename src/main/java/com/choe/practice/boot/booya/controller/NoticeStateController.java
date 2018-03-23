package com.choe.practice.boot.booya.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.choe.practice.boot.booya.entity.cassandra.NoticeState;
import com.choe.practice.boot.booya.repository.NoticStateRepository;

@Controller
public class NoticeStateController {

  private static final Logger logger = LoggerFactory.getLogger(NoticeStateController.class);

  @Autowired
  private NoticStateRepository repository;

  @GetMapping(value = "/choe/notice/state/update")
  @ResponseBody
  public String update() {

    for (NoticeState ns : repository.findAll()) {
      if (ns.getStrangerInfo() == null) {
        repository.updateStrangerInfo(ns.getUserId());
      }
    }

    return "success";
  }
}
