package com.sample.service;

import java.util.List;
import java.util.Map;

public interface RecontrolService {
	
	//远程控制查询
	public List<Map<String,Object>> selectByMap(Map<String,Object> map);
}