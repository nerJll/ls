package com.aixu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.dao.AixuBaseLawsuitMapper;
import com.aixu.entity.AixuUser;
import com.aixu.entity.ResultValue;
import com.aixu.service.CCBaseInfoService;
import com.aixu.util.OAUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * @desc 测试Controller
 * @date 2017年12月13日
 */
@Controller
@RequestMapping("/test")
public class TestController {
	
	private final static Logger logger = LoggerFactory.getLogger(TestController.class);
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/test1")
	public String test1() {
		return "test/test1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test/testlayui";
	}
	
	/**
	 * @desc  测试jsonp
	 * @param param
	 * @param callback
	 * @return
	 */
	@GetMapping("/getJsonp")
	@ResponseBody
	public Object getJsonp(@RequestParam("param")String param,String callback) {
		logger.info("参数={}",param); 
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue("成功"); 
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}
	
	@GetMapping("index")
	public String toIndex() {
		return "test/index";
	}
	
	@GetMapping("testOA")
	@ResponseBody
	public ResultValue testOA() {
		ResultValue rv = new ResultValue();
		try {
			OAUtils.sendOABaseInfo1("755","1548",null,null,null,null);
			return rv.success("触发OA成功", null); 
		}catch(Exception e) {
			e.printStackTrace();
			logger.info("<--触发OA审批出错-->");
			return rv.fail("触发OA出错", null);
		}
	}
	
	@GetMapping("testSend")
	public String testSend() {
		return "test/send";
	}
	
	public void test(HttpServletRequest req) {
		HttpSession session = req.getSession();
		AixuUser user = new AixuUser();
		user.setUserId("00");
		user.setCompany("01");
		user.setPosition("02");
		user.setPhoneNo("03");
		user.setDepId("04");
		session.setAttribute("user", user);
		
		String url = "http://portal.aikosolar.com/aiko-oa/oaInerface/getHrmResource?loginid=1016046";
		Object object = restTemplate.getForObject(url, Object.class);
		String json = new Gson().toJson(object);
		JsonElement parse = new JsonParser().parse(json);
		
		System.out.println(parse.getAsJsonObject().get("data").getAsJsonObject().get("id"));
	}
	
	@GetMapping("/testZrrd")
	public String testZrrd() { 
		return "test/send2";
	}
	
	@GetMapping("/scan")
	public String scan() {
		return "test/scan"; 
	}
}
