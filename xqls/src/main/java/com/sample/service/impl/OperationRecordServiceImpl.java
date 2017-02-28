package com.sample.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.OperationRecordDao;
import com.sample.dal.model.OperationRecord;
import com.sample.service.OperationRecordService;

/**
 * Created by xiaoxu on 2017/2/8.
 */
@Service
public class OperationRecordServiceImpl implements OperationRecordService {

	@Autowired private OperationRecordDao operationRecordDao;
	
	//保存记录
	@Override
	public boolean addOperation_record(OperationRecord operationRecord) {
		return operationRecordDao.addOperationRecord(operationRecord);
	}
	//查询记录

	@Override
	public List<Map<String, Object>> selectByMap(Map<String, Object> map) {
		return  operationRecordDao.selectByMap(map);
	}
	
}
