package com.aixu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aixu.bean.AixuBadReason;
import com.aixu.service.BadReasonService;

@RestController
@RequestMapping("reason")
public class BadReasonController {
	@Autowired
	private BadReasonService badReasonService;
	
	@GetMapping(value = "parent", produces = "application/json;charset=UTF-8")
	public List<AixuBadReason> getParent() {
		return badReasonService.getParentReason();
	}
	
	@GetMapping(value = "sons/{parentId}", produces = "application/json;charset=UTF-8")
	public List<AixuBadReason> getSon(@PathVariable Integer parentId) {
		return badReasonService.getSonReason(parentId);
	}
}
