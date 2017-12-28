package com.aixu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.aiko.common.util.SystemApi;
import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.bean.AixuLawsuiDetail;
import com.aixu.bean.AixuNbfxpcl;
import com.aixu.bean.AixuNbzgdc;
import com.aixu.bean.AixuNbzgxgyz;
import com.aixu.entity.AixuUser;
import com.aixu.service.LawSuitBaseService;
import com.aixu.service.ReformService;
import com.aixu.util.IDUtils;
import com.aixu.util.OAUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

@Controller
@RequestMapping("reform")
public class ReformStateController {
	
	@Autowired
	private LawSuitBaseService baseService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ReformService reformService;
	
	@RequestMapping("to-nbzg")
	public String toTestUpload(@RequestParam(name = "baseId",required = false) String id, Model model) {
		AixuBaseLawsuit baseLawsuit = baseService.getBaseLawSuitById(id);
		model.addAttribute("aixuBaseLawsuit", baseLawsuit);
		String[] fileSrcs = baseLawsuit.getFileSrc().split(","); // 文件地址
		model.addAttribute("fileSrcs",fileSrcs);
		return "nbzg/nbzg";
	}
	
	@RequestMapping(value  = "save", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> sendToOA(@RequestParam(name = "baseId") String id, HttpServletRequest req) {
		List<AixuNbfxpcl> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		String[] pl = req.getParameterValues("nbfxpclPl");
		String[] xh = req.getParameterValues("nbfxpclXh");
		String[] sl = req.getParameterValues("nbfxpclSl");
		String[] kw = req.getParameterValues("nbfxpclKw");
		for (int i = 0; i < pl.length; i++) {
			AixuNbfxpcl dangerous = new AixuNbfxpcl();
			dangerous.setNbfxpclId(IDUtils.getUuid(true));
			dangerous.setNbfxpclKsgldid(id);
			dangerous.setNbfxpclPl(pl[i]);
			dangerous.setNbfxpclXh(xh[i]);
			dangerous.setNbfxpclSl(Integer.valueOf(sl[i]));
			dangerous.setNbfxpclKw(kw[i]);
			list.add(dangerous);
		}
		reformService.saveReform(list);
		// oa
		AixuBaseLawsuit lawsuit = baseService.getBaseLawSuitById(id);
		List<AixuLawsuiDetail> zd1s = lawsuit.getZd1s();
		String userid = (String)SystemApi.getCurrentUser().get("userid");
		String url = "http://portal.aikosolar.com/aiko-oa/oaInerface/getHrmResource?loginid=" + userid;
		Object oaUser = restTemplate.getForObject(url, Object.class);
		String json = new Gson().toJson(oaUser);
		JsonElement parse = new JsonParser().parse(json);
		JsonElement uid = parse.getAsJsonObject().get("data").getAsJsonObject().get("id");
		JsonElement comp = parse.getAsJsonObject().get("data").getAsJsonObject().get("subcompanyname");
		AixuUser user = new AixuUser();
		user.setCompany(comp.toString().substring(1, 5));
		user.setUserId(uid.toString());
		user.setDepId((String) SystemApi.getCurrentUser().get("deptid"));
		user.setPhoneNo((String) SystemApi.getCurrentUser().get("mobile"));
		user.setPosition((String) SystemApi.getCurrentUser().get("position"));
		OAUtils.sendOABaseInfo2("742", user.getUserId(), lawsuit, zd1s, list, user);// 742 737
		map.put("msg", "ok");
		return map;
	}
	
	@RequestMapping("rebound/nbfxpcl")
	public String toReboundPgge(@RequestBody List<AixuNbfxpcl> dangrous,
			@RequestBody List<AixuNbzgdc> dc, @RequestBody List<AixuNbzgxgyz> xgyz, Model model) {
		if (!dangrous.isEmpty() && dangrous != null && !dc.isEmpty() && dc != null && !xgyz.isEmpty() && xgyz != null) {
			String baseId = dangrous.get(0).getNbfxpclKsgldid();
			AixuBaseLawsuit baseLaw = baseService.getBaseLawSuitById(baseId);
			List<AixuLawsuiDetail> zd1s = baseLaw.getZd1s();
			model.addAttribute("zd1", zd1s);
			model.addAttribute("dangrous", dangrous);
			model.addAttribute("dcs", dc);
			model.addAttribute("xgyzs", xgyz);
		}
		JsonElement jsonTree = new Gson().toJsonTree(model);
		return null;
	}
}
