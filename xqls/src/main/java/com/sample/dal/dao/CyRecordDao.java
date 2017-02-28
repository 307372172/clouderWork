package com.sample.dal.dao;

import java.util.List;
import java.util.Map;

public interface CyRecordDao {
	public List<Map<String, Object>> selectByMap(Map<String,Object> map);
}
