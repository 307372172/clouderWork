package com.sample.dal.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.OperationRecordDao;
import com.sample.dal.model.OperationRecord;
import com.sample.dal.service.OperationRecordMapper;

/**
 * 
 * Created by xiaoxu on 2017/2/8.
 *
 */
@Repository
public class OperationRecordDaoImpl implements OperationRecordDao {

    @Autowired  private OperationRecordMapper operation_recordMapper;
	@Override
	public boolean addOperationRecord(OperationRecord operation_record) {
		
		return operation_recordMapper.insertSelective(operation_record)>0;
	}
	
	@Override
	public List<Map<String, Object>> selectByMap(Map<String, Object> map) {
		return operation_recordMapper.selectByMap(map);
	}

}
