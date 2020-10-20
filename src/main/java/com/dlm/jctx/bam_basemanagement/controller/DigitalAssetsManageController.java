package com.dlm.jctx.bam_basemanagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.jctx.bam_basemanagement.service.DigitalAssetsService;
import com.dlm.jctx.bam_basemanagement.vo.RequestEntity;
import com.dlm.jctx.bam_basemanagement.vo.ResponseEntity;
import com.dlm.jctx.constant.CommonConstant;
import com.dlm.jctx.pojo.DigitalAssets;
import com.dlm.jctx.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("digitalassets")
public class DigitalAssetsManageController {
	
	@Autowired
	DigitalAssetsService service;
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<DigitalAssets> list = service.list();
		data.put("list", list);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	分页查询信息
	 * @return
	 */
	@RequestMapping("findByPage")
	public @ResponseBody ResponseEntity findByPage(@RequestBody RequestEntity requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<DigitalAssets> list = service.findListByCondition(requestEntity.getDigitalAssets());
		
		int total = (int)new PageInfo<>(list).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("list", list);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		DigitalAssets record = service.get(requestEntity.getId());
		data.put("record", record);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.add(requestEntity.getDigitalAssets());
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", requestEntity.getDigitalAssets());
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑
	 * @param update
	 * @return
	 */
	@RequestMapping("update")
	public @ResponseBody ResponseEntity update(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.update(requestEntity.getDigitalAssets());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	删除
	 * @param deleteById
	 * @return
	 */
	@RequestMapping("deleteById")
	public @ResponseBody ResponseEntity deleteById(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.delete(requestEntity.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
}  
