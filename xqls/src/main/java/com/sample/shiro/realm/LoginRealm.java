package com.sample.shiro.realm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.sample.bean.LoginBean;
import com.sample.dal.model.Login;
import com.sample.dal.model.User;
import com.sample.redis.Constants;
import com.sample.redis.RedisCache;
import com.sample.redis.RedisKeyEnum;
import com.sample.service.LoginService;
import com.sample.service.UserService;
import com.sample.shiro.PasswordHelper;
import com.sample.util.LoginUtil;

/**
 * 
 * @author SCJ
 * 获得用户的权限和凭证
 * 处理redis的缓存
 */
public class LoginRealm extends AuthorizingRealm implements Realm, InitializingBean {

	@Autowired private UserService userService;
	
	@Autowired private LoginService loginService;

	@Autowired
	private RedisCache<String, Object> redisCache;

	public LoginRealm() {

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}

	/**
	 * 获得用户的权限，把结果放入redis的缓存中
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Set<String> roleStringSet=new HashSet<String>();
		Set<String> permissionStringSet=new HashSet<String>();
		
		String userName = (String) super.getAvailablePrincipal(principals);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userName", userName);
		
		List<Login> loginList=this.loginService.getLoginByMap(map);
		for (Login login : loginList) {
			LoginUtil.getStringSetByList(roleStringSet, LoginUtil.getRoleStringList(login.getRole()));
		    LoginUtil.getStringSetByList(permissionStringSet, LoginUtil.getPermissionStringList(login.getPermission()));
		}
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setRoles(roleStringSet);
		info.setStringPermissions(permissionStringSet);

		redisCache.put(Constants.getRedisKey(RedisKeyEnum.USER_ROLES, userName), info.getRoles());
		redisCache.put(Constants.getRedisKey(RedisKeyEnum.USER_PERMS, userName), info.getStringPermissions());

		return info;
	}

	/**
	 * 获得用户的认证，把结果放入redis的缓存中
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		String userName = upToken.getUsername();
        String password=String.valueOf(upToken.getPassword());
		
		User user=this.userService.getUserByLogin(userName, password);

        LoginBean loginBean=new LoginBean();
        loginBean.setUser(user);
        
        PasswordHelper.encryptPassword(loginBean);
        
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(loginBean.getUser().getUserName(),
				loginBean.getUser().getPassword(),
				ByteSource.Util.bytes(loginBean.getCredentialsSalt()),
				super.getName());
        
		redisCache.put(Constants.getRedisKey(RedisKeyEnum.USER_SESSION, userName), LoginUtil.getUserStringSet(user));
       
		return info;
	}

	/**
	 * 从redis的缓存中，移除指定用户的信息
	 * @param principal
	 */
	public void clearCachedAuthorizationInfo(String principal){
		SimplePrincipalCollection pc=new SimplePrincipalCollection(principal,super.getName());
		super.clearCachedAuthorizationInfo(pc);
		super.clearCachedAuthenticationInfo(pc);
		super.clearCache(pc);
		
		redisCache.remove(Constants.getRedisKey(RedisKeyEnum.USER_ROLES, principal));
		redisCache.remove(Constants.getRedisKey(RedisKeyEnum.USER_PERMS, principal));
	}
	
	/**
	 * 从redis的缓存中，移除所有用户的信息
	 */
	public void clearAllCachedAuthorizationInfo(){
		redisCache.clear();
	}
}
