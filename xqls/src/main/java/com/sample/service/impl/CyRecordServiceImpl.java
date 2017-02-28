package com.sample.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.CyRecordDao;
import com.sample.service.CyRecordService;

@Service
public class CyRecordServiceImpl implements CyRecordService {
	@Autowired CyRecordDao cyrecorddao;
	@Override
	public List<Map<String, Object>> selectByMap(Map<String, Object> map) {
		return  cyrecorddao.selectByMap(map);
	}
}
