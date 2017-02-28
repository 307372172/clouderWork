package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sample.bean.EnterpriseBean;
import com.sample.biz.FlowBiz;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;


@Controller
@RequestMapping("/flow")
public class FlowController {
	
	@Autowired private FlowBiz flowBiz;
	
	@RequestMapping("/getflow")
	@ResponseBody
	public CommonResult getFlow(CommonPage commonPage){
		 CommonResult result=flowBiz.getFlowByPage(commonPage);
         if(result.getIsSuccess()){
             result.setData(commonPage.toSHowPage());
         }
		 return result;
	}
	
	@RequestMapping("/add")
	 public ModelAndView toAddRecord(){
		ModelAndView view = new ModelAndView("flow/addrecord");
		view.addObject("allBlock",flowBiz.getAllBlock("001"));
		
		return view;
	 }
	
	@RequestMapping("/getenterprise")
	@ResponseBody
	public List<EnterpriseBean> getEnterprise(String blockNo){
		return flowBiz.getEnterpriseByBlockNo(blockNo,"001");
	}
	
}
