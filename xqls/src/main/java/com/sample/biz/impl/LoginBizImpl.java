package com.sample.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.biz.LoginBiz;
import com.sample.dal.model.Login;
import com.sample.service.LoginService;

@Service
public class LoginBizImpl implements LoginBiz {

	@Autowired private LoginService loginSerive;
	
	@Override
	public List<Login> getLoginByMap(Map<String,Object> map) {
		return this.loginSerive.getLoginByMap(map);
	}
}
