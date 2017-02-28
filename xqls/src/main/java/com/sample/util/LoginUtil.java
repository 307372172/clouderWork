package com.sample.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sample.dal.model.Permission;
import com.sample.dal.model.Role;
import com.sample.dal.model.User;

public class LoginUtil {

	/**
	 * 把user转化为Set<String>
	 * @return stringSet
	 */
	public static Set<String> getUserStringSet(User user){
		Set<String> stringSet=new HashSet<String>();
		stringSet.add(user.getUserNo());
		stringSet.add(user.getUserName());
		stringSet.add(user.getName());
		stringSet.add(user.getPassword());
		stringSet.add(user.getRoleId());
		stringSet.add(user.getBlockNo());
		stringSet.add(user.getTenantNo());
		stringSet.add(user.getTelephone());
		stringSet.add(String.valueOf(user.getAlertLevel()));
		return stringSet;
	}
	
	/**
	 * 把role转化为List<String>
	 * @return stringList
	 */
    public static List<String> getRoleStringList(Role role){
    	List<String> stringList=new ArrayList<String>();
    	stringList.add(role.getRoleId());
    	stringList.add(role.getRoleName());
        stringList.add(role.getRemark());
    	return stringList;
	}

    /**
	 * 把permission转化为List<String>
	 * @return stringList
	 */
    public static List<String> getPermissionStringList(Permission permission){
    	List<String> stringList=new ArrayList<String>();
    	stringList.add(permission.getPermissionNo());
    	stringList.add(permission.getPermissionName());
    	stringList.add(permission.getUrl());
    	return stringList;
    }
    
    /**
     * 把List<String>转化为Set<String>
     * @param stringList
     */
    public static void getStringSetByList(Set<String> stringSet,List<String> stringList){
		for (String string : stringList) {
			stringSet.add(string);
		}
    }
}
