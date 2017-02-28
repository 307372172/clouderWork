package com.sample.biz.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.bean.UserBean;
import com.sample.biz.UserBiz;
import com.sample.dal.model.User;
import com.sample.service.UserService;
import com.sample.util.CommonResult;


@Service
public class UserBizImpl implements UserBiz {
	private static Logger logger = Logger.getLogger(EnterpriseBizImpl.class);
	@Autowired
	private UserService userService;

	@Override
	public CommonResult editUserPassword(UserBean userbean) {
		CommonResult result = new CommonResult();

		try {
			//result.setIsSuccess(userService.editUserPassword(userbean));
		} catch (Exception e) {
			logger.error("编辑企业异常", e);
		}
		return result;

	}

	@Override
	public CommonResult checkUserForLogin(String tenantNo, String password) {
		CommonResult commonResult=new CommonResult();
		List<User> userList = this.userService.getUserListForLogin(tenantNo, password);
		if(userList!=null)
		{
			if(userList.size()>0)
			{
				commonResult.setIsSuccess(true);
			}
			else
			{
				commonResult.setIsSuccess(false);
			}
		}
		else
		{
			commonResult.setIsSuccess(false);
		}

		return commonResult;
	}

	@Override
	public User getUserForLogin(String tenantNo, String password) {
		User user=null;
		List<User> userList = this.userService.getUserListForLogin(tenantNo, password);
		if(userList!=null){
			user=userList.get(0);
		}
		
		return user;
	}
}