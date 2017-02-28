package com.sample.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.sample.bean.RoleBean;
import com.sample.biz.RoleBiz;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleBiz roleBiz;
	@RequestMapping("/index")
	public String list(){
		return "role/roleList";
	}
	@RequestMapping("/list")
	@ResponseBody
	public String listData(CommonPage commonPage){
		CommonResult result = roleBiz.getRolesByPage(commonPage);
		if (result.getIsSuccess()) {
			result.setData(commonPage.toSHowPage());
		}
		return JSONObject.toJSONString(result);
	}
	@RequestMapping("/roleEdit")
	public ModelAndView roleEdit(String roleId) {
		ModelAndView view = new ModelAndView("role/roleEdit");
		if(roleId!=null){
			view.addObject("role", roleBiz.getRoleById(roleId));
		}
		view.addObject("newDate", new Date());
		return view;
	}
	@RequestMapping(value = "/roleSave")
	@ResponseBody
	public CommonResult RoleSave(RoleBean bean) {
		CommonResult result = roleBiz.editRole(bean);
		return result;
	}

	@RequestMapping(value = "/delete")
	@ResponseBody
	public CommonResult roleDel(@RequestBody List<String> roleIds) {
		CommonResult result = roleBiz.deleteRole(roleIds);
		return result;
	}
}
