package com.sample.dal.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.RoleDao;
import com.sample.dal.model.Role;
import com.sample.dal.model.RoleExample;
import com.sample.dal.service.RoleMapper;

@Repository
public class RoleDaoImpl implements RoleDao {
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public boolean insertRole(Role role) {
		return roleMapper.insertSelective(role) > 0;
	}

	@Override
	public boolean updateRole(Role role) {
		return roleMapper.updateByPrimaryKeySelective(role) > 0;
	}

	@Override
	public boolean deleteRole(RoleExample example) {
		return roleMapper.deleteByExample(example) > 0;
	}

	@Override
	public Role selectRoleById(String roleId) {
		return roleMapper.selectByPrimaryKey(roleId);
	}

	@Override
	public List<Map<String, Object>> selectByMap(Map<String, Object> map) {
		return roleMapper.selectByMap(map);
	}

}
