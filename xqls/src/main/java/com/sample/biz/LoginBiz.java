package com.sample.biz;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Login;


public interface LoginBiz {
	List<Login> getLoginByMap(Map<String,Object> map);
}
