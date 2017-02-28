package com.sample.dal.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.SSDataDao;
import com.sample.dal.service.SSDataMapper;


@Repository
public class SSDataDaoImpl implements SSDataDao {
	@Autowired private SSDataMapper sSDataMapper;
	@Override
	public List<Map<String, Object>> selectByMap(Map<String, Object> map) {
		return sSDataMapper.selectByMap(map);
	}

}
