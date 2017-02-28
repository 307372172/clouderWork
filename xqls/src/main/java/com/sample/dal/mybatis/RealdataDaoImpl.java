package com.sample.dal.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.RealdataDao;
import com.sample.dal.model.Realdata;
import com.sample.dal.service.RealdataMapper;

@Repository
public class RealdataDaoImpl implements RealdataDao{

	
	@Autowired private RealdataMapper realdataMapper;
	
	
	@Override
	public boolean insertRealdata(Realdata realdata) {
		return realdataMapper.insert(realdata)>0;
	}

	@Override
	public boolean addFile(String filed, Object type) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("filed", filed);
		map.put("type", type);
		return realdataMapper.addFiled(map)>0;
	}

	@Override
	public List<Map<String, Object>> selectByMap(Map<String, Object> map) {
		return	realdataMapper.selectByMap(map);
	}

}
