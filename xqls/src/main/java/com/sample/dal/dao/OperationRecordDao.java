package com.sample.dal.dao;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.OperationRecord;

/**
 * 
 * Created by xiaoxu on 2017/2/8.
 */
public interface OperationRecordDao {
	//保存记录
    public  boolean addOperationRecord(OperationRecord operation_record);
	//查询记录
    public  List<Map<String, Object>> selectByMap(Map<String, Object> map);
}
