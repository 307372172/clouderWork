package com.sample.dal.mybatis;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.IntakeDao;
import com.sample.dal.model.Intake;
import com.sample.dal.service.IntakeMapper;

@Repository
public class IntakeDaoImpl implements IntakeDao{
	@Autowired
	private IntakeMapper mapper;
	@Override
	public int deleteByPrimaryKey(String record_id) {
		return mapper.deleteByPrimaryKey(record_id);
	}

	@Override
	public int insert(Intake record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Intake record) {
		return mapper.insertSelective(record);
	}

	@Override
	public Intake selectByPrimaryKey(String record_id) {
		return mapper.selectByPrimaryKey(record_id);
	}

	@Override
	public int updateByPrimaryKeySelective(Intake record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Intake record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Map<String, Object>> selectByRecordDate(Map<String, Object> record_time) {
		return mapper.selectByRecordDate(record_time);
	}

	@Override
	public List<Map<String, Object>> selectDataByBlock(Map<String, Object> block) {
		return mapper.selectDataByBlock(block);
	}

}
