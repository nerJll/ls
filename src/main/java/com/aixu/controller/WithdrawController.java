package com.aixu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @desc	客户投诉单
* @date 2018年1月2日
*/

@Controller
@RequestMapping("/withdraw")
public class WithdrawController {
	
	@GetMapping("/index")
	public String index() {
		return "ccbi/withdraw";
	}
}

