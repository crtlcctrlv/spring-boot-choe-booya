package com.choe.practice.boot.booya.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.choe.practice.boot.booya.entity.mysql.City;
import com.choe.practice.boot.booya.entity.mysql.LeaveRecord;
import com.choe.practice.boot.booya.entity.vo.HotguyVO;
import com.choe.practice.boot.booya.mapper.cpdaily.CityMapper;
import com.choe.practice.boot.booya.mapper.leave.LeaveRecordMapper;
import com.choe.practice.boot.booya.service.ExcelService;
import com.choe.practice.boot.booya.service.HotguyService;

@Controller
public class HotguyController {

  private static final Logger logger = LoggerFactory.getLogger(HotguyController.class);

  @Autowired
  private HotguyService service;

  @Autowired
  private ExcelService excelService;

  @Autowired
  private CityMapper cityMapper;

  @Autowired
  private LeaveRecordMapper leaveRecordMapper;

  @GetMapping(value = "/test/choe/city")
  @ResponseBody
  public String test() {

    City record = new City();
    record.setName("name");
    // record.setCountry("test emojis");
    record.setCountry("An 😀awesome 😃string 😄with a few 😉emojis!");
    record.setState("state");

    cityMapper.insert(record);

    return "success";
  }

  @GetMapping(value = "/test/choe/leave/record")
  @ResponseBody
  public String testLeave() {

    LeaveRecord leaveRecord = new LeaveRecord();

    leaveRecord.setApproverId("1111");
    leaveRecord.setApproverName("1111");
    leaveRecord.setApproverOpinion("1111");
    leaveRecord.setApproverWid(11111L);
    leaveRecord.setCreateTime(new Date());
    leaveRecord.setEndTime(new Date());
    leaveRecord.setGender("F");
    leaveRecord.setId(UUID.randomUUID().toString().replaceAll("-", ""));
    leaveRecord.setIsOut(true);
    leaveRecord.setIsPress(true);
    leaveRecord.setLeaveDays(1);
    // leaveRecord.setLeaveReason("aaaaaaaaaaaaaaaaaaa");
    leaveRecord.setLeaveReason("An 😀awesome 😃string 😄with a few 😉emojis!");
    leaveRecord.setLeaveType("1");
    leaveRecord.setStatus("1");
    leaveRecord.setStartTime(new Date());
    leaveRecord.setUpdateTime(new Date());
    leaveRecord.setUserId("1111");
    leaveRecord.setUserName("1111");
    leaveRecord.setUserWid(1111L);

    leaveRecordMapper.insert(leaveRecord);

    return "success";
  }


  @GetMapping(value = "/hotguy/{startTime}/{endTime}/{limit}")
  @ResponseBody
  public String getHotguy(HttpServletResponse response, @PathVariable String startTime,
      @PathVariable String endTime, @PathVariable Integer limit) throws Exception {

    logger.info("hotguy start sTiem {}  eTime {}.", startTime, endTime);

    List<HotguyVO> hotguys = service.queryHotguys(startTime, endTime, limit);

    // 生成excel文件
    if (hotguys.isEmpty()) {
      return "not found";
    } else {
      String fileName =
          "hotguy_" + startTime + "_" + endTime + "_" + System.currentTimeMillis() / 1000;

      excelService.generateExcel(fileName, hotguys);

      return "success";
    }

  }

}
