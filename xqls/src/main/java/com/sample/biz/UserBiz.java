package com.sample.biz;

import com.sample.bean.UserBean;
import com.sample.dal.model.User;
import com.sample.util.CommonResult;

public interface UserBiz {
	public CommonResult editUserPassword(UserBean userbean);
	
	CommonResult checkUserForLogin(String tenantNo,String password);
	
	User getUserForLogin(String tenantNo,String password);
}
