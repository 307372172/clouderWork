package com.sample.bean;

import java.io.Serializable;
import java.util.Date;

public class RoleBean implements Serializable{
		private String roleId;

	    private String roleName;

	    private String remark;

	    private Date createTime;

	    public String getRoleId() {
	        return roleId;
	    }

	    public void setRoleId(String roleId) {
	        this.roleId = roleId == null ? null : roleId.trim();
	    }

	    public String getRoleName() {
	        return roleName;
	    }

	    public void setRoleName(String roleName) {
	        this.roleName = roleName == null ? null : roleName.trim();
	    }

	    public String getRemark() {
	        return remark;
	    }

	    public void setRemark(String remark) {
	        this.remark = remark == null ? null : remark.trim();
	    }

	    public Date getCreateTime() {
	        return createTime;
	    }

	    public void setCreateTime(Date createTime) {
	        this.createTime = createTime;
	    }
}
