package com.sample.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.sample.biz.BlockBiz;
import com.sample.biz.IntakeBiz;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

@Controller
@RequestMapping("/intake")
public class IntakeController {
	@Autowired
	private IntakeBiz iBiz;
	@Autowired
	private BlockBiz blockBiz;
	@RequestMapping("/realtime")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView("intake/realtimeData");
		view.addObject("blocks",blockBiz.selectAllBlock());
		List<Object> columns_name = new ArrayList<Object>();
		List<Object> columns = new ArrayList<Object>();
		Map<String, Object> properties = new HashMap<String, Object>();
		columns_name.add("序号");
		columns_name.add("取水口");
		columns_name.add("行政区");
		columns_name.add("网络");
		columns_name.add("瞬时流量");
		columns_name.add("累计流量");
		columns_name.add("电源");
		columns.add("columns");
		columns.add("enterpriseName");
		columns.add("blockName");
		columns.add("netStatus");
		columns.add("record_flowrate");
		columns.add("record_flowrate_total");
		columns.add("powerStatus");
		properties.put("columns_name", columns_name);
		properties.put("columns", columns);
		view.addObject("properties",properties);
		return view;
	}
	@RequestMapping("/realtimeData")
	@ResponseBody
	public String listData(CommonPage commonPage){
		CommonResult result= iBiz.selectDataByBlock(commonPage);
        if(result.getIsSuccess()){
            result.setData(commonPage.toSHowPage());
        }
        return JSONObject.toJSONString(result);
	}
	@RequestMapping("/flowrateRecord")
	public ModelAndView flowrateRecord(){
		ModelAndView view = new ModelAndView("intake/flowrateRecord");
		view.addObject("blocks",blockBiz.selectAllBlock());
		List<Object> columns_name = new ArrayList<Object>();
		List<Object> columns = new ArrayList<Object>();
		Map<String, Object> properties = new HashMap<String, Object>();
		columns_name.add("序号");
		columns_name.add("记录时间");
		columns_name.add("瞬时流量(吨/小时)");
		columns_name.add("累计流量(吨)");
		columns.add("columns");
		columns.add("record_date");
		columns.add("record_flowrate");
		columns.add("record_flowrate_total");
		properties.put("columns_name", columns_name);
		properties.put("columns", columns);
		view.addObject("properties",properties);
		return view;
	}
	@RequestMapping("/flowrateRecordData")
	@ResponseBody
	public String getFlowrateRecordData(CommonPage commonPage){
		CommonResult result= iBiz.selectFlowrateRecordData(commonPage);
        if(result.getIsSuccess()){
            result.setData(commonPage.toSHowPage());
        }
        return JSONObject.toJSONString(result);
	}
}
