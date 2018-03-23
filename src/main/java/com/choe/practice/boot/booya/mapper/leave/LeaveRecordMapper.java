package com.choe.practice.boot.booya.mapper.leave;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.choe.practice.boot.booya.entity.mysql.LeaveRecord;
import com.choe.practice.boot.booya.entity.mysql.LeaveRecordExample;

public interface LeaveRecordMapper {
    long countByExample(LeaveRecordExample example);

    int deleteByExample(LeaveRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(LeaveRecord record);

    int insertSelective(LeaveRecord record);

    List<LeaveRecord> selectByExample(LeaveRecordExample example);

    LeaveRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LeaveRecord record, @Param("example") LeaveRecordExample example);

    int updateByExample(@Param("record") LeaveRecord record, @Param("example") LeaveRecordExample example);

    int updateByPrimaryKeySelective(LeaveRecord record);

    int updateByPrimaryKey(LeaveRecord record);
}