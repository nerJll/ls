package com.aixu.controller;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
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
import com.aixu.service.BaseInfoDetailService;
import com.aixu.service.LawSuitBaseService;
import com.aixu.service.ReformService;
import com.aixu.service.StrategyService;
import com.aixu.service.VerifyService;
import com.aixu.util.DateUtil;
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
	
	@Autowired
	private StrategyService strategyService;
	
	@Autowired
	private VerifyService verifyService;
	
	@Autowired
	private BaseInfoDetailService baseInfoDetailService;
	
	@RequestMapping("to-nbzg")
	public String toTestUpload(@RequestParam(name = "baseId",required = false) String id, Model model) {
		AixuBaseLawsuit baseLawsuit = baseService.getBaseLawSuitById(id);
		List<AixuLawsuiDetail> aixuLawsuiDetails = baseInfoDetailService.getDetilByBaseId(id);
		model.addAttribute("aixuBaseLawsuit", baseLawsuit);
		String[] fileSrcs = baseLawsuit.getFileSrc().split(","); // 文件地址
		model.addAttribute("fileSrcs",fileSrcs);
		//OA回传文件地址
		List<String[]> fileSrcs1 = new ArrayList<>(aixuLawsuiDetails.size());				//OA上传文件地址
		for(AixuLawsuiDetail aixuLawsuiDetail : aixuLawsuiDetails) {
			String filePaths = aixuLawsuiDetail.getResTen();
			String[] fileSrcs2 = null;
			if(!"".equals(filePaths) && filePaths != null) {
				fileSrcs2 = aixuLawsuiDetail.getResTen()
						.substring(0, aixuLawsuiDetail.getResTen().length()-1)
						.split(",");
				for(int i=0; i<fileSrcs2.length; i++) {
					fileSrcs2[i] = fileSrcs2[i].replace("\\", "/");
				}
			}
			
			fileSrcs1.add(fileSrcs2);
			
		}
		model.addAttribute("fileSrcs1",fileSrcs1);
		if ("审批完成".equals(baseLawsuit.getResSix())) { // 进度条数据模型
			List<AixuNbfxpcl> zd3 = baseLawsuit.getZd3();
			int element = 0;
			int element1 = 0;
			int element2 = 0;
			for (AixuNbfxpcl aixuNbfxpcl : zd3) {
				if ("已处理".equals(aixuNbfxpcl.getNbfxpclZt())) {
					element++;
				}
			}
			double j = element / zd3.size();
			NumberFormat percentInstance = NumberFormat.getPercentInstance();
			percentInstance.format(j);
			
			List<AixuNbzgdc> zd4 = baseLawsuit.getZd4();
			/*for (AixuNbzgdc aixuNbzgdc : zd4) {
				if ("已完成".equals(aixuNbzgdc.getNbzgdcZt())) {
					element1++;
				}
			}*/
			double k = element / zd4.size();
			
			return "nbzg/nbzg-rebound1";
		} else if ("OA审批中".equals(baseLawsuit.getResSix())) {
			return "nbzg/nbzg-ing";
		} else {
			return "nbzg/nbzg"; 
		}
		
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
		OAUtils.sendOABaseInfo2("754", user.getUserId(), lawsuit, zd1s, list, user);// 742 737
		// 更新状态
		lawsuit.setResSix("OA审批中");
		baseService.updateBaseLawSuit(lawsuit);
		
		map.put("msg", "ok");
		return map;
	}
	
	/*@RequestMapping("rebound/nbfxpcl")
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
	}*/
	
	
	/**
	 * @param col1-11 内部风险品处理
	 * @param col2-18
	 * @param col19-24
	 * @return
	 */
	@PostMapping("/recieve")
	@CrossOrigin("*")
	public String recieveOA(@RequestParam(name = "ksId", required =false) String ksId, @RequestParam(name = "col1[]", required =false) String[] col1, @RequestParam(name = "col2", required =false) String[] col2,
			@RequestParam(name = "col3[]", required = false) String[] col3, @RequestParam(name = "col4[]", required = false) String[] col4, 
			@RequestParam(name = "col5[]", required = false) String[] col5, @RequestParam(name = "col6[]", required = false) String[] col6,
			@RequestParam(name = "col7[]", required = false) String[] col7, @RequestParam(name = "col8[]", required = false) String[] col8,
			@RequestParam(name = "col9[]", required = false) String[] col9, @RequestParam(name = "col10[]", required = false) String[] col10,
			@RequestParam(name = "col11[]", required = false) String[] col11, @RequestParam(name = "col12[]", required = false) String[] col12,
			@RequestParam(name = "col13[]", required = false) String[] col13, @RequestParam(name = "col14[]", required = false) String[] col14,
			@RequestParam(name = "col15[]", required = false) String[] col15, @RequestParam(name = "col16[]", required = false) String[] col16,
			@RequestParam(name = "col17[]", required = false) String[] col17, @RequestParam(name = "col18[]", required = false) String[] col18,
			@RequestParam(name = "col19[]", required = false) String[] col19, @RequestParam(name = "col20[]", required = false) String[] col20,
			@RequestParam(name = "col21[]", required = false) String[] col21, @RequestParam(name = "col22[]", required = false) String[] col22,
			@RequestParam(name = "col23[]", required = false) String[] col23, @RequestParam(name = "col24[]", required = false) String[] col24,
			HttpServletResponse resp, Model model) {
		
		AixuBaseLawsuit baseLawSuit = baseService.getBaseLawSuitById(ksId);
		baseLawSuit.setLawsuitDanState("");
		
		for (int i = 0; i < col1.length; i++) { // 风险品处理
			AixuNbfxpcl danger = new AixuNbfxpcl();
			danger.setNbfxpclPl(col1[i]);
			danger.setNbfxpclXh(col2[i]);
			danger.setNbfxpclSl(Integer.valueOf(col3[i]));
			danger.setNbfxpclKw(col4[i]);
			danger.setNbfxpclClyj(col5[i]);
			danger.setNbfxpclRdbm(col6[i]);
			danger.setNbfxpclCljg(col7[i]);
			danger.setNbfxpclClbm(col8[i]);
			danger.setNbfxpclZt(col9[i]);
			danger.setNbfxpclId(col10[i]);
			danger.setNbfxpclKsgldid(col11[i]);
			//baseService.updateBaseLawSuit(baseLawSuit);
			reformService.updateReform(danger);
		}
		
		for (int i = 0; i < col12.length; i++) { // 内部整改对策
			AixuNbzgdc dc = new AixuNbzgdc();
			dc.setNbzgdcId(IDUtils.getUuid(true));
			dc.setNbzgdcKsgldid(ksId);
			dc.setNbzgdcXh(Integer.valueOf(col12[i]));
			dc.setNbzgdcLx(col13[i]);
			dc.setNbzgdcFa(col14[i]);
			dc.setNbzgdcZrbm(col15[i]);
			dc.setNbzgdcZrr(col16[i]);
			dc.setNbzgdcWcsj(DateUtil.getDateFormat(col17[i]));
			dc.setNbzgdcZt(col18[i]);
			strategyService.saveStrategy(dc);
		}
		
		for (int i = 0; i < col19.length; i++) { // 效果验证
			AixuNbzgxgyz xgyz = new AixuNbzgxgyz();
			xgyz.setNbzgxgyzId(IDUtils.getUuid(true));
			xgyz.setNbzgxgyzKsgldid(ksId);
			xgyz.setNbzgxgyzLx(col19[i]);
			xgyz.setNbzgxgyzYzjg(col20[i]);
			xgyz.setNbzgxgyzZrbm(col21[i]);
			xgyz.setNbzgxgyzZrr(col22[i]);
			xgyz.setNbzgxgyzWcsj(DateUtil.getDateFormat(col23[i]));
			xgyz.setNbzgxgyzZt(col24[i]);
			verifyService.saveVerify(xgyz);
		}
		
		return null;
	}
	
	
	//public 
}
