package com.choe.practice.boot.booya.entity.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class HotguyVO {

  private String userName;

  private String userId;

  private String campusName;

  private String campusId;

  private Integer hotNum;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getCampusId() {
    return campusId;
  }

  public void setCampusId(String campusId) {
    this.campusId = campusId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getCampusName() {
    return campusName;
  }

  public void setCampusName(String campusName) {
    this.campusName = campusName;
  }

  public Integer getHotNum() {
    return hotNum;
  }

  public void setHotNum(Integer hotNum) {
    this.hotNum = hotNum;
  }


  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE).append("userName", userName)
        .append("campusName", campusName).append("hotNum", hotNum).toString();
  }
}
