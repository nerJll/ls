package com.aixu.controller;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.bean.AixuBaseLawsuitExample;
import com.aixu.bean.AixuBaseLawsuitExample.Criteria;
import com.aixu.bean.AixuLawsuiDetail;
import com.aixu.entity.EasyUI;
import com.aixu.service.LawSuitBaseService;
import com.aixu.service.TestPoiService;
import com.aixu.util.DateUtil;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("lawsuit")
public class BaseLawSuitController implements ErrorController{
	
	private static final String ERROR_PATH = "/error";
	
	@Autowired
	private LawSuitBaseService baseService;
	
	@Autowired
	private TestPoiService poiService;
	
	@RequestMapping(value="list-all", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public EasyUI listAllLawSuit(@RequestParam(name = "page")Integer page, @RequestParam(name = "rows")Integer size,
			@RequestParam(name = "st", required = false)String st, @RequestParam(name = "ed", required = false)String ed, @RequestParam(name = "customName", required = false)String customName, 
			@RequestParam(name = "customNo", required = false)String customNo, @RequestParam(name = "productType", required = false)String productType, @RequestParam(name = "dutyFactory", required = false)String dutyFactory) {
		// 拼接查询条件
		AixuBaseLawsuitExample example = new AixuBaseLawsuitExample();
		Criteria createCriteria = example.createCriteria();
		if (st != null && ed != null)  createCriteria.andComplainDateBetween(DateUtil.getDateFormat(st), DateUtil.getDateFormat(ed));
		if (customName != null) createCriteria.andCustomNameEqualTo(customName);
		if (customNo != null) createCriteria.andCustomNoLike("%" + customNo + "%");
		if (productType != null) createCriteria.andProductTypeEqualTo(productType);
		if (dutyFactory != null) createCriteria.andDutyFactoryEqualTo(dutyFactory);
		example.setOrderByClause("create_time DESC");
		// 分页
		PageInfo<AixuBaseLawsuit> pageInfo = baseService.listAllAndProduceItem(example, page, size);
		EasyUI easyui = new EasyUI();
		easyui.setRows(pageInfo.getList());
		easyui.setTotal(pageInfo.getTotal());
		return easyui;
	}
	
	@RequestMapping(value="get/{id}", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> listAllLawSuit(@PathVariable String id) {
		Map<String, Object> map = new HashMap<>();
		ArrayList<Object[]> chartData = new ArrayList<>();
		AixuBaseLawsuit baseLawSuitById = baseService.getBaseLawSuitById(id);
		List<AixuLawsuiDetail> zd1s = baseLawSuitById.getZd1s();
		for (AixuLawsuiDetail aixuLawsuiDetail : zd1s) {
			chartData.add(new Object[] {aixuLawsuiDetail.getLawsuitTpye() + "-" + aixuLawsuiDetail.getLawsuitTpyeDetail(),aixuLawsuiDetail.getComplainMount()});
		}
		map.put("bean", baseLawSuitById);
		map.put("charData", chartData);
		return map;
	}
	
	@RequestMapping(value = "/export/excel")
	public void exportExcel(HttpServletRequest req, HttpServletResponse resp) {
		List<AixuBaseLawsuit> list = baseService.listAllAndProduceItem(new AixuBaseLawsuitExample());
		try {
			XSSFWorkbook wb = this.poiService.export(list);
			resp.reset();
			resp.setContentType("application/vnd.ms-excel;charset=UTF-8");    
	        resp.setHeader("Content-disposition", "attachment;filename="+DateUtil.getDateFormat(new Date()).replaceAll("-", "")+"lawsuit.xlsx");    
	        OutputStream ouputStream = resp.getOutputStream();    
	        wb.write(ouputStream);    
	        ouputStream.flush();    
	        ouputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@PostMapping(value = "/upload")
	public void upload(@RequestParam(name = "file")MultipartFile file) {
		String filename = file.getOriginalFilename();
		System.out.println(filename);
		StringBuilder sb = new StringBuilder();
		sb.append("E:/").append(DateUtil.getDateFormat(new Date()).replaceAll("-", ""))
		.append(filename);
		String path = sb.toString();
		System.out.println(path);
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
	
	@RequestMapping(value=ERROR_PATH)  
    public String handleError(){  
        return "test/404"; 
    } 
	
	@ModelAttribute
	public String testModelAttribute() {
		return null;
	}
	
}
