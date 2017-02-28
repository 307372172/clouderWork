package com.sample.dal.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.UserDao;
import com.sample.dal.model.User;
import com.sample.dal.model.UserExample;
import com.sample.dal.service.UserMapper;

import java.util.List;

/**
 * Created by Skeyedu on 2017/1/19.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired  private  UserMapper userMapper;
    
    @Override
    public boolean updateUser(User record) {
        return userMapper.updateByPrimaryKey(record)>0;
    }
   
    @Override
	public User LoginByid(String userNo) {
		
		return userMapper.selectByPrimaryKey(userNo);
	}

	@Override
	public List<User> getUserListByExample(UserExample example) {
		return this.userMapper.selectByExample(example);
	}

}
