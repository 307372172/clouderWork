package com.sample.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.sample.bean.RoleBean;
import com.sample.biz.RoleBiz;
import com.sample.service.RoleService;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

@Service
public class RoleBizImpl implements RoleBiz {
	@Autowired
	private RoleService roleService;
	private static Logger logger = Logger.getLogger(RoleBizImpl.class);
	@Autowired
	private TransactionTemplate transactionTemplate;

	@Override
	public CommonResult editRole(RoleBean roleBean) {
		CommonResult result = new CommonResult();
		try {
			//result.setIsSuccess(roleService.editRole(roleBean));
		} catch (Exception e) {
			logger.error("编辑角色异常", e);
		}
		return result;
	}

	@Override
	public CommonResult deleteRole(List<String> roleIds) {
		CommonResult result = new CommonResult();
		try {
			boolean success = transactionTemplate.execute(new TransactionCallback<Boolean>() {
				@Override
				public Boolean doInTransaction(TransactionStatus status) {
					boolean success = true;
					return success;
				}
			});
			result.setIsSuccess(roleService.deleteRole(roleIds));
		} catch (Exception e) {
			logger.error("删除角色异常", e);
		}
		return result;
	}

	@Override
	public CommonResult getRolesByPage(CommonPage commonPage) {
		CommonResult result = new CommonResult();
		try {
			commonPage.setPageData(roleService.getByMap(commonPage.pageToMap()));
			result.setIsSuccess(true);
		} catch (Exception e) {
			logger.error("查询角色列表异常", e);
		}
		return result;
	}

	@Override
	public RoleBean getRoleById(String roleId) {
		return null;//roleService.getRoleById(roleId);
	}

}
