package com.sample.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.LoginDao;
import com.sample.dal.model.Login;
import com.sample.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired private LoginDao loginDao;
	
	@Override
	public List<Login> getLoginByMap(Map<String,Object> map) {
		return this.loginDao.getLoginByMap(map);
	}
}
