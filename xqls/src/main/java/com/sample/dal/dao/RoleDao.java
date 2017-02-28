package com.sample.dal.dao;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Role;
import com.sample.dal.model.RoleExample;

public interface RoleDao {
	boolean insertRole(Role role);

	boolean updateRole(Role role);

	boolean deleteRole(RoleExample example);
	
	Role selectRoleById(String roleId);

	List<Map<String, Object>> selectByMap(Map<String, Object> map);
}
