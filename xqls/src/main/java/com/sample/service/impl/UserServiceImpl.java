package com.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.UserDao;
import com.sample.dal.model.User;
import com.sample.dal.model.UserExample;
import com.sample.dal.model.UserExample.Criteria;
import com.sample.service.UserService;

/**
 * Created by Skeyedu on 2017/1/19.
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean editUserPassword(User user) {
		boolean result = false;
		
		user = userDao.LoginByid(user.getUserNo());
		if (user != null) {
			if (user.getPassword().equals(user.getPassword())) {
				result = userDao.updateUser(user);
			}
		}
		return result;
	}
	
	@Override
	public User getUserByLogin(String userName, String password) {
		User user=null;
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(userName);
		criteria.andPasswordEqualTo(password);
		
		List<User> userList= this.userDao.getUserListByExample(example);
		if(userList!=null)
		{
			user=userList.get(0);
		}
		return user;
	}

	@Override
	public List<User> getUserListForLogin(String tenantNo, String password) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andTenantNoEqualTo(tenantNo);
		criteria.andPasswordEqualTo(password);
		
		return this.userDao.getUserListByExample(example);
	}
}
