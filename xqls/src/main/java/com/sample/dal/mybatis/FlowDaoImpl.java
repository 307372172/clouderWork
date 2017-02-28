package com.sample.dal.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.FlowDao;
import com.sample.dal.model.Flow;
import com.sample.dal.service.FlowMapper;

@Repository
public class FlowDaoImpl implements FlowDao {
	
	@Autowired
	private FlowMapper flowMapper;
	
	@Override
	public int deleteByPrimaryKey(String flowNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean insert(Flow record) {
		// TODO Auto-generated method stub
		return flowMapper.insert(record)>0;
	}

	@Override
	public int insertSelective(Flow record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String,Object>> selectByEnterprise(Map<String,Object> map) {
		return flowMapper.selectByEnterprise(map);
	}

	@Override
	public int updateByPrimaryKeySelective(Flow record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Flow record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
