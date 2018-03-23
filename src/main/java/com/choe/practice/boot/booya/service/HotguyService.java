package com.choe.practice.boot.booya.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choe.practice.boot.booya.entity.cassandra.Hotguy;
import com.choe.practice.boot.booya.entity.mysql.Tenant;
import com.choe.practice.boot.booya.entity.mysql.User;
import com.choe.practice.boot.booya.entity.vo.HotguyVO;
import com.choe.practice.boot.booya.mapper.cpdaily.TenantMapper;
import com.choe.practice.boot.booya.mapper.cpdaily.UserMapper;
import com.choe.practice.boot.booya.repository.HotguyRepository;

@Service
public class HotguyService {

  private static final Logger logger = LoggerFactory.getLogger(HotguyService.class);

  @Autowired
  private HotguyRepository repository;

  @Autowired
  private TenantMapper tenantMapper;

  @Autowired
  private UserMapper userMapper;

  /**
   * 统计并返回vo
   *
   * @param startTime
   * @param endTime
   * @return
   */
  public List<HotguyVO> queryHotguys(String startTime, String endTime, Integer limit) {

    List<Tenant> activeTenants = tenantMapper.findActiveTenants();

    List<Hotguy> rangeHotguys = new ArrayList<>();

    logger.info("query from cassandra begins.");

    Instant cassandraStartTime = Instant.now();

    for (Tenant active : activeTenants) {
      List<Hotguy> hotguys = repository.findByTimeRange(active.getWid(), startTime, endTime);
      rangeHotguys.addAll(hotguys);
    }

    logger.info("query from cassandra ends, rangeHotguys size is {} , cost time is {} ms.",
        rangeHotguys.size(), Instant.now().toEpochMilli() - cassandraStartTime.toEpochMilli());

    // 使用Map统计
    Map<String, Integer> hotMap = new HashMap<>();

    for (Hotguy hotguy : rangeHotguys) {

      String tenantId = hotguy.getHotguyKey().getTenantId();
      String userId = hotguy.getHotguyKey().getUserId();

      String key = userId + ":" + tenantId;

      Integer a = hotMap.get(key);

      if (a == null) {
        hotMap.put(key, hotguy.getHot());
      } else {
        hotMap.put(key, a.intValue() + hotguy.getHot().intValue());
      }

    }

    // 只统计大于10的
    Map<String, Integer> filterMap = new HashMap<>();
    for (Map.Entry<String, Integer> entry : hotMap.entrySet()) {
      if (entry.getValue().intValue() >= limit) {
        filterMap.put(entry.getKey(), entry.getValue());
      }
    }

    return convert2VO(filterMap);
  }

  /**
   * 转换vo
   *
   * @param hotMap
   * @return
   */
  private List<HotguyVO> convert2VO(Map<String, Integer> hotMap) {

    List<HotguyVO> result = new ArrayList<>();

    if (hotMap.isEmpty()) {
      return result;
    }

    Set<String> tenantIds = new HashSet<>();
    Set<String> userIds = new HashSet<>();
    for (Map.Entry<String, Integer> entry : hotMap.entrySet()) {
      String[] ids = StringUtils.split(entry.getKey(), ":");
      userIds.add("'" + ids[0] + "'");
      tenantIds.add("'" + ids[1] + "'");
    }

    Map<String, String> teantMap = convertTenantIds(tenantIds);
    Map<String, String> userMap = convertUserIds(userIds);

    for (Map.Entry<String, Integer> entry : hotMap.entrySet()) {
      String[] ids = StringUtils.split(entry.getKey(), ":");

      HotguyVO vo = new HotguyVO();
      vo.setUserId(ids[0]);
      String userName = userMap.get(ids[0]);

      if (StringUtils.isEmpty(userName)) {
        logger.error("userName is Empty, uid is {}.", ids[0]);
        continue;
      }

      vo.setUserName(userName);
      vo.setCampusId(ids[1]);
      vo.setCampusName(teantMap.get(ids[1]));
      vo.setHotNum(entry.getValue());

      result.add(vo);
    }

    return result;

  }

  /**
   * 查询学校
   *
   * @param tenantIds
   * @return
   */
  private Map<String, String> convertTenantIds(Set<String> tenantIds) {

    List<Tenant> tenants = tenantMapper.findTenantByWids(StringUtils.join(tenantIds, ","));
    Map<String, String> idNameMap = new HashMap<String, String>();
    for (Tenant t : tenants) {
      idNameMap.put(t.getWid(), t.getTenantName());
    }

    return idNameMap;

  }

  /**
   * 查询学生
   *
   * @param userIds
   * @return
   */
  private Map<String, String> convertUserIds(Set<String> userIds) {

    List<User> users = userMapper.findUserByWids(StringUtils.join(userIds, ","));
    Map<String, String> idNameMap = new HashMap<String, String>();
    for (User u : users) {
      idNameMap.put(u.getWid(), u.getName());
    }

    return idNameMap;
  }

}
