package com.sample.biz;

import java.util.List;

import com.sample.bean.RoleBean;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

public interface RoleBiz {

	CommonResult editRole(RoleBean roleBean);

	CommonResult deleteRole(List<String> roleIds);

	CommonResult getRolesByPage(CommonPage commonPage);
	
	RoleBean  getRoleById(String roleId);
}
