package com.sample.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.RecontrolDao;
import com.sample.service.RecontrolService;


/**
 * Created by xiaoxu on 2017/2/8.
 */
@Service
public class RecontrolServiceImpl implements RecontrolService {

	@Autowired private RecontrolDao recontrolDao;
	
	
	/**
	 * 远程控制查询
	 */
	@Override
	public List<Map<String,Object>> selectByMap(Map<String,Object> map) {
		return recontrolDao.selectByMap(map);
	}
	

}

