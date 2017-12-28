package com.aixu.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aiko.common.util.SystemApi;
import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.bean.AixuCustomDo;
import com.aixu.bean.AixuLawsuiDetail;
import com.aixu.entity.AixuUser;
import com.aixu.entity.ResultValue;
import com.aixu.service.AixuCustomDoService;
import com.aixu.service.BaseInfoDetailService;
import com.aixu.service.CCBaseInfoService;
import com.aixu.util.IDUtils;
import com.aixu.util.OAUtils;

/**
 * @desc 客诉基本信息+客户处理
 * @date 2017年12月14日
 */

@Controller
@RequestMapping("/ccbaseinfo")
public class CCBaseInfoController {
	private final static Logger logger = LoggerFactory.getLogger(CCBaseInfoController.class);
	private static String fileName; // 文件名
	@Autowired
	private CCBaseInfoService cCBaseInfoService;
	@Autowired
	private BaseInfoDetailService baseInfoDetailService;
	@Autowired
	private AixuCustomDoService aixuCustomDoService;

	/**
	 * @desc 填写基本信息
	 * @return
	 */
	@GetMapping("/toAddBaseInfo")
	public String toAddBaseInfo(Model model) {
		String userId = (String) SystemApi.getCurrentUser().get("userid");
		model.addAttribute("userId", userId);
		return "ccbi/addBaseInfo";
	}

	/**
	 * @desc 存储基本信息并提交OA审批
	 * @param aixuBaseLawsuit
	 * @param aixuLawsuiDetails
	 * @param aixuCustomDos
	 * @return
	 */
	@PostMapping(value = "/saveAndSendOA")
	@ResponseBody
	public ResultValue saveAndSendOA(AixuBaseLawsuit aixuBaseLawsuit, HttpServletRequest req) {
		ResultValue rv = new ResultValue();
		try {
			String infoId = IDUtils.getUuid(true); // 基本信息id
			boolean saveBaseInfo = cCBaseInfoService.saveCcBaseInfo(aixuBaseLawsuit, infoId); // 存储基本信息
			logger.info("基本信息={}", aixuBaseLawsuit);

			if (saveBaseInfo) { // 基本信息存储成功才能存储客诉详情
				String[] lawsuitTpyes = req.getParameterValues("lawsuitTpye"); // 客诉类型
				String[] lawsuitTpyeDetails = req.getParameterValues("lawsuitTpyeDetail"); // 客诉类型具体
				String[] complainMounts = req.getParameterValues("complainMount"); // 投诉数量
				String[] productDescs = req.getParameterValues("productDesc"); // 产品内容描述
				List<AixuLawsuiDetail> aixuLawsuiDetails = new ArrayList<>(lawsuitTpyes.length); // 客诉详情list
				for (int i = 0; i < lawsuitTpyes.length; i++) {
					AixuLawsuiDetail aixuLawsuiDetail = new AixuLawsuiDetail(); // 每一个客诉详情
					aixuLawsuiDetail.setLawsuitTpye(lawsuitTpyes[i]); // 客诉类型
					aixuLawsuiDetail.setLawsuitTpyeDetail(lawsuitTpyeDetails[i]); // 客诉类型具体
					if (!"".equals(complainMounts[i])) {
						aixuLawsuiDetail.setComplainMount(Integer.parseInt(complainMounts[i])); // 投诉数量
					}
					aixuLawsuiDetail.setProductDesc(productDescs[i]); // 产品内容描述
					aixuLawsuiDetail.setBaseId(infoId); // 基本信息id
					aixuLawsuiDetail.setId(IDUtils.getUuid(true)); // 表单id
					aixuLawsuiDetail.setCreateTime(new Date()); // 创建时间
					aixuLawsuiDetails.add(aixuLawsuiDetail); // 加入list
				}
				baseInfoDetailService.saveBaseInfoDetail(aixuLawsuiDetails); // service存储客诉详情
				logger.info("客诉详情={}", aixuLawsuiDetails);

				// 基本信息存储成功才能存储客户处理
				String[] types = req.getParameterValues("type"); // 处理方式
				String[] customReduces = req.getParameterValues("customReduce"); // 客户要求-降档
				String[] customMounts = req.getParameterValues("customMount"); // 客户要求-数量
				String[] judgeReduces = req.getParameterValues("judgeReduce"); // 判定结果-降档
				String[] judgeMounts = req.getParameterValues("judgeMount"); // 判定结果-数量
				String[] planDates = req.getParameterValues("planDate"); // 计划完成时间
				List<AixuCustomDo> aixuCustomDos = new ArrayList<>(types.length);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				for (int i = 0; i < types.length; i++) {
					AixuCustomDo aixuCustomDo = new AixuCustomDo(); // 每一个客户处理
					aixuCustomDo.setType(types[i]); // 处理方式
					aixuCustomDo.setCustomReduce(customReduces[i]); // 客户要求-降档
					if (!"".equals(customMounts[i])) {
						aixuCustomDo.setCustomMount(Integer.parseInt(customMounts[i]));// 客户要求-数量
					}
					aixuCustomDo.setJudgeReduce(judgeReduces[i]); // 判定结果-降档
					if (!"".equals(judgeMounts[i])) {
						aixuCustomDo.setJudgeMount(Integer.parseInt(judgeMounts[i])); // 判定结果-数量
					}
					aixuCustomDo.setPlanDate(sdf.parse(planDates[i])); // 计划完成时间
					aixuCustomDo.setBaseId(infoId); // 基本信息id
					aixuCustomDo.setId(IDUtils.getUuid(true)); // 表单id
					aixuCustomDo.setCreateTime(new Date()); // 创建时间
					aixuCustomDos.add(aixuCustomDo); // 加入list
				}
				aixuCustomDoService.saveAixuCustomDo(aixuCustomDos); // service存储客户处理
				logger.info("客户处理={}", aixuCustomDos);

				// 当前登陆人
				AixuUser user = new AixuUser();
				user.setUserId(req.getParameter("OAId"));
				user.setCompany(req.getParameter("company"));
				user.setPosition((String) SystemApi.getCurrentUser().get("position"));
				user.setPhoneNo((String) SystemApi.getCurrentUser().get("mobile"));
				user.setDepId((String) SystemApi.getCurrentUser().get("deptid"));
				
				//将当前登陆人存进session
				/*HttpSession session = req.getSession();		
				session.setAttribute("user", user);*/
				
				// 触发OA审批
				AixuBaseLawsuit aixuBaseLawsuit1 = cCBaseInfoService.getBaseInfoById(infoId);
				List<AixuLawsuiDetail> aixuLawsuiDetails1 = baseInfoDetailService.getDetilByBaseId(infoId);
				List<AixuCustomDo> aixuCustomDos1 = aixuCustomDoService.getCustomDoByBaseId(infoId);
				OAUtils.sendOABaseInfo1("722", user.getUserId(), aixuBaseLawsuit1, 
						aixuLawsuiDetails1, aixuCustomDos1,user);
			} else {
				return rv.fail("基本信息传输失败，请填写完整信息", null);
			}

			return rv.success("基本信息传输成功！", infoId);

		} catch (Exception e) {
			e.printStackTrace();
			return rv.fail("基本信息传输失败，请填写完整信息", null);
		}
	}

