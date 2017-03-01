package com.sample.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.sample.bean.UserBean;
import com.sample.biz.UserBiz;
import com.sample.dal.model.User;
import com.sample.util.CommonResult;

/**
 * 
 * @author SCJ User的Controller类
 */

@Controller
@RequestMapping(value = "/userController")
public class UserController {
	@Autowired
	private UserBiz userBiz;

	@RequestMapping(value = "/userpasswordEdit")
	public ModelAndView enterpriseEdit(Integer enterpriseNo) {

		ModelAndView view = new ModelAndView("user/userpasswordEdit");

		return view;
	}

	/**
	 * 利用resultful风格获取租户编号和密码 验证租户编号和密码是否正确 返回CommonResult的JSON格式
	 * 
	 * @param tenantNo
	 * @param password
	 * @return commonResult
	 */
	@RequestMapping(value="/checkUser/{tenantNo}/{password}")
	@ResponseBody
	public String checkUser(@PathVariable String tenantNo, @PathVariable String password) {
		CommonResult commonResult=new CommonResult();
		User user = this.userBiz.getUserForLogin(tenantNo, password);
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		
		if(user!=null)
		{
			if (!subject.isAuthenticated()) {
				try {
					AuthenticationToken token = new UsernamePasswordToken(user.getUserName(), password);
					subject.login(token);
					commonResult.setIsSuccess(true);
					session.setAttribute("tenantNo", tenantNo);
				} catch (Exception e) {
					ObjectError objectError = new ObjectError("userName", e.getMessage());
					commonResult.setIsSuccess(false);
					commonResult.setData(objectError);
				}
			}
		}
		else
		{
			commonResult.setIsSuccess(false);
			commonResult.setResultMsg("账户或密码错误！");
		}
		
		return JSONObject.toJSONString(commonResult);
	}

	@RequestMapping(value = "/editpassword")
	@ResponseBody
	public CommonResult passwordSave(UserBean bean) {
		CommonResult result = userBiz.editUserPassword(bean);
		return result;
	}
}
