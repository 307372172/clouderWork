package com.sample.dal.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.SSData;

public interface SSDataMapper {
    int deleteByPrimaryKey(String ssdata_no);

    int insert(SSData record);

    int insertSelective(SSData record);

    SSData selectByPrimaryKey(String ssdata_no);

    int updateByPrimaryKeySelective(SSData record);

    int updateByPrimaryKey(SSData record);
    
    List<Map<String, Object>>  selectByMap(Map<String,Object> map);
}