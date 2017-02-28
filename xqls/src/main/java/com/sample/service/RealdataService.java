package com.sample.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Realdata;

public interface RealdataService {
	
	boolean insertRealdata(Realdata realdata);
	
	public List<Map<String, Object>> selectByMap(Map<String, Object> map);	
	boolean addFiled(String filed,Object type);

}
