package com.sample.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author SCJ
 * Login的Controller类
 */
@Controller
@RequestMapping("/loginController")
public class LoginController {

	/**
	 * 判断当前账户是否已经登录
	 * 返回 ModelAndView
	 * @return view
	 */
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "/login";
	}
	
	@RequestMapping("/toPermNo")
	public String permNo(){
		return "/permNo";
	}

	/**
	 * 注销当前账户
	 * 返回 ModelAndView
	 * @return view
	 */
	@RequestMapping("/loginOut")
	public ModelAndView loginOut() {
		ModelAndView view = new ModelAndView();
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout();
		}
		view.setViewName("/login");
		return view;
	}

	/**
	 * 利用resultful风格获取租户编号和密码
	 * 将租户编号存入session
	 * 用户登录系统，获得对应的界面
	 * 返回 ModelAndView
	 * @param tenantNo
	 * @param password
	 * @return view
	 */
	@RequestMapping(value = "/login")
	public ModelAndView login() {
        String tenantNo=null;
        ModelAndView view = new ModelAndView();
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		
		if(session!=null)
		{
			tenantNo=(String) session.getAttribute("tenantNo");
			
			view.setViewName("/index");
			view.addObject("tenantNo", tenantNo);
		}
		else
		{
			view.setViewName("/login");
		}
		
		return view;
	}
}