	/**
	 * @desc 上传单个文件
	 * @param file
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@PostMapping(value = "/uploadFile", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ResultValue uploadFile(@RequestParam("file") MultipartFile file) throws UnsupportedEncodingException {
		ResultValue rv = new ResultValue();
		// String name = file.getName() + URLDecoder.decode(file.getOriginalFilename(),
		// "UTF-8");
		try {
			String fileInfo = cCBaseInfoService.SaveFile(file, fileName); // 存储文件并返回文件信息：路径+文件名
			return rv.success("上传成功！", fileInfo);
		} catch (Exception e) {
			e.printStackTrace();
			return rv.fail("上传失败！", null);
		}
	}

	/**
	 * @desc 删除文件
	 * @param file
	 * @return
	 */
	@PostMapping("/deleteFile")
	@ResponseBody
	public ResultValue deleteFile(@RequestParam("file") MultipartFile file) {
		ResultValue rv = new ResultValue();
		try {
			cCBaseInfoService.deleteFile(file); // 存储文件并返回文件信息：路径+文件名
			return rv.success("删除成功！", null);
		} catch (Exception e) {
			e.printStackTrace();
			return rv.fail("删除失败！", null);
		}
	}

	/**
	 * @desc 更新文件名
	 * @param fileName
	 * @return
	 */
	@PutMapping("/postFileName")
	@ResponseBody
	public synchronized ResultValue postFileName(@RequestParam("filename") String filename) {
		ResultValue rv = new ResultValue();
		try {
			fileName = filename;
			return rv.success("更新成功！", null);
		} catch (Exception e) {
			e.printStackTrace();
			return rv.fail("更新失败！", null);
		}
	}

	/**
	 * @desc 获取客诉单编号
	 * @param zrgc
	 * @return
	 */
	@GetMapping("/getLawsuitNo")
	@ResponseBody
	public ResultValue getLawsuitNo(@RequestParam("zrgc") String zrgc) {
		ResultValue rv = new ResultValue();
		try {
			String lawsuitNo = cCBaseInfoService.getLawsuitNo(zrgc);
			return rv.success("获取客诉单编号成功", lawsuitNo);
		} catch (Exception e) {
			e.printStackTrace();
			return rv.fail("获取客诉单编号失败", null);
		}
	}
}
