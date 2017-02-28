package com.sample.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.IntakeDao;
import com.sample.dal.model.Intake;
import com.sample.service.IntakeService;

@Service("intakeservice")
public class IntakeServiceImpl implements IntakeService{
	@Autowired
	private IntakeDao dao;
	@Override
	public int deleteByPrimaryKey(String record_id) {
		return dao.deleteByPrimaryKey(record_id);
	}

	@Override
	public int insert(Intake record) {
		return dao.insert(record);
	}

	@Override
	public int insertSelective(Intake record) {
		return dao.insertSelective(record);
	}

	@Override
	public Intake selectByPrimaryKey(String record_id) {
		return dao.selectByPrimaryKey(record_id);
	}

	@Override
	public int updateByPrimaryKeySelective(Intake record) {
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Intake record) {
		return dao.updateByPrimaryKey(record);
	}

	@Override
	public List<Map<String, Object>> selectByRecordDate(Map<String, Object> time) {
		return dao.selectByRecordDate(time);
	}

	@Override
	public List<Map<String, Object>> selectDataByBlock(Map<String, Object> block) {
		return dao.selectDataByBlock(block);
	}

}
