package com.sample.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.OperationRecord;

public interface OperationRecordService {
	//保存记录
	public boolean addOperation_record(OperationRecord operationecord);
	//查询记录
	public List<Map<String, Object>> selectByMap(Map<String, Object> map);
}