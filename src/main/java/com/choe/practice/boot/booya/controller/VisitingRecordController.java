package com.choe.practice.boot.booya.controller;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.choe.practice.boot.booya.component.VisitingRecordsBaker;

@Controller
public class VisitingRecordController {

  // private static final Logger logger = LoggerFactory.getLogger(VisitingRecordController.class);

  // @Autowired
  // private VisitingRecordsUpdater updater;

  @Autowired
  private VisitingRecordsBaker baker;

  // @GetMapping(value = "/visit/record/update/column/status")
  // @ResponseBody
  // public String countRecords() {
  //
  // DateTime startDay = new DateTime(2017, 9, 4, 0, 0, 0, 0);
  //
  // int i = 0;
  // while (!startDay.plusDays(i).isAfterNow()) {
  //
  // String day = startDay.plusDays(i).toString("yyyy-MM-dd");
  //
  // updater.executeUpdateTask(day);
  //
  // i++;
  // }
  //
  // return "Waiting";
  // }

  @GetMapping(value = "/visit/record/bak")
  @ResponseBody
  public String bakRecords() {

    DateTime startDay = new DateTime(2017, 9, 4, 0, 0, 0, 0);

    int i = 0;
    while (!startDay.plusDays(i).isAfterNow()) {

      String day = startDay.plusDays(i).toString("yyyy-MM-dd");

      baker.executeUpdateTask(day);

      i++;
    }

    return "Waiting";
  }
}
