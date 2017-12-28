package com.aixu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiko.common.util.SystemApi;
import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.entity.ResultValue;
import com.aixu.service.CCBaseInfoService;

/**
 * @desc 一些通用功能
 * @date 2017年12月22日
 */
@Controller
@RequestMapping("/common")
public class CommonController {
	private final static Logger logger = LoggerFactory.getLogger(CommonController.class);
	@Autowired
	private CCBaseInfoService cCBaseInfoService;
	
	
	/**
	 * @desc 返回当前登陆人的id
	 * @return
	 */
	@GetMapping("/getUserId")
	@ResponseBody
	public ResultValue getUserId() {
		ResultValue rv = new ResultValue();
		try {
			String userId = (String) SystemApi.getCurrentUser().get("userid");
			return rv.success("获取登陆人信息成功", userId);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("<--获取当前登陆人信息失败-->");
			return rv.fail("获取登陆人信息失败", null);
		}

	}
	
	/**
	 * @desc  获取是否立案
	 * @param lawsuitId
	 * @return
	 */
	@PostMapping("/getSfla")
	@ResponseBody
	public ResultValue getSfla(@RequestParam("lawsuitId")String lawsuitId) {
		ResultValue rv = new ResultValue();
		try {
			AixuBaseLawsuit aixuBaseLawsuit = cCBaseInfoService.getBaseInfoById(lawsuitId);
			return rv.success("获取是否立案状态成功！", aixuBaseLawsuit.getResTen());
		}catch(Exception e) {
			e.printStackTrace();
			return rv.fail("获取是否立案状态失败");
		}
	}
}
