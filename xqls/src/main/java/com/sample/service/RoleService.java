package com.sample.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Role;

public interface RoleService {
	boolean editRole(Role role);

	boolean deleteRole(List<String> roleIds);

	List<Map<String, Object>> getByMap(Map<String, Object> map);
	
	Role getRoleById(String roleId);
}
