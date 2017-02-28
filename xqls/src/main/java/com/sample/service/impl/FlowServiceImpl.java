package com.sample.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.FlowDao;
import com.sample.dal.model.Flow;
import com.sample.service.FlowService;

@Service
public class FlowServiceImpl implements FlowService {
	@Autowired
	private FlowDao flowDao;
	
	@Override
	public List<Map<String, Object>> selByEnterprise(Map<String,Object> map) {
		return flowDao.selectByEnterprise(map);
	}

	@Override
	public boolean insertFlow(Flow record) {
		// TODO Auto-generated method stub
		return flowDao.insert(record);
	}

}
