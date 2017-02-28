package com.sample.dal.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.CyRecord;

public interface CyRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(CyRecord record);

    int insertSelective(CyRecord record);

    CyRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CyRecord record);

    int updateByPrimaryKey(CyRecord record);
    
    List<Map<String, Object>>  selectByMap(Map<String,Object> map);
}