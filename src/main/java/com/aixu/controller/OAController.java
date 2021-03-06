package com.aixu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aixu.bean.AixuCustomDo;
import com.aixu.bean.AixuLawsuiDetail;
import com.aixu.bean.AixuZrrd;
import com.aixu.service.AixuCustomDoService;
import com.aixu.service.BaseInfoDetailService;
import com.aixu.service.CCBaseInfoService;
import com.aixu.service.ZrrdService;
import com.aixu.util.DateUtil;

/**
 * @desc 接收OA传参
 * @date 2017年12月25日
 */

@Controller
@RequestMapping("/oa")
@CrossOrigin("*")
public class OAController {

	private final static Logger logger = LoggerFactory.getLogger(OAController.class);
	@Autowired
	private CCBaseInfoService cCBaseInfoService;
	@Autowired
	private BaseInfoDetailService baseInfoDetailService;
	@Autowired
	private AixuCustomDoService aixuCustomDoService;
	@Autowired
	private ZrrdService zrrdService;

	/**
	 * @desc 是否立案回显
	 * @param lawsuitId
	 * @param checkLA
	 * @param callback
	 * @return
	 */
	@PostMapping("/exam1")
	@ResponseBody
	@CrossOrigin("*")
	public String exam1(@RequestParam("lawsuitId") String lawsuitId, @RequestParam("checkLA") String checkLA) {
		try {
			logger.info("参数={}", lawsuitId + "-->" + checkLA);
			Boolean hasUpdate = cCBaseInfoService.updateOA1checkLA(lawsuitId, checkLA);
			return hasUpdate ? "阶段1-OA审批1，成功！" : "阶段1-OA审批1，失败！";

		} catch (Exception e) {
			logger.info("阶段1-OA审批1，失败！");
			e.printStackTrace();
			return "阶段1-OA审批1，失败！";
		}
	}

	/**
	 * @desc 接收客户处理信息
	 * @param lawsuitId
	 * @param detailsIds
	 * @param badReasons
	 * @param innerStrategys
	 * @param customerIds
	 * @param judgeReduce
	 * @param judgeMount
	 * @param planDate
	 * @return
	 */
	@PostMapping("/exam2")
	@ResponseBody
	@CrossOrigin("*")
	public String exam2(@RequestParam("lawsuitId") String lawsuitId, // 客诉主键
			@RequestParam("detailsIds[]") String[] detailsIds, // 详情主键
			@RequestParam("badReasons[]") String[] badReasons, // 不良原因
			@RequestParam("innerStrategys[]") String[] innerStrategys, // 内部临时对策
			@RequestParam("customerIdss[]") String[] customerIds, // 客户处理主键
			@RequestParam("judgeReduces[]") String[] judgeReduces, // 判定降档
			@RequestParam("judgeMounts[]") String[] judgeMounts, // 判定数量
			@RequestParam("planDates[]") String[] planDates, // 计划日期
			@RequestParam("filePaths[]") String[] filePaths	//文件地址
	) {
		try {
			boolean hasUpdataState = cCBaseInfoService.updataState(lawsuitId, "阶段4-客户处理OA审批完成");

			if (hasUpdataState) {
				// 处理客诉详情
				for (int i = 0; i < detailsIds.length; i++) {
					AixuLawsuiDetail aixuLawsuiDetail = baseInfoDetailService.getAixuLawsuitDetailById(detailsIds[i]);
					aixuLawsuiDetail.setBadReason(badReasons[i].replaceAll("\n", "<br>").replaceAll("\r", "<br>"));
					aixuLawsuiDetail
							.setInnerStrategy(innerStrategys[i].replaceAll("\n", "<br>").replaceAll("\r", "<br>"));
					// 判断是否有文件名
					String resTen = ("").equals(aixuLawsuiDetail.getResTen()) || aixuLawsuiDetail.getResTen() == null ? ""
							: aixuLawsuiDetail.getResTen();
					aixuLawsuiDetail.setResTen(resTen + filePaths[i] + ",");
					baseInfoDetailService.updateDetail(aixuLawsuiDetail);
				}

				// 处理客户处理
				for (int i = 0; i < customerIds.length; i++) {
					AixuCustomDo aixuCustomDo = aixuCustomDoService.getCustomDoById(customerIds[i]);
					aixuCustomDo.setJudgeReduce(judgeReduces[i]);
					aixuCustomDo.setJudgeMount(Integer.parseInt(judgeMounts[i]));
					aixuCustomDo.setPlanDate(DateUtil.getDateFormat(planDates[i]));
					aixuCustomDo.setHandleState("OA审批完成");
					aixuCustomDoService.updateCustomer(aixuCustomDo);
				}
				return "成功";
			} else {
				logger.info("<--OA审批客户处理反馈失败-->");
				return "失败";
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.info("<--OA审批客户处理反馈失败-->");
			return "失败";
		}

	}

	/**
	 * @desc 接收责任认定信息，并更新客诉状态
	 * @param lawsuitId
	 * @param zrrdIds
	 * @param clyjs
	 * @return
	 */
	@PostMapping("/exam3")
	@ResponseBody
	@CrossOrigin("*")
	public String exam3(@RequestParam("lawsuitId") String lawsuitId, @RequestParam("zrrdIds[]") String[] zrrdIds,
			@RequestParam("clyjs[]") String[] clyjs) {
		try {
			boolean hasUpdataState = cCBaseInfoService.updataState(lawsuitId, "阶段5-责任认定OA审批完成");

			if (hasUpdataState) {
				// 更新责任认定
				for (int i = 0; i < zrrdIds.length; i++) {
					AixuZrrd aixuZrrd = zrrdService.getZrrdById(zrrdIds[i]);
					aixuZrrd.setZrrdClyj(clyjs[i]);
					aixuZrrd.setZrrdYl10("已完成");
					zrrdService.updataZrrd(aixuZrrd);
				}
				return "成功";
			} else {
				logger.info("<--OA审批责任认定反馈失败-->");
				return "失败";
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("<--OA审批责任认定反馈失败-->");
			return "失败";
		}
	}

	/**
	 * @desc 接收OQC判定结果
	 * @param lawsuitId
	 * @param OQCjypds
	 * @param OQCpdjgs
	 * @return
	 */
	@PostMapping("/exam4")
	@ResponseBody
	@CrossOrigin("*")
	public String exam4(@RequestParam("lawsuitId") String lawsuitId,
			@RequestParam("customerIds[]") String[] customerIds, @RequestParam("OQCjypds[]") String[] OQCjypds,
			@RequestParam("OQCpdjgs[]") String[] OQCpdjgs) {
		try {
			boolean hasUpdataState = cCBaseInfoService.updataState(lawsuitId, "阶段6-客户处理WMS审批完成");

			if (hasUpdataState) {
				// 处理客户处理
				for (int i = 0; i < customerIds.length; i++) {
					AixuCustomDo aixuCustomDo = aixuCustomDoService.getCustomDoById(customerIds[i]);
					aixuCustomDo.setOqcJudge(OQCjypds[i]);
					aixuCustomDo.setOqcResult(OQCpdjgs[i]);
					aixuCustomDo.setHandleState("WMS审批完成");
					aixuCustomDoService.updateCustomer(aixuCustomDo);
				}
				return "成功";
			} else {
				logger.info("<--接收OQC判定结果反馈失败-->");
				return "失败";
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.info("<--接收OQC判定结果反馈失败-->");
			return "失败";
		}
	}

	/**
	 * @desc 接收OA回传的wen文件,不通过form提交,数据来源：highcharts/test/uploadFile
	 * @param detailId
	 * @param fileName
	 * @param file
	 * @return
	 */
	@PostMapping("/uploadFile")
	@ResponseBody
	@CrossOrigin("*")
	public String oaUploadFile(@RequestParam("detailIds[]") String[] detailIds,
			@RequestParam("filePaths[]") String[] filePaths
	// @RequestParam("file") MultipartFile file
	) {
		try {
			// 存储文件
			// String filePath = cCBaseInfoService.SaveFile(file, fileName) + ",";
			// 存储文件名
			for (int i = 0; i < detailIds.length; i++) {
				AixuLawsuiDetail aixuLawsuiDetail = baseInfoDetailService.getAixuLawsuitDetailById(detailIds[i]);
				// 判断是否有文件名
				String resTen = ("").equals(aixuLawsuiDetail.getResTen()) || aixuLawsuiDetail.getResTen() == null ? ""
						: aixuLawsuiDetail.getResTen();
				aixuLawsuiDetail.setResTen(resTen + filePaths[i] + ",");
				baseInfoDetailService.updateDetail(aixuLawsuiDetail);
			}

			return "文件存储成功";
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("OA回传文件存储失败");
			return "文件存储失败";
		}
	}
}
