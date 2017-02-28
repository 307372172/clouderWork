package com.sample.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sample.bean.EnterpriseBean;
import com.sample.biz.EnterpriseBiz;
import com.sample.biz.RainWaterBiz;
import com.sample.service.BlockService;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

/**
 * Created by 李晓龙  on 2017/2/8.
 */
@Controller
@RequestMapping(value = "/rainwater")
public class RainWaterController {
	@Autowired private RainWaterBiz rainwaterbiz;
	@Autowired  private BlockService blockService;
	@Autowired  private EnterpriseBiz enterprisebiz;
	@RequestMapping(value = "/rainwaterList")
    public ModelAndView rainwaterList() {
		ModelAndView view=new ModelAndView("rainwater/rainwaterList");
		view.addObject("allBlock",blockService.getAllBlock());
		return view;
    }
    @RequestMapping("/allSSDataList")
    @ResponseBody
	public CommonResult allSSDataList(CommonPage commonPage) {
		CommonResult result = null;
		result = rainwaterbiz.getSSDataByPage(commonPage);
		if (result.getIsSuccess()) {
			result.setData(commonPage.toSHowPage());
		}
		return result;
	}
	@RequestMapping(value = "/cyRecordList")
	public ModelAndView CYRecordList() {
		ModelAndView view=new ModelAndView("rainwater/cyRecordList");
		view.addObject("allBlock",blockService.getAllBlock());
		return view;
	}
	@RequestMapping(value = "/getCyRecordByEnterpriseNo")
	public ModelAndView getCyRecordByEnterpriseNo(String enterpriseNo) {
		ModelAndView view=new ModelAndView("rainwater/someCyRecordList");
		view.addObject("enterpriseNo",enterpriseNo);
		return view;
	}
	@RequestMapping("/someRecord")
    @ResponseBody
	public CommonResult someRecord(CommonPage commonPage) {
		CommonResult result = null;
		result = rainwaterbiz.getCYRecordByPage(commonPage);
		if (result.getIsSuccess()) {
			result.setData(commonPage.toSHowPage());
		}
		return result;
	}
	@RequestMapping(value = "/test")
	public String test() {
	    return "rainwater/test";
	}
	@RequestMapping("/cyRecordListData")
    @ResponseBody
	public CommonResult cyRecordListData(CommonPage commonPage) {
		CommonResult result = null;
		result = rainwaterbiz.getCYRecordByPage(commonPage);
		if (result.getIsSuccess()) {
			result.setData(commonPage.toSHowPage());
		}
		return result;
	}
	@RequestMapping("/findByBlockNo/{blockNo}")
	@ResponseBody
	public List<EnterpriseBean> findByBlockNo(HttpServletRequest request,@PathVariable Integer blockNo){
		List<EnterpriseBean> enterprises = null;
		CommonResult result = null;
		result = enterprisebiz.getEnterpriseByBlockNo(blockNo.toString(), "1");
		return enterprises;
	}
}
