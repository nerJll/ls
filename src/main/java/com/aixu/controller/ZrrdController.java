package com.aixu.controller;
/**
* @desc	责任认定
* @date 2017年12月25日
*/

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiko.common.util.SystemApi;
import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.bean.AixuLawsuiDetail;
import com.aixu.bean.AixuZrrd;
import com.aixu.entity.AixuUser;
import com.aixu.entity.ResultValue;
import com.aixu.service.BaseInfoDetailService;
import com.aixu.service.CCBaseInfoService;
import com.aixu.service.ZrrdService;
import com.aixu.util.OAUtils;

@Controller
@RequestMapping("/zrrd")
public class ZrrdController {

	private final static Logger logger = LoggerFactory.getLogger(ZrrdController.class);
	@Autowired
	private CCBaseInfoService cCBaseInfoService;
	@Autowired
	private BaseInfoDetailService baseInfoDetailService;
	@Autowired
	private ZrrdService zrrdService;
	
	/**
	 * @desc  跳转责任认定
	 * @param lawsuitId
	 * @param model
	 * @return
	 */
	@PostMapping("/index")
	public String index(@RequestParam("lawsuitId")String lawsuitId,
			Model model) {
		try {
			AixuBaseLawsuit aixuBaseLawsuit = cCBaseInfoService.getBaseInfoById(lawsuitId);
			List<AixuLawsuiDetail> aixuLawsuiDetails = baseInfoDetailService.getDetilByBaseId(lawsuitId);
			
			model.addAttribute("aixuBaseLawsuit",aixuBaseLawsuit);
			model.addAttribute("aixuLawsuiDetails",aixuLawsuiDetails);
			
			String userId = (String) SystemApi.getCurrentUser().get("userid");	//当前登陆人id
			model.addAttribute("userId", userId);
			
			String[] fileSrcs = aixuBaseLawsuit.getFileSrc().split(","); // 文件地址
			model.addAttribute("fileSrcs",fileSrcs);
			
			List<AixuZrrd> aixuZrrds = zrrdService.getAixuZrrdByksId(aixuBaseLawsuit.getId());	//责任认定
			model.addAttribute("aixuZrrds",aixuZrrds);
			
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
			
			if(aixuZrrds.size() == 0) {
				return "ccbi/zrrd";
			}else {
				return "ccbi/zrrd2";
			}
		}catch(Exception e) {
			e.printStackTrace();
			logger.info("<--责任认定-获取客诉信息失败-->");
			return "ccbi/zrrd";
		}
	}
	
	/**
	 * @desc  责任认定提交OA
	 * @param aixuBaseLawsuit
	 * @param req
	 * @return
	 */
	@PostMapping("/sendZRRD")
	@ResponseBody
	public ResultValue sendZRRD(@RequestParam("infoId")String infoId) {
		ResultValue rv = new ResultValue();
		return rv.success("数据提交成功",infoId);
	}
	
	/**
	 * @desc  推送各个部门责任认定
	 * @param infoId
	 * @param OAId
	 * @param company
	 * @param zrrdZrbm
	 * @param zrrdZrr
	 * @param zrrdYl1
	 * @param zrrdClyj
	 * @param req
	 * @return
	 */
	@PostMapping("/sendZRBM")
	@ResponseBody
	public ResultValue sendZRBM(@RequestParam("infoId")String infoId,
			@RequestParam("OAId")String OAId,
			@RequestParam("company")String company,
			@RequestParam("zrrdZrbm")String zrrdZrbm,
			@RequestParam("zrrdZrr")String zrrdZrr,
			@RequestParam("zrrdYl1")String zrrdYl1,
			@RequestParam("zrrdClyj")String zrrdClyj) {
		ResultValue rv = new ResultValue();
		try {
			//三个信息：客诉基本信息、详情、客户处理
			AixuBaseLawsuit aixuBaseLawsuit = cCBaseInfoService.getBaseInfoById(infoId);
			List<AixuLawsuiDetail> aixuLawsuiDetails = baseInfoDetailService.getDetilByBaseId(infoId);
			//更新客诉状态
			boolean hasUpdate = cCBaseInfoService.updataState(infoId, "阶段3-OA审批中");
			
			List<AixuZrrd> aixuZrrds = new ArrayList<>();
			//存储责任认定
			AixuZrrd aixuZrrd = new AixuZrrd();
			aixuZrrd.setZrrdZrbm(zrrdZrbm);
			aixuZrrd.setZrrdZrr(zrrdZrr.replaceAll("\n","<br>").replaceAll("\r","<br>"));
			aixuZrrd.setZrrdYl1(zrrdYl1.replaceAll("\n","<br>").replaceAll("\r","<br>"));
			aixuZrrd.setZrrdClyj(zrrdClyj.replaceAll("\n","<br>").replaceAll("\r","<br>"));
			aixuZrrd.setZrrdKsgldid(aixuBaseLawsuit.getId());
			aixuZrrds.add(aixuZrrd);
			
			if(hasUpdate) {
				zrrdService.saveAixuZrrd(aixuZrrds);
			}
			// 当前登陆人
			AixuUser user = new AixuUser();
			user.setUserId(OAId);
			user.setCompany(company);
			user.setPosition((String) SystemApi.getCurrentUser().get("position"));
			user.setPhoneNo((String) SystemApi.getCurrentUser().get("mobile"));
			user.setDepId((String) SystemApi.getCurrentUser().get("deptid"));
			
			//触发OA审批2 
			if(hasUpdate) {
				OAUtils.sendOABaseInfo3("760", user.getUserId(), aixuBaseLawsuit, 
						aixuLawsuiDetails, aixuZrrds, user);
				return rv.success("数据提交成功",aixuBaseLawsuit.getId());
			}else {
				return rv.fail("触发OA审批3失败",null);
			}
		}catch(Exception e) {
			e.printStackTrace();
			logger.info("<--责任认定推送责任部门出错-->");
			return rv.fail("触发OA审批3失败",null);
		} 
	}
}

