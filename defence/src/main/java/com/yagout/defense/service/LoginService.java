package com.yagout.defense.service;

import java.util.List;
import java.util.Map;

import com.yagout.defense.dal.model.Login;

public interface LoginService {
	List<Login> getLoginByMap(Map<String,Object> map);
}
