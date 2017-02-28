package com.sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.dal.model.Block;
import com.sample.service.BlockService;

@Controller
@RequestMapping("/main/jsp")
public class BlockController {
	@Autowired
	public BlockService service;
	
	@RequestMapping("/hello")
	public String hello(){
		return "main/jsp/hello";
	}
	@ResponseBody
	@RequestMapping("/list")
	public List hello1(){
		List<Block> dep= service.getAllBlock();
		return dep;
	}
	@ResponseBody
	@RequestMapping("/doadd")
	public Map<String, Object> doadd(Block block,String blockno){
		Map<String, Object> map= new HashMap<String, Object>();
		
		int result =service.addBlock(block);
		//查询 query diankou   block_no
		
		//根据父节点查询，得到下面的子节点  
		
		//查询到的子节点信息放在map中，用一个string变量保存map中的子节点中的id
		
		String id="123";             
		Block block2=new Block();
		block2.setBlockNo(blockno+id);    
		block2.setParentBlock(blockno);
		//block2.setParentBlock(block_no);
        service.addBlock(block); 
		map.put("result", result);
		map.put("newblockName", service.getLastblockName());
		return map;
	}
	@ResponseBody
	@RequestMapping("/doadd1")
	public Map<String, Object> doadd1(Block block){
		Map<String, Object> map= new HashMap<String, Object>();
		int result =service.addBlock(block);
		map.put("result", result);
		map.put("newblockNo", service.getAllBlock());
		map.put("newblockName", service.getLastblockName());
		map.put("newparentBlock",service.getAllBlock());
		map.put("newtenantNo",service.getAllBlock());
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/doedit")
	@ModelAttribute
	public Map<String, Object> doedit(Block block){
		Map<String, Object> map= new HashMap<String, Object>();
		int result =service.editBlock(block);
		map.put("result", result);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/dodel")
	public Map<String, Object> dodel(String blockName){
		Map<String, Object> map= new HashMap<String, Object>();
		int result =service.delBlock(blockName);
		map.put("result", result);
		return map;
	}
}
