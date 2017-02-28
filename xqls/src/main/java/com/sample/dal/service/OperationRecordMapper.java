package com.sample.dal.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sample.dal.model.OperationRecord;
import com.sample.dal.model.OperationRecordExample;

public interface OperationRecordMapper {
    int countByExample(OperationRecordExample example);

    int deleteByExample(OperationRecordExample example);

    int deleteByPrimaryKey(String operationNo);

    int insert(OperationRecord record);

    int insertSelective(OperationRecord record);

    List<OperationRecord> selectByExample(OperationRecordExample example);

    OperationRecord selectByPrimaryKey(String operationNo);

    int updateByExampleSelective(@Param("record") OperationRecord record, @Param("example") OperationRecordExample example);

    int updateByExample(@Param("record") OperationRecord record, @Param("example") OperationRecordExample example);

    int updateByPrimaryKeySelective(OperationRecord record);

    int updateByPrimaryKey(OperationRecord record);
    
    List<Map<String, Object>> selectByMap(Map<String, Object> map);
}