package com.sample.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.SSData;

public interface SSDataService {
	public List<SSData> selectByMap(Map<String, Object> map);
}
