package com.sample.bean;

import java.io.Serializable;

/**
 * Created by Skeyedu on 2017/1/19.
 */
public class UserBean implements Serializable {
	 private String userNo;
	  private String userName;
	  private String name;
	  private String roleId;
	  private String blockNo;
	  private String tenantNo;
	  private String telephone;
	  private Integer alertLevel;
	  private String password;
	  private String newpassword;
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getBlockNo() {
		return blockNo;
	}
	public void setBlockNo(String blockNo) {
		this.blockNo = blockNo;
	}
	public String getTenantNo() {
		return tenantNo;
	}
	public void setTenantNo(String tenantNo) {
		this.tenantNo = tenantNo;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getAlertLevel() {
		return alertLevel;
	}
	public void setAlertLevel(Integer alertLevel) {
		this.alertLevel = alertLevel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNewpassword() {
        return newpassword;
    }
    
    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }  

  
}
