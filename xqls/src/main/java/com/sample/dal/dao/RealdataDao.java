package com.sample.dal.dao;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Realdata;

public interface RealdataDao {
	
	boolean insertRealdata(Realdata realdata);
	
	boolean addFile(String filed,Object type);
	
	List<Map<String, Object>> selectByMap(Map<String, Object> map);

}
