package com.sample.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sample.biz.RecontrolBiz;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;


/**
 * Created by xiaoxu  on 2017/2/8.
 */
@Controller
@RequestMapping(value = "/recontrol")
public class RecontrolController {
	@Autowired private RecontrolBiz recontrolbiz;
	@RequestMapping(value = "/recontrolList")
	public String recontrolList() {
	    return "recontrol/recontrolList";
	}
	@RequestMapping(value = "/recontrolListData")
	@ResponseBody
	public CommonResult recontrolListData(CommonPage commonPage) {
		CommonResult result = null;
		result = recontrolbiz.getRecontrolByPage(commonPage);
		if (result.getIsSuccess()) {
			result.setData(commonPage.toSHowPage());
		}
		return result;
	}
	
}
