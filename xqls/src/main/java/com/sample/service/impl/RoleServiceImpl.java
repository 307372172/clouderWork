package com.sample.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.RoleDao;
import com.sample.dal.model.Role;
import com.sample.dal.model.RoleExample;
import com.sample.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;

	@Override
	public boolean editRole(Role role) {
		if(roleDao.selectRoleById(role.getRoleId())==null){
			return roleDao.insertRole(role);
		}else {
			return roleDao.updateRole(role);
		}
	}

	@Override
	public boolean deleteRole(List<String> roleIds) {
		RoleExample example=new RoleExample();
		example.createCriteria().andRoleIdIn(roleIds);
		return roleDao.deleteRole(example);
	}

	@Override
	public Role getRoleById(String roleId) {
		return roleDao.selectRoleById(roleId);
	}
	@Override
	public List<Map<String, Object>> getByMap(Map<String, Object> map) {
		return roleDao.selectByMap(map);
	}

}
