package com.sample.service;

import java.util.List;
import java.util.Map;

public interface CyRecordService {
	public List<Map<String, Object>> selectByMap(Map<String,Object> map);
}
