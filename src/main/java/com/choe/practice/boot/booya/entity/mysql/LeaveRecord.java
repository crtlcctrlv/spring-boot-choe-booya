package com.choe.practice.boot.booya.entity.mysql;

import java.util.Date;

public class LeaveRecord {
    private String id;

    private Long userWid;

    private String userId;

    private String userName;

    private String gender;

    private String leaveType;

    private Boolean isOut;

    private String mobile;

    private String urgencyMobile;

    private Date startTime;

    private Date endTime;

    private Integer leaveDays;

    private String approverId;

    private Long approverWid;

    private String approverName;

    private String leaveReason;

    private String approverOpinion;

    private String reportComment;

    private String status;

    private Boolean isPress;

    private String reportLocation;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getUserWid() {
        return userWid;
    }

    public void setUserWid(Long userWid) {
        this.userWid = userWid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType == null ? null : leaveType.trim();
    }

    public Boolean getIsOut() {
        return isOut;
    }

    public void setIsOut(Boolean isOut) {
        this.isOut = isOut;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUrgencyMobile() {
        return urgencyMobile;
    }

    public void setUrgencyMobile(String urgencyMobile) {
        this.urgencyMobile = urgencyMobile == null ? null : urgencyMobile.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getApproverId() {
        return approverId;
    }

    public void setApproverId(String approverId) {
        this.approverId = approverId == null ? null : approverId.trim();
    }

    public Long getApproverWid() {
        return approverWid;
    }

    public void setApproverWid(Long approverWid) {
        this.approverWid = approverWid;
    }

    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName == null ? null : approverName.trim();
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason == null ? null : leaveReason.trim();
    }

    public String getApproverOpinion() {
        return approverOpinion;
    }

    public void setApproverOpinion(String approverOpinion) {
        this.approverOpinion = approverOpinion == null ? null : approverOpinion.trim();
    }

    public String getReportComment() {
        return reportComment;
    }

    public void setReportComment(String reportComment) {
        this.reportComment = reportComment == null ? null : reportComment.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Boolean getIsPress() {
        return isPress;
    }

    public void setIsPress(Boolean isPress) {
        this.isPress = isPress;
    }

    public String getReportLocation() {
        return reportLocation;
    }

    public void setReportLocation(String reportLocation) {
        this.reportLocation = reportLocation == null ? null : reportLocation.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}