package com.sample.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.RealdataDao;
import com.sample.dal.model.Realdata;
import com.sample.service.RealdataService;

@Service
public class RealdataServiceImpl implements RealdataService {

	
	@Autowired RealdataDao realdataDao;
	@Override
	public boolean insertRealdata(Realdata realdata) {
		return realdataDao.insertRealdata(realdata);
	}

	@Override
	public List<Map<String, Object>> selectByMap(Map<String, Object> map) {
		return realdataDao.selectByMap(map);
		
	}

	@Override
	public boolean addFiled(String filed, Object type) {
		return realdataDao.addFile(filed, type);
	}

}
