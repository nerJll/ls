package com.aixu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;


@Controller
public class RouterController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("index")
	public String toIndex(HttpServletRequest req) {
		String url = "http://portal.aikosolar.com/aiko-oa/oaInerface/getHrmResource?loginid=1016046";
		Object object = restTemplate.getForObject(url, Object.class);
		String json = new Gson().toJson(object);
		JsonElement parse = new JsonParser().parse(json);
		
		System.out.println(parse.getAsJsonObject().get("data").getAsJsonObject().get("id"));
		return "test/index";
	}
	
	@RequestMapping("select")
	public String toTestDoubleSelect() {
		return "test/select";
	}
	
	@RequestMapping("not-found")
	public String to404Page() {
		return "test/404";
	}
	
	@RequestMapping("change-good")
	public String toReturnGoodPage() {
		return "test/return-goods-view";
	}
	
	@RequestMapping("to-backgroud")
	public String toSemmeticUi() {
		return "backgroud-info/backgroud-info";
	}
	
	@RequestMapping("to-testupload")
	public String toTestUpload() {
		return "test/test-upload";
	}
}
