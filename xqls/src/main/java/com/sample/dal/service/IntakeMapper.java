package com.sample.dal.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Intake;

public interface IntakeMapper {
    int deleteByPrimaryKey(String record_id);

    int insert(Intake record);

    int insertSelective(Intake record);

    Intake selectByPrimaryKey(String record_id);

    int updateByPrimaryKeySelective(Intake record);

    int updateByPrimaryKey(Intake record);
    
    List<Map<String, Object>> selectByRecordDate(Map<String, Object> record_time);
    
    List<Map<String, Object>> selectDataByBlock(Map<String, Object> block);
}