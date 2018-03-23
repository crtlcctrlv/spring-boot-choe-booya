package com.choe.practice.boot.booya.entity.cassandra;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "t_cpdaily_visiting_hot")
public class Hotguy {

  @PrimaryKey
  private HotguyKey hotguyKey;

  private Integer hot;

  @Column(value = "likenum")
  private Integer likeNum;

  public HotguyKey getHotguyKey() {
    return hotguyKey;
  }

  public void setHotguyKey(HotguyKey hotguyKey) {
    this.hotguyKey = hotguyKey;
  }

  public Integer getHot() {
    return hot;
  }

  public void setHot(Integer hot) {
    this.hot = hot;
  }

  public Integer getLikeNum() {
    return likeNum;
  }

  public void setLikeNum(Integer likeNum) {
    this.likeNum = likeNum;
  }

}
