package com.sample.dal.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.CyRecordDao;
import com.sample.dal.service.CyRecordMapper;

@Repository
public class CyRecordDaoImpl implements CyRecordDao {
	@Autowired  private CyRecordMapper cyrecordmapper;
	@Override
	public List<Map<String, Object>> selectByMap(Map<String, Object> map) {
		return cyrecordmapper.selectByMap(map);
	}
	
}
