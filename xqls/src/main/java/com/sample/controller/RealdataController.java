package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sample.biz.RealdataBiz;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

@Controller
@RequestMapping(value="/realdata")
public class RealdataController {
	
	@Autowired private RealdataBiz realdataBiz;
	
	/*@RequestMapping(value="/realdataList")
	public ModelAndView realdataList(){
		ModelAndView view=new ModelAndView("realdata/realdataList");
		return view;
	}
	*/
	@RequestMapping(value = "/realdataList")
    public String list() {
        return "realdata/realdataList";
    }
	
	@RequestMapping(value="/realdataListData")
	@ResponseBody
	public CommonResult realdataListData(CommonPage commonPage){
		CommonResult result=realdataBiz.queryRealdata(commonPage);
		if(result.getIsSuccess()){
			result.setData(commonPage.toSHowPage());
		}
		return result;
	}
	
	@RequestMapping(value="/realdataEdit")
	public ModelAndView realdataEdit(){
		ModelAndView view=new ModelAndView("realdata/realdataEdit");
		return view;
	}
	@RequestMapping(value="/save")
		@ResponseBody
	    public CommonResult Save(String filed,Object type) {
	        CommonResult  result=realdataBiz.addFiled(filed, type);

	        return result;
	    }
	
	

}
