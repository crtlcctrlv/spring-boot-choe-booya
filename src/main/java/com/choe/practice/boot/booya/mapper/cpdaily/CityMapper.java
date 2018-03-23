package com.choe.practice.boot.booya.mapper.cpdaily;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.choe.practice.boot.booya.entity.mysql.City;
import com.choe.practice.boot.booya.entity.mysql.CityExample;

public interface CityMapper {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}