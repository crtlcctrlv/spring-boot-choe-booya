package com.choe.practice.boot.booya.entity.cassandra;

import java.util.Date;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "t_cpdaily_user_notice_states")
public class NoticeState {

  @PrimaryKey
  @Column(value = "userid")
  private String userId;

  @Column(value = "focusmsg")
  private String focusMsg;

  private Date optime;

  @Column(value = "strangerinfo")
  private Integer strangerInfo;

  @Column(value = "strangermsg")
  private Integer strangerMsg;

  @Column(value = "tribemsg")
  private Integer tribeMsg;

  @Column(value = "tribevoice")
  private Integer tribeVoice;

  private Integer voice;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getFocusMsg() {
    return focusMsg;
  }

  public void setFocusMsg(String focusMsg) {
    this.focusMsg = focusMsg;
  }

  public Date getOptime() {
    return optime;
  }

  public void setOptime(Date optime) {
    this.optime = optime;
  }

  public Integer getStrangerInfo() {
    return strangerInfo;
  }

  public void setStrangerInfo(Integer strangerInfo) {
    this.strangerInfo = strangerInfo;
  }

  public Integer getStrangerMsg() {
    return strangerMsg;
  }

  public void setStrangerMsg(Integer strangerMsg) {
    this.strangerMsg = strangerMsg;
  }

  public Integer getTribeMsg() {
    return tribeMsg;
  }

  public void setTribeMsg(Integer tribeMsg) {
    this.tribeMsg = tribeMsg;
  }

  public Integer getTribeVoice() {
    return tribeVoice;
  }

  public void setTribeVoice(Integer tribeVoice) {
    this.tribeVoice = tribeVoice;
  }

  public Integer getVoice() {
    return voice;
  }

  public void setVoice(Integer voice) {
    this.voice = voice;
  }

}
