package com.sample.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Flow;

public interface FlowService {
	
	public List<Map<String,Object>> selByEnterprise(Map<String,Object> map);
	
	public boolean insertFlow(Flow record);
	
}
