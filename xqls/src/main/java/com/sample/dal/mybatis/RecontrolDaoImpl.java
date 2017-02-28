package com.sample.dal.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.RecontrolDao;
import com.sample.dal.service.RecontrolMapper;


/**
 * 
 * Created by xiaoxu on 2017/2/8.
 *
 */
@Repository
public class RecontrolDaoImpl implements RecontrolDao {

    @Autowired  private  RecontrolMapper recontrolMapper;
	//远程控制查询
	@Override
	public List<Map<String,Object>> selectByMap(Map<String,Object> map) {
		return recontrolMapper.selectByMap(map);
	}

}
