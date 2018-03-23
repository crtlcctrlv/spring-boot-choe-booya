package com.choe.practice.boot.booya.controller;
// package com.wisedu.cpdaily.hotguy.controller;
//
// import java.util.List;
//
// import org.apache.commons.collections4.CollectionUtils;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
//
// import com.wisedu.cpdaily.hotguy.entity.mysql.LeaveAffair;
// import com.wisedu.cpdaily.hotguy.entity.mysql.LeaveRecord;
// import com.wisedu.cpdaily.hotguy.mapper.leave.LeaveAffairMapper;
// import com.wisedu.cpdaily.hotguy.mapper.leave.LeaveRecordMapper;
// import com.wisedu.cpdaily.hotguy.mapper.stu.StuMainMapper;
//
// @Controller
// public class UpdateAffair {
//
// private static final Logger logger = LoggerFactory.getLogger(UpdateAffair.class);
//
// @Autowired
// private LeaveAffairMapper leaveAffairMapper;
//
// @Autowired
// private LeaveRecordMapper leaveRecordMapper;
//
// @Autowired
// private StuMainMapper stuMainMapper;
//
// @GetMapping(value = "/test/update/affair")
// @ResponseBody
// public String getHotguy() {
//
// logger.info("UpdateAffair begins.");
//
// List<LeaveAffair> affairs = leaveAffairMapper.selectEmptyDept();
//
// if (CollectionUtils.isNotEmpty(affairs)) {
//
// for (LeaveAffair affair : affairs) {
// String leaveId = affair.getLeaveId();
// String schoolId = affair.getSchoolId();
//
// LeaveRecord record = leaveRecordMapper.affairUserWids(schoolId, leaveId);
//
//
// String deptWid = stuMainMapper.affairUserWids(schoolId, record.getUserWid());
//
// logger.info(leaveId + " " + schoolId + " " + deptWid + " " + affair.getAffairId() + " "
// + record.getApproverName() + " " + record.getApproverWid());
//
// }
// }
//
// logger.info("UpdateAffair ends.");
//
// return "waiting";
//
// }
// }
