package com.sample.service;

import java.util.List;

import com.sample.dal.model.User;

/**
 * Created by Skeyedu on 2017/1/19.
 */
public interface UserService {
	
    public  boolean editUserPassword(User userbean);
  
    User getUserByLogin(String userName,String password);
    
    List<User> getUserListForLogin(String tenantNo,String password);
}
