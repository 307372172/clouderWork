package com.sample.dal.dao;

import java.util.List;

import com.sample.dal.model.User;
import com.sample.dal.model.UserExample;

/**
 * Created by Skeyedu on 2017/1/19. 添加企业,修改企业,删除企业,根据区块编号查询企业
 */
public interface UserDao {

	public boolean updateUser(User user);

	public User LoginByid(String userno);

	List<User> getUserListByExample(UserExample example);
}
