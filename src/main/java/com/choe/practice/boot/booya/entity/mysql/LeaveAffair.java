package com.choe.practice.boot.booya.entity.mysql;

import java.util.Date;

public class LeaveAffair {
    private Long id;

    private String leaveId;

    private String schoolId;

    private String deptWid;

    private Long affairId;

    private Date startTime;

    private Date endTime;

    private Boolean outStatus;

    private Boolean updateStatus;

    private String status;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(String leaveId) {
        this.leaveId = leaveId == null ? null : leaveId.trim();
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    public String getDeptWid() {
        return deptWid;
    }

    public void setDeptWid(String deptWid) {
        this.deptWid = deptWid == null ? null : deptWid.trim();
    }

    public Long getAffairId() {
        return affairId;
    }

    public void setAffairId(Long affairId) {
        this.affairId = affairId;
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

    public Boolean getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(Boolean outStatus) {
        this.outStatus = outStatus;
    }

    public Boolean getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(Boolean updateStatus) {
        this.updateStatus = updateStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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