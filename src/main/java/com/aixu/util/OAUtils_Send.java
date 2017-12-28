package com.aixu.util;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.aixu.oa.workflow.WorkflowDetailTableInfo;
import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.bean.AixuCustomDo;
import com.aixu.bean.AixuLawsuiDetail;
import com.aixu.bean.AixuNbfxpcl;
import com.aixu.bean.AixuZrrd;
import com.aixu.entity.AixuUser;
import com.aixu.oa.workflow.WorkflowBaseInfo;
import com.aixu.oa.workflow.WorkflowMainTableInfo;
import com.aixu.oa.workflow.WorkflowRequestInfo;
import com.aixu.oa.workflow.WorkflowRequestTableField;
import com.aixu.oa.workflow.WorkflowRequestTableRecord;
import com.aixu.oa.workflow.WorkflowServicePortTypeProxy;

/**
 * @desc 执行触发OA
 * @date 2017年12月19日
 */

public class OAUtils_Send {

	/**
	 * @desc 发送基本信息+客诉详情+客户处理
	 * @param mainTable
	 * @param itemTable
	 * @param workflowId
	 * @param createId
	 * @return
	 */
	public static String sendOABaseInfo1(Map<String, String> mainTable, List<Map<String, String>> itemTable,
			String workflowId, int createId, AixuBaseLawsuit aixuBaseLawsuit, // 客诉基本信息
			List<AixuLawsuiDetail> aixuLawsuiDetails, // 客诉详情
			List<AixuCustomDo> aixuCustomDos, AixuUser user) { // 客户处理
		String result = "0";
		WorkflowMainTableInfo workflowMainTableInfo = null;
		WorkflowRequestInfo requestInfo = new WorkflowRequestInfo();
		WorkflowBaseInfo workflowBaseInfo = new WorkflowBaseInfo();
		workflowBaseInfo.setWorkflowId(workflowId);// 流程对应的id
		requestInfo.setCanEdit(true);
		requestInfo.setCanView(true);
		requestInfo.setWorkflowBaseInfo(workflowBaseInfo);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			if (mainTable != null && !mainTable.isEmpty()) {
				// 主表单信息
				// 主表字段信息
				// WorkflowRequestTableField[] wtfs = new
				// WorkflowRequestTableField[mainTable.size()];//mainTable.size()
				WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[40];
				wrti[0] = new WorkflowRequestTableField();
				wrti[0].setFieldName("sqr");// 申请人
				// wrti[0].setFieldValue("1551");// 1551--陈明霞 1552-任博文 1548--姜林乐
				wrti[0].setFieldValue(user.getUserId());// 1551--陈明霞 1552-任博文 1548--姜林乐
				wrti[0].setView(true);
				wrti[0].setEdit(true);

				wrti[1] = new WorkflowRequestTableField();
				wrti[1].setFieldName("depId");// 部门号
				// wrti[1].setFieldValue("255");
				wrti[1].setFieldValue(user.getDepId());
				wrti[1].setView(true);
				wrti[1].setEdit(true);

				wrti[2] = new WorkflowRequestTableField();
				wrti[2].setFieldName("position");// 职位
				// wrti[2].setFieldValue("管培生");//
				wrti[2].setFieldValue(user.getPosition());//
				wrti[2].setView(true);// 字段是否可见
				wrti[2].setEdit(true);// 字段是否可编辑

				wrti[3] = new WorkflowRequestTableField();
				wrti[3].setFieldName("company");// 所属公司
				// wrti[3].setFieldValue("浙江爱旭");
				wrti[3].setFieldValue(user.getCompany());
				wrti[3].setView(true);
				wrti[3].setEdit(true);

				wrti[4] = new WorkflowRequestTableField();
				wrti[4].setFieldName("empPhNo");// 手机号
				// wrti[4].setFieldValue("18270884103");
				wrti[4].setFieldValue(user.getPhoneNo());
				wrti[4].setView(true);
				wrti[4].setEdit(true);

				wrti[5] = new WorkflowRequestTableField();
				wrti[5].setFieldName("aixu_base_lawsuit");// 主键id
				wrti[5].setFieldValue(aixuBaseLawsuit.getId());
				wrti[5].setView(true);
				wrti[5].setEdit(true);

				wrti[6] = new WorkflowRequestTableField();
				wrti[6].setFieldName("lawsuit_no");// 客诉单编号
				wrti[6].setFieldValue(aixuBaseLawsuit.getLawsuitNo());
				wrti[6].setView(true);
				wrti[6].setEdit(true);

				wrti[7] = new WorkflowRequestTableField();
				wrti[7].setFieldName("custom_name");// 客户名称
				wrti[7].setFieldValue(aixuBaseLawsuit.getCustomName());
				wrti[7].setView(true);
				wrti[7].setEdit(true);

				wrti[8] = new WorkflowRequestTableField();
				wrti[8].setFieldName("custom_no");// 客户编号
				wrti[8].setFieldValue(aixuBaseLawsuit.getCustomNo());
				wrti[8].setView(true);
				wrti[8].setEdit(true);

				wrti[9] = new WorkflowRequestTableField();
				wrti[9].setFieldName("complain_date");// 投诉日期
				wrti[9].setFieldValue(sdf.format(aixuBaseLawsuit.getComplainDate()));
				wrti[9].setView(true);
				wrti[9].setEdit(true);

				wrti[10] = new WorkflowRequestTableField();
				wrti[10].setFieldName("product_type");// 产品型号
				wrti[10].setFieldValue(aixuBaseLawsuit.getProductType());
				wrti[10].setView(true);
				wrti[10].setEdit(true);

				wrti[11] = new WorkflowRequestTableField();
				wrti[11].setFieldName("product_no");// 产品编码
				wrti[11].setFieldValue(aixuBaseLawsuit.getProductNo());
				wrti[11].setView(true);
				wrti[11].setEdit(true);

				wrti[12] = new WorkflowRequestTableField();
				wrti[12].setFieldName("deliver_seq");// 发货批次
				wrti[12].setFieldValue(aixuBaseLawsuit.getDeliverSeq());
				wrti[12].setView(true);
				wrti[12].setEdit(true);

				wrti[13] = new WorkflowRequestTableField();
				wrti[13].setFieldName("sales_no");// 销售订单编号
				wrti[13].setFieldValue(aixuBaseLawsuit.getSalesNo());
				wrti[13].setView(true);
				wrti[13].setEdit(true);

				wrti[14] = new WorkflowRequestTableField();
				wrti[14].setFieldName("duty_factory");// 责任工厂
				wrti[14].setFieldValue(aixuBaseLawsuit.getDutyFactory());
				wrti[14].setView(true);
				wrti[14].setEdit(true);

				/*
				 * wrti[15] = new WorkflowRequestTableField();
				 * wrti[15].setFieldName("apply_name");// 申请人姓名
				 * wrti[15].setFieldValue(aixuBaseLawsuit.getApplyName());
				 * wrti[15].setView(true); wrti[15].setEdit(true);
				 * 
				 * wrti[16] = new WorkflowRequestTableField();
				 * wrti[16].setFieldName("apply_no");// 申请人工号
				 * wrti[16].setFieldValue(aixuBaseLawsuit.getApplyNo()); wrti[16].setView(true);
				 * wrti[16].setEdit(true);
				 */

				wrti[17] = new WorkflowRequestTableField();
				wrti[17].setFieldName("is_need_rep");// 客户是否需要报告
				wrti[17].setFieldValue(aixuBaseLawsuit.getIsNeedRep());
				wrti[17].setView(true);
				wrti[17].setEdit(true);

				wrti[18] = new WorkflowRequestTableField();
				wrti[18].setFieldName("lawsuit_state");// 客诉状态
				wrti[18].setFieldValue(aixuBaseLawsuit.getLawsuitDanState());
				wrti[18].setView(true);
				wrti[18].setEdit(true);

				wrti[19] = new WorkflowRequestTableField();
				wrti[19].setFieldName("create_time"); // 创建日期
				wrti[19].setFieldValue(sdf.format(aixuBaseLawsuit.getCreateTime()));
				wrti[19].setView(true);
				wrti[19].setEdit(true);

				String fileType = "jpeg,bmp,gif,jpg,psd,png,tiff,tga,eps"; 										//文件格式
				String[] paths = aixuBaseLawsuit.getFileSrc().split(","); // 文件地址
				
				for(int i=0; i<paths.length; i++) {
					String[] fileNames = paths[i].replaceAll("\\\\","/").split("/"); // 文件名
					String imgType = fileNames[1].substring(fileNames[1].indexOf(".")+1,fileNames[1].length());
					if(fileType.toLowerCase().contains(imgType)) {
						wrti[20+i] = new WorkflowRequestTableField();
						wrti[20+i].setFieldType("http:" + fileNames[1]);// 文件名
						wrti[20+i].setFieldName("file_src");// 客诉状态
						// wrti[19].setFieldValue(aixuBaseLawsuit.getFileSrc());
						wrti[20+i].setFieldValue("http://portal.aikosolar.com/aixu-lawsuit2/files/" + fileNames[0] + "/" + fileNames[1]);
						wrti[20+i].setView(true);
						wrti[20+i].setEdit(true);
					}
				}
				
				
				requestInfo.setRequestName("QS04_1-客诉申请单1");
				// 只有一个主表单
				WorkflowRequestTableRecord[] wrtri = new WorkflowRequestTableRecord[1];
				wrtri[0] = new WorkflowRequestTableRecord();
				wrtri[0].setWorkflowRequestTableFields(wrti);
				workflowMainTableInfo = new WorkflowMainTableInfo();
				workflowMainTableInfo.setRequestRecords(wrtri);
				requestInfo.setWorkflowMainTableInfo(workflowMainTableInfo);// 主表单信息
			}

			if (itemTable != null && itemTable.size() > 0) {
				// 子表单信息-1
				WorkflowRequestTableRecord[] dtrs1 = new WorkflowRequestTableRecord[aixuLawsuiDetails.size()];// aixuLawsuiDetails.size()
				for (int i = 0; i < aixuLawsuiDetails.size(); i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("lawsui_detail");// 主键id
					wrti[0].setFieldValue(aixuLawsuiDetails.get(i).getId());
					// wrti[0].setFieldValue("001");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					wrti[1] = new WorkflowRequestTableField();
					wrti[1].setFieldName("lawsuit_tpye");// 客诉类型
					wrti[1].setFieldValue(aixuLawsuiDetails.get(i).getLawsuitTpye());
					// wrti[1].setFieldValue("002");
					wrti[1].setView(true);
					wrti[1].setEdit(true);

					wrti[2] = new WorkflowRequestTableField();
					wrti[2].setFieldName("lawsuit_tpye_detail");// 客诉类型-具体
					wrti[2].setFieldValue(aixuLawsuiDetails.get(i).getLawsuitTpyeDetail());
					// wrti[2].setFieldValue("003");
					wrti[2].setView(true);
					wrti[2].setEdit(true);

					wrti[3] = new WorkflowRequestTableField();
					wrti[3].setFieldName("complain_mount");// 投诉数量
					wrti[3].setFieldValue(aixuLawsuiDetails.get(i).getComplainMount().toString());
					// wrti[3].setFieldValue("33");
					wrti[3].setView(true);
					wrti[3].setEdit(true);

					wrti[4] = new WorkflowRequestTableField();
					wrti[4].setFieldName("product_desc");// 产品内容描述
					wrti[4].setFieldValue(aixuLawsuiDetails.get(i).getProductDesc());
					// wrti[4].setFieldValue("44");
					wrti[4].setView(true);
					wrti[4].setEdit(true);

					wrti[5] = new WorkflowRequestTableField();
					wrti[5].setFieldName("base_id");// 客诉id
					wrti[5].setFieldValue(aixuLawsuiDetails.get(i).getBaseId());
					// wrti[5].setFieldValue("3432");
					wrti[5].setView(true);
					wrti[5].setEdit(true);

					wrti[6] = new WorkflowRequestTableField();
					wrti[6].setFieldName("create_time");// 创建时间
					wrti[6].setFieldValue(sdf.format(aixuLawsuiDetails.get(i).getCreateTime()));
					// wrti[6].setFieldValue("2017-12-21");
					wrti[6].setView(true);
					wrti[6].setEdit(true);

					dtr.setWorkflowRequestTableFields(wrti);
					dtrs1[i] = dtr;

				}

				WorkflowDetailTableInfo wdtf1 = new WorkflowDetailTableInfo();
				wdtf1.setWorkflowRequestTableRecords(dtrs1);

				// 子表单-2
				WorkflowRequestTableRecord[] dtrs2 = new WorkflowRequestTableRecord[aixuCustomDos.size()];// aixuCustomDos.size()
				for (int i = 0; i < aixuCustomDos.size(); i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("custom_do_id");// 主键
					wrti[0].setFieldValue(aixuCustomDos.get(i).getId());
					// wrti[0].setFieldValue("3344");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					wrti[1] = new WorkflowRequestTableField();
					wrti[1].setFieldName("type");// 方式
					wrti[1].setFieldValue(aixuCustomDos.get(i).getType());
					// wrti[1].setFieldValue("342");
					wrti[1].setView(true);
					wrti[1].setEdit(true);

					wrti[2] = new WorkflowRequestTableField();
					wrti[2].setFieldName("custom_reduce");// 客户降档
					wrti[2].setFieldValue(aixuCustomDos.get(i).getCustomReduce() == null ? ""
							: aixuCustomDos.get(i).getCustomReduce());
					// wrti[2].setFieldValue("342");
					wrti[2].setView(true);
					wrti[2].setEdit(true);

					wrti[3] = new WorkflowRequestTableField();
					wrti[3].setFieldName("custom_mount");// 客户数量
					wrti[3].setFieldValue(aixuCustomDos.get(i).getCustomMount().toString());
					// wrti[3].setFieldValue("33");
					wrti[3].setView(true);
					wrti[3].setEdit(true);

					wrti[4] = new WorkflowRequestTableField();
					wrti[4].setFieldName("judge_reduce");// 判定降档
					wrti[4].setFieldValue(
							aixuCustomDos.get(i).getJudgeReduce() == null ? "" : aixuCustomDos.get(i).getJudgeReduce());
					// wrti[4].setFieldValue("34");
					wrti[4].setView(true);
					wrti[4].setEdit(true);

					wrti[5] = new WorkflowRequestTableField();
					wrti[5].setFieldName("judge_mount");// 判定数量
					wrti[5].setFieldValue(aixuCustomDos.get(i).getJudgeMount() == null ? ""
							: aixuCustomDos.get(i).getJudgeMount().toString());
					// wrti[5].setFieldValue("34");
					wrti[5].setView(true);
					wrti[5].setEdit(true);

					wrti[6] = new WorkflowRequestTableField();
					wrti[6].setFieldName("plan_date");// 计划完成时间
					wrti[6].setFieldValue(sdf.format(aixuCustomDos.get(i).getPlanDate()));
					// wrti[6].setFieldValue(sdf.format(new Date()));
					wrti[6].setView(true);
					wrti[6].setEdit(true);

					wrti[7] = new WorkflowRequestTableField();
					wrti[7].setFieldName("base_id");// 客诉id
					wrti[7].setFieldValue(aixuCustomDos.get(i).getBaseId());
					// wrti[7].setFieldValue("34");
					wrti[7].setView(true);
					wrti[7].setEdit(true);

					wrti[8] = new WorkflowRequestTableField();
					wrti[8].setFieldName("create_time");// 创建时间
					wrti[8].setFieldValue(sdf.format(aixuCustomDos.get(i).getCreateTime()));
					// wrti[8].setFieldValue("2017-12-21");
					wrti[8].setView(true);
					wrti[8].setEdit(true);

					dtr.setWorkflowRequestTableFields(wrti);
					dtrs2[i] = dtr;

				}

				WorkflowDetailTableInfo wdtf2 = new WorkflowDetailTableInfo();
				wdtf2.setWorkflowRequestTableRecords(dtrs2);

				// 只有2个子表单
				WorkflowDetailTableInfo[] workflowDetailTableInfos = new WorkflowDetailTableInfo[2];
				workflowDetailTableInfos[0] = wdtf1;
				workflowDetailTableInfos[1] = wdtf2;

				requestInfo.setWorkflowDetailTableInfos(workflowDetailTableInfos);// 子表单信息
			}

			if (workflowMainTableInfo != null) {
				String addrss = "http://192.168.0.35//services/WorkflowService";
				WorkflowServicePortTypeProxy client = new WorkflowServicePortTypeProxy(addrss);
				requestInfo.setCreatorId(createId + "");
				result = client.doCreateWorkflowRequest(requestInfo, Integer.valueOf(createId));
				// log.info(result);
				System.out.println(result);
			}

		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @desc 发送基本信息+客诉详情+内部风险品处理
	 * @param mainTable
	 * @param itemTable
	 * @param workflowId
	 * @param createId
	 * @return
	 */
	public static String sendOABaseInfo2(Map<String, String> mainTable, List<Map<String, String>> itemTable,
			String workflowId, int createId, AixuBaseLawsuit aixuBaseLawsuit, // 客诉基本信息
			List<AixuLawsuiDetail> aixuLawsuiDetails, // 客诉详情
			List<AixuNbfxpcl> AixuNbfxpcls, AixuUser user) { // 客户处理
		String result = "0";
		WorkflowMainTableInfo workflowMainTableInfo = null;
		WorkflowRequestInfo requestInfo = new WorkflowRequestInfo();
		WorkflowBaseInfo workflowBaseInfo = new WorkflowBaseInfo();
		workflowBaseInfo.setWorkflowId(workflowId);// 流程对应的id
		requestInfo.setCanEdit(true);
		requestInfo.setCanView(true);
		requestInfo.setWorkflowBaseInfo(workflowBaseInfo);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			if (mainTable != null && !mainTable.isEmpty()) {
				// 主表单信息
				// 主表字段信息
				// WorkflowRequestTableField[] wtfs = new
				// WorkflowRequestTableField[mainTable.size()];//mainTable.size()
				WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
				wrti[0] = new WorkflowRequestTableField();
				wrti[0].setFieldName("sqr");// 申请人
				// wrti[0].setFieldValue("1551");// 1551--陈明霞 1552-任博文 1548--姜林乐
				wrti[0].setFieldValue(user.getUserId());// 1551--陈明霞 1552-任博文 1548--姜林乐
				wrti[0].setView(true);
				wrti[0].setEdit(true);

				wrti[1] = new WorkflowRequestTableField();
				wrti[1].setFieldName("depId");// 部门号
				// wrti[1].setFieldValue("255");
				wrti[1].setFieldValue(user.getDepId());
				wrti[1].setView(true);
				wrti[1].setEdit(true);

				wrti[2] = new WorkflowRequestTableField();
				wrti[2].setFieldName("position");// 职位
				// wrti[2].setFieldValue("管培生");//
				wrti[2].setFieldValue(user.getPosition());//
				wrti[2].setView(true);// 字段是否可见
				wrti[2].setEdit(true);// 字段是否可编辑

				wrti[3] = new WorkflowRequestTableField();
				wrti[3].setFieldName("company");// 所属公司
				// wrti[3].setFieldValue("浙江爱旭");
				wrti[3].setFieldValue(user.getCompany());
				wrti[3].setView(true);
				wrti[3].setEdit(true);

				wrti[4] = new WorkflowRequestTableField();
				wrti[4].setFieldName("empPhNo");// 手机号
				// wrti[4].setFieldValue("18270884103");
				wrti[4].setFieldValue(user.getPhoneNo());
				wrti[4].setView(true);
				wrti[4].setEdit(true);

				wrti[5] = new WorkflowRequestTableField();
				wrti[5].setFieldName("aixu_base_lawsuit");// 主键id
				wrti[5].setFieldValue(aixuBaseLawsuit.getId());
				wrti[5].setView(true);
				wrti[5].setEdit(true);

				wrti[6] = new WorkflowRequestTableField();
				wrti[6].setFieldName("lawsuit_no");// 客诉单编号
				wrti[6].setFieldValue(aixuBaseLawsuit.getLawsuitNo());
				wrti[6].setView(true);
				wrti[6].setEdit(true);

				wrti[7] = new WorkflowRequestTableField();
				wrti[7].setFieldName("custom_name");// 客户名称
				wrti[7].setFieldValue(aixuBaseLawsuit.getCustomName());
				wrti[7].setView(true);
				wrti[7].setEdit(true);

				wrti[8] = new WorkflowRequestTableField();
				wrti[8].setFieldName("custom_no");// 客户编号
				wrti[8].setFieldValue(aixuBaseLawsuit.getCustomNo());
				wrti[8].setView(true);
				wrti[8].setEdit(true);

				wrti[9] = new WorkflowRequestTableField();
				wrti[9].setFieldName("complain_date");// 投诉日期
				wrti[9].setFieldValue(sdf.format(aixuBaseLawsuit.getComplainDate()));
				wrti[9].setView(true);
				wrti[9].setEdit(true);

				wrti[10] = new WorkflowRequestTableField();
				wrti[10].setFieldName("product_type");// 产品型号
				wrti[10].setFieldValue(aixuBaseLawsuit.getProductType());
				wrti[10].setView(true);
				wrti[10].setEdit(true);

				wrti[11] = new WorkflowRequestTableField();
				wrti[11].setFieldName("product_no");// 产品编码
				wrti[11].setFieldValue(aixuBaseLawsuit.getProductNo());
				wrti[11].setView(true);
				wrti[11].setEdit(true);

				wrti[12] = new WorkflowRequestTableField();
				wrti[12].setFieldName("deliver_seq");// 发货批次
				wrti[12].setFieldValue(aixuBaseLawsuit.getDeliverSeq());
				wrti[12].setView(true);
				wrti[12].setEdit(true);

				wrti[13] = new WorkflowRequestTableField();
				wrti[13].setFieldName("sales_no");// 销售订单编号
				wrti[13].setFieldValue(aixuBaseLawsuit.getSalesNo());
				wrti[13].setView(true);
				wrti[13].setEdit(true);

				wrti[14] = new WorkflowRequestTableField();
				wrti[14].setFieldName("duty_factory");// 责任工厂
				wrti[14].setFieldValue(aixuBaseLawsuit.getDutyFactory());
				wrti[14].setView(true);
				wrti[14].setEdit(true);

				/*
				 * wrti[15] = new WorkflowRequestTableField();
				 * wrti[15].setFieldName("apply_name");// 申请人姓名
				 * wrti[15].setFieldValue(aixuBaseLawsuit.getApplyName());
				 * wrti[15].setView(true); wrti[15].setEdit(true);
				 * 
				 * wrti[16] = new WorkflowRequestTableField();
				 * wrti[16].setFieldName("apply_no");// 申请人工号
				 * wrti[16].setFieldValue(aixuBaseLawsuit.getApplyNo()); wrti[16].setView(true);
				 * wrti[16].setEdit(true);
				 */

				wrti[17] = new WorkflowRequestTableField();
				wrti[17].setFieldName("is_need_rep");// 客户是否需要报告
				wrti[17].setFieldValue(aixuBaseLawsuit.getIsNeedRep());
				wrti[17].setView(true);
				wrti[17].setEdit(true);

				wrti[18] = new WorkflowRequestTableField();
				wrti[18].setFieldName("lawsuit_state");// 客诉状态
				wrti[18].setFieldValue(aixuBaseLawsuit.getLawsuitDanState());
				wrti[18].setView(true);
				wrti[18].setEdit(true);

				wrti[19] = new WorkflowRequestTableField();
				wrti[19].setFieldName("create_time"); // 创建日期
				wrti[19].setFieldValue(sdf.format(aixuBaseLawsuit.getCreateTime()));
				wrti[19].setView(true);
				wrti[19].setEdit(true);

				String fileType = "jpeg,bmp,gif,jpg,psd,png,tiff,tga,eps"; 										//文件格式
				String[] paths = aixuBaseLawsuit.getFileSrc().split(","); // 文件地址
				
				for(int i=0; i<paths.length; i++) {
					String[] fileNames = paths[i].replaceAll("\\\\","/").split("/"); // 文件名
					String imgType = fileNames[1].substring(fileNames[1].indexOf(".")+1,fileNames[1].length());
					if(fileType.toLowerCase().contains(imgType)) {
						wrti[20+i] = new WorkflowRequestTableField();
						wrti[20+i].setFieldType("http:" + fileNames[1]);// 文件名
						wrti[20+i].setFieldName("file_src");// 客诉状态
						// wrti[19].setFieldValue(aixuBaseLawsuit.getFileSrc());
						wrti[20+i].setFieldValue("http://portal.aikosolar.com/aixu-lawsuit2/files/" + fileNames[0] + "/" + fileNames[1]);
						wrti[20+i].setView(true);
						wrti[20+i].setEdit(true);
					}
				}

				requestInfo.setRequestName("QS04_2-客诉申请单2");
				// 只有一个主表单
				WorkflowRequestTableRecord[] wrtri = new WorkflowRequestTableRecord[1];
				wrtri[0] = new WorkflowRequestTableRecord();
				wrtri[0].setWorkflowRequestTableFields(wrti);
				workflowMainTableInfo = new WorkflowMainTableInfo();
				workflowMainTableInfo.setRequestRecords(wrtri);
				requestInfo.setWorkflowMainTableInfo(workflowMainTableInfo);// 主表单信息
			}

			if (itemTable != null && itemTable.size() > 0) {
				// 子表单信息-1
				WorkflowRequestTableRecord[] dtrs1 = new WorkflowRequestTableRecord[aixuLawsuiDetails.size()];// aixuLawsuiDetails.size()
				for (int i = 0; i < aixuLawsuiDetails.size(); i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("lawsui_detail");// 主键id
					wrti[0].setFieldValue(aixuLawsuiDetails.get(i).getId());
					// wrti[0].setFieldValue("001");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					wrti[1] = new WorkflowRequestTableField();
					wrti[1].setFieldName("lawsuit_tpye");// 客诉类型
					wrti[1].setFieldValue(aixuLawsuiDetails.get(i).getLawsuitTpye());
					// wrti[1].setFieldValue("002");
					wrti[1].setView(true);
					wrti[1].setEdit(true);

					wrti[2] = new WorkflowRequestTableField();
					wrti[2].setFieldName("lawsuit_tpye_detail");// 客诉类型-具体
					wrti[2].setFieldValue(aixuLawsuiDetails.get(i).getLawsuitTpyeDetail());
					// wrti[2].setFieldValue("003");
					wrti[2].setView(true);
					wrti[2].setEdit(true);

					wrti[3] = new WorkflowRequestTableField();
					wrti[3].setFieldName("complain_mount");// 投诉数量
					wrti[3].setFieldValue(aixuLawsuiDetails.get(i).getComplainMount().toString());
					// wrti[3].setFieldValue("33");
					wrti[3].setView(true);
					wrti[3].setEdit(true);

					wrti[4] = new WorkflowRequestTableField();
					wrti[4].setFieldName("product_desc");// 产品内容描述
					wrti[4].setFieldValue(aixuLawsuiDetails.get(i).getProductDesc());
					// wrti[4].setFieldValue("44");
					wrti[4].setView(true);
					wrti[4].setEdit(true);

					wrti[5] = new WorkflowRequestTableField();
					wrti[5].setFieldName("base_id");// 客诉id
					wrti[5].setFieldValue(aixuLawsuiDetails.get(i).getBaseId());
					// wrti[5].setFieldValue("3432");
					wrti[5].setView(true);
					wrti[5].setEdit(true);

					wrti[6] = new WorkflowRequestTableField();
					wrti[6].setFieldName("create_time");// 创建时间
					wrti[6].setFieldValue(sdf.format(aixuLawsuiDetails.get(i).getCreateTime()));
					// wrti[6].setFieldValue("2017-12-21");
					wrti[6].setView(true);
					wrti[6].setEdit(true);

					dtr.setWorkflowRequestTableFields(wrti);
					dtrs1[i] = dtr;

				}

				WorkflowDetailTableInfo wdtf1 = new WorkflowDetailTableInfo();
				wdtf1.setWorkflowRequestTableRecords(dtrs1);

				// 子表单-2
				WorkflowRequestTableRecord[] dtrs2 = new WorkflowRequestTableRecord[10];// aixuCustomDos.size()
				for (int i = 0; i < 10; i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("lawsuit_tpye");// 主键
					wrti[0].setFieldValue("009");
					// wrti[0].setFieldValue("3344");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					dtr.setWorkflowRequestTableFields(wrti);
					dtrs2[i] = dtr;

				}
				
				WorkflowDetailTableInfo wdtf2 = new WorkflowDetailTableInfo();
				wdtf2.setWorkflowRequestTableRecords(dtrs2);
				
				// 子表单-2
				WorkflowRequestTableRecord[] dtrs3 = new WorkflowRequestTableRecord[AixuNbfxpcls.size()];// aixuCustomDos.size()
				for (int i = 0; i < AixuNbfxpcls.size(); i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("nbfxpcl_id");// 主键
					wrti[0].setFieldValue(AixuNbfxpcls.get(i).getNbfxpclId());
					// wrti[0].setFieldValue("3344");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					wrti[1] = new WorkflowRequestTableField();
					wrti[1].setFieldName("nbfxpcl_pl");// 品类
					wrti[1].setFieldValue(AixuNbfxpcls.get(i).getNbfxpclPl());
					// wrti[1].setFieldValue("342");
					wrti[1].setView(true);
					wrti[1].setEdit(true);

					wrti[2] = new WorkflowRequestTableField();
					wrti[2].setFieldName("nbfxpcl_xh");// 产品型号
					wrti[2].setFieldValue(AixuNbfxpcls.get(i).getNbfxpclXh());
					// wrti[2].setFieldValue("342");
					wrti[2].setView(true);
					wrti[2].setEdit(true);

					wrti[3] = new WorkflowRequestTableField();
					wrti[3].setFieldName("nbfxpcl_sl");// 数量
					wrti[3].setFieldValue(AixuNbfxpcls.get(i).getNbfxpclSl().toString());
					// wrti[3].setFieldValue("33");
					wrti[3].setView(true);
					wrti[3].setEdit(true);

					wrti[4] = new WorkflowRequestTableField();
					wrti[4].setFieldName("nbfxpcl_kw");// 库位
					wrti[4].setFieldValue(AixuNbfxpcls.get(i).getNbfxpclKw());
					// wrti[4].setFieldValue("34");
					wrti[4].setView(true);
					wrti[4].setEdit(true);

					wrti[5] = new WorkflowRequestTableField();
					wrti[5].setFieldName("nbfxpcl_ksgldid");// 客诉管理单id
					wrti[5].setFieldValue(AixuNbfxpcls.get(i).getNbfxpclKsgldid());
					// wrti[4].setFieldValue("34");
					wrti[5].setView(true);
					wrti[5].setEdit(true);

					dtr.setWorkflowRequestTableFields(wrti);
					dtrs3[i] = dtr;

				}

				WorkflowDetailTableInfo wdtf3 = new WorkflowDetailTableInfo();
				wdtf3.setWorkflowRequestTableRecords(dtrs3);

				// 只有2个子表单
				WorkflowDetailTableInfo[] workflowDetailTableInfos = new WorkflowDetailTableInfo[3];
				workflowDetailTableInfos[0] = wdtf1;
				workflowDetailTableInfos[1] = wdtf2;
				workflowDetailTableInfos[2] = wdtf3;

				requestInfo.setWorkflowDetailTableInfos(workflowDetailTableInfos);// 子表单信息
			}

			if (workflowMainTableInfo != null) {
				String addrss = "http://192.168.0.35//services/WorkflowService";
				WorkflowServicePortTypeProxy client = new WorkflowServicePortTypeProxy(addrss);
				requestInfo.setCreatorId(createId + "");
				result = client.doCreateWorkflowRequest(requestInfo, Integer.valueOf(createId));
				// log.info(result);
				System.out.println(result);
			}

		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @desc 发送基本信息+客诉详情+责任认定
	 * @param mainTable
	 * @param itemTable
	 * @param workflowId
	 * @param createId
	 * @return
	 */
	public static String sendOABaseInfo3(Map<String, String> mainTable, List<Map<String, String>> itemTable,
			String workflowId, int createId, AixuBaseLawsuit aixuBaseLawsuit, // 客诉基本信息
			List<AixuLawsuiDetail> aixuLawsuiDetails, // 客诉详情
			List<AixuZrrd> aixuZrrds, AixuUser user) { // 客户处理
		String result = "0";
		WorkflowMainTableInfo workflowMainTableInfo = null;
		WorkflowRequestInfo requestInfo = new WorkflowRequestInfo();
		WorkflowBaseInfo workflowBaseInfo = new WorkflowBaseInfo();
		workflowBaseInfo.setWorkflowId(workflowId);// 流程对应的id
		requestInfo.setCanEdit(true);
		requestInfo.setCanView(true);
		requestInfo.setWorkflowBaseInfo(workflowBaseInfo);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			if (mainTable != null && !mainTable.isEmpty()) {
				// 主表单信息
				// 主表字段信息
				// WorkflowRequestTableField[] wtfs = new
				// WorkflowRequestTableField[mainTable.size()];//mainTable.size()
				WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[40];
				wrti[0] = new WorkflowRequestTableField();
				wrti[0].setFieldName("sqr");// 申请人
				// wrti[0].setFieldValue("1551");// 1551--陈明霞 1552-任博文 1548--姜林乐
				wrti[0].setFieldValue(user.getUserId());// 1551--陈明霞 1552-任博文 1548--姜林乐
				wrti[0].setView(true);
				wrti[0].setEdit(true);

				wrti[1] = new WorkflowRequestTableField();
				wrti[1].setFieldName("depId");// 部门号
				// wrti[1].setFieldValue("255");
				wrti[1].setFieldValue(user.getDepId());
				wrti[1].setView(true);
				wrti[1].setEdit(true);

				wrti[2] = new WorkflowRequestTableField();
				wrti[2].setFieldName("position");// 职位
				// wrti[2].setFieldValue("管培生");//
				wrti[2].setFieldValue(user.getPosition());//
				wrti[2].setView(true);// 字段是否可见
				wrti[2].setEdit(true);// 字段是否可编辑

				wrti[3] = new WorkflowRequestTableField();
				wrti[3].setFieldName("company");// 所属公司
				// wrti[3].setFieldValue("浙江爱旭");
				wrti[3].setFieldValue(user.getCompany());
				wrti[3].setView(true);
				wrti[3].setEdit(true);

				wrti[4] = new WorkflowRequestTableField();
				wrti[4].setFieldName("empPhNo");// 手机号
				// wrti[4].setFieldValue("18270884103");
				wrti[4].setFieldValue(user.getPhoneNo());
				wrti[4].setView(true);
				wrti[4].setEdit(true);

				wrti[5] = new WorkflowRequestTableField();
				wrti[5].setFieldName("aixu_base_lawsuit");// 主键id
				wrti[5].setFieldValue(aixuBaseLawsuit.getId());
				wrti[5].setView(true);
				wrti[5].setEdit(true);

				wrti[6] = new WorkflowRequestTableField();
				wrti[6].setFieldName("lawsuit_no");// 客诉单编号
				wrti[6].setFieldValue(aixuBaseLawsuit.getLawsuitNo());
				wrti[6].setView(true);
				wrti[6].setEdit(true);

				wrti[7] = new WorkflowRequestTableField();
				wrti[7].setFieldName("custom_name");// 客户名称
				wrti[7].setFieldValue(aixuBaseLawsuit.getCustomName());
				wrti[7].setView(true);
				wrti[7].setEdit(true);

				wrti[8] = new WorkflowRequestTableField();
				wrti[8].setFieldName("custom_no");// 客户编号
				wrti[8].setFieldValue(aixuBaseLawsuit.getCustomNo());
				wrti[8].setView(true);
				wrti[8].setEdit(true);

				wrti[9] = new WorkflowRequestTableField();
				wrti[9].setFieldName("complain_date");// 投诉日期
				wrti[9].setFieldValue(sdf.format(aixuBaseLawsuit.getComplainDate()));
				wrti[9].setView(true);
				wrti[9].setEdit(true);

				wrti[10] = new WorkflowRequestTableField();
				wrti[10].setFieldName("product_type");// 产品型号
				wrti[10].setFieldValue(aixuBaseLawsuit.getProductType());
				wrti[10].setView(true);
				wrti[10].setEdit(true);

				wrti[11] = new WorkflowRequestTableField();
				wrti[11].setFieldName("product_no");// 产品编码
				wrti[11].setFieldValue(aixuBaseLawsuit.getProductNo());
				wrti[11].setView(true);
				wrti[11].setEdit(true);

				wrti[12] = new WorkflowRequestTableField();
				wrti[12].setFieldName("deliver_seq");// 发货批次
				wrti[12].setFieldValue(aixuBaseLawsuit.getDeliverSeq());
				wrti[12].setView(true);
				wrti[12].setEdit(true);

				wrti[13] = new WorkflowRequestTableField();
				wrti[13].setFieldName("sales_no");// 销售订单编号
				wrti[13].setFieldValue(aixuBaseLawsuit.getSalesNo());
				wrti[13].setView(true);
				wrti[13].setEdit(true);

				wrti[14] = new WorkflowRequestTableField();
				wrti[14].setFieldName("duty_factory");// 责任工厂
				wrti[14].setFieldValue(aixuBaseLawsuit.getDutyFactory());
				wrti[14].setView(true);
				wrti[14].setEdit(true);

				/*
				 * wrti[15] = new WorkflowRequestTableField();
				 * wrti[15].setFieldName("apply_name");// 申请人姓名
				 * wrti[15].setFieldValue(aixuBaseLawsuit.getApplyName());
				 * wrti[15].setView(true); wrti[15].setEdit(true);
				 * 
				 * wrti[16] = new WorkflowRequestTableField();
				 * wrti[16].setFieldName("apply_no");// 申请人工号
				 * wrti[16].setFieldValue(aixuBaseLawsuit.getApplyNo()); wrti[16].setView(true);
				 * wrti[16].setEdit(true);
				 */

				wrti[17] = new WorkflowRequestTableField();
				wrti[17].setFieldName("is_need_rep");// 客户是否需要报告
				wrti[17].setFieldValue(aixuBaseLawsuit.getIsNeedRep());
				wrti[17].setView(true);
				wrti[17].setEdit(true);

				wrti[18] = new WorkflowRequestTableField();
				wrti[18].setFieldName("lawsuit_state");// 客诉状态
				wrti[18].setFieldValue(aixuBaseLawsuit.getLawsuitDanState());
				wrti[18].setView(true);
				wrti[18].setEdit(true);

				wrti[19] = new WorkflowRequestTableField();
				wrti[19].setFieldName("create_time"); // 创建日期
				wrti[19].setFieldValue(sdf.format(aixuBaseLawsuit.getCreateTime()));
				wrti[19].setView(true);
				wrti[19].setEdit(true);

				String fileType = "jpeg,bmp,gif,jpg,psd,png,tiff,tga,eps"; 		//文件格式								//文件格式
				String[] paths = aixuBaseLawsuit.getFileSrc().split(","); // 文件地址
				
				for(int i=0; i<paths.length; i++) {
					String[] fileNames = paths[i].replaceAll("\\\\","/").split("/"); // 文件名
					String imgType = fileNames[1].substring(fileNames[1].indexOf(".")+1,fileNames[1].length());
					if(fileType.toLowerCase().contains(imgType)) {
						wrti[20+i] = new WorkflowRequestTableField();
						wrti[20+i].setFieldType("http:" + fileNames[1]);// 文件名
						wrti[20+i].setFieldName("file_src");// 客诉状态
						// wrti[19].setFieldValue(aixuBaseLawsuit.getFileSrc());
						wrti[20+i].setFieldValue("http://portal.aikosolar.com/aixu-lawsuit2/files/" + fileNames[0] + "/" + fileNames[1]);
						wrti[20+i].setView(true);
						wrti[20+i].setEdit(true);
					}
				}
				
				
				requestInfo.setRequestName("QS04_4-客诉处理申请4 ");
				// 只有一个主表单
				WorkflowRequestTableRecord[] wrtri = new WorkflowRequestTableRecord[1];
				wrtri[0] = new WorkflowRequestTableRecord();
				wrtri[0].setWorkflowRequestTableFields(wrti);
				workflowMainTableInfo = new WorkflowMainTableInfo();
				workflowMainTableInfo.setRequestRecords(wrtri);
				requestInfo.setWorkflowMainTableInfo(workflowMainTableInfo);// 主表单信息
			}

			if (itemTable != null && itemTable.size() > 0) {
				// 子表单信息-1
				WorkflowRequestTableRecord[] dtrs1 = new WorkflowRequestTableRecord[aixuLawsuiDetails.size()];// aixuLawsuiDetails.size()
				for (int i = 0; i < aixuLawsuiDetails.size(); i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("lawsui_detail");// 主键id
					wrti[0].setFieldValue(aixuLawsuiDetails.get(i).getId());
					// wrti[0].setFieldValue("001");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					wrti[1] = new WorkflowRequestTableField();
					wrti[1].setFieldName("lawsuit_tpye");// 客诉类型
					wrti[1].setFieldValue(aixuLawsuiDetails.get(i).getLawsuitTpye());
					// wrti[1].setFieldValue("002");
					wrti[1].setView(true);
					wrti[1].setEdit(true);

					wrti[2] = new WorkflowRequestTableField();
					wrti[2].setFieldName("lawsuit_tpye_detail");// 客诉类型-具体
					wrti[2].setFieldValue(aixuLawsuiDetails.get(i).getLawsuitTpyeDetail());
					// wrti[2].setFieldValue("003");
					wrti[2].setView(true);
					wrti[2].setEdit(true);

					wrti[3] = new WorkflowRequestTableField();
					wrti[3].setFieldName("complain_mount");// 投诉数量
					wrti[3].setFieldValue(aixuLawsuiDetails.get(i).getComplainMount().toString());
					// wrti[3].setFieldValue("33");
					wrti[3].setView(true);
					wrti[3].setEdit(true);

					wrti[4] = new WorkflowRequestTableField();
					wrti[4].setFieldName("product_desc");// 产品内容描述
					wrti[4].setFieldValue(aixuLawsuiDetails.get(i).getProductDesc());
					// wrti[4].setFieldValue("44");
					wrti[4].setView(true);
					wrti[4].setEdit(true);

					wrti[5] = new WorkflowRequestTableField();
					wrti[5].setFieldName("base_id");// 客诉id
					wrti[5].setFieldValue(aixuLawsuiDetails.get(i).getBaseId());
					// wrti[5].setFieldValue("3432");
					wrti[5].setView(true);
					wrti[5].setEdit(true);

					wrti[6] = new WorkflowRequestTableField();
					wrti[6].setFieldName("create_time");// 创建时间
					wrti[6].setFieldValue(sdf.format(aixuLawsuiDetails.get(i).getCreateTime()));
					// wrti[6].setFieldValue("2017-12-21");
					wrti[6].setView(true);
					wrti[6].setEdit(true);

					dtr.setWorkflowRequestTableFields(wrti);
					dtrs1[i] = dtr;

				}

				WorkflowDetailTableInfo wdtf1 = new WorkflowDetailTableInfo();
				wdtf1.setWorkflowRequestTableRecords(dtrs1);

				// 子表单-2
				WorkflowRequestTableRecord[] dtrs2 = new WorkflowRequestTableRecord[10];// aixuCustomDos.size()
				for (int i = 0; i < 10; i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("lawsuit_tpye");// 主键
					wrti[0].setFieldValue("009");
					// wrti[0].setFieldValue("3344");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					dtr.setWorkflowRequestTableFields(wrti);
					dtrs2[i] = dtr;

				}
				WorkflowDetailTableInfo wdtf2 = new WorkflowDetailTableInfo();
				wdtf2.setWorkflowRequestTableRecords(dtrs2);
				
				// 子表单-3
				WorkflowRequestTableRecord[] dtrs3 = new WorkflowRequestTableRecord[10];// aixuCustomDos.size()
				for (int i = 0; i < 10; i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("type");// 主键
					wrti[0].setFieldValue("009");
					// wrti[0].setFieldValue("3344");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑
					
					
					dtr.setWorkflowRequestTableFields(wrti);
					dtrs3[i] = dtr;
					
				}
				WorkflowDetailTableInfo wdtf3 = new WorkflowDetailTableInfo();
				wdtf3.setWorkflowRequestTableRecords(dtrs3);
				
				// 子表单-4
				WorkflowRequestTableRecord[] dtrs4 = new WorkflowRequestTableRecord[10];// aixuCustomDos.size()
				for (int i = 0; i < 10; i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("nbfxpcl_pl");// 主键
					wrti[0].setFieldValue("009");
					// wrti[0].setFieldValue("3344");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑
					
					dtr.setWorkflowRequestTableFields(wrti);
					dtrs4[i] = dtr;
					
				}
				WorkflowDetailTableInfo wdtf4 = new WorkflowDetailTableInfo();
				wdtf4.setWorkflowRequestTableRecords(dtrs4);
				
				// 子表单-5
				WorkflowRequestTableRecord[] dtrs5 = new WorkflowRequestTableRecord[10];// aixuCustomDos.size()
				for (int i = 0; i < 10; i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("nbzgdc_lx");// 主键
					wrti[0].setFieldValue("009");
					// wrti[0].setFieldValue("3344");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑
					
					
					dtr.setWorkflowRequestTableFields(wrti);
					dtrs5[i] = dtr;
					
				}
				WorkflowDetailTableInfo wdtf5 = new WorkflowDetailTableInfo();
				wdtf5.setWorkflowRequestTableRecords(dtrs5);
				
				// 子表单-6
				WorkflowRequestTableRecord[] dtrs6 = new WorkflowRequestTableRecord[10];// aixuCustomDos.size()
				for (int i = 0; i < 10; i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("zrrd_id");// 主键
					wrti[0].setFieldValue("009");
					// wrti[0].setFieldValue("3344");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					wrti[1] = new WorkflowRequestTableField();
					wrti[1].setFieldName("zrrd_zrbm");// 责任部门
					wrti[1].setFieldValue("009");
					// wrti[1].setFieldValue("342");
					wrti[1].setView(true);
					wrti[1].setEdit(true);

					wrti[2] = new WorkflowRequestTableField();
					wrti[2].setFieldName("zrrd_zrr");// 责任人
					wrti[2].setFieldValue("009");
					// wrti[2].setFieldValue("342");
					wrti[2].setView(true);
					wrti[2].setEdit(true);

					wrti[3] = new WorkflowRequestTableField();
					wrti[3].setFieldName("zrrdYl1");// 处理意见
					wrti[3].setFieldValue("009");
					// wrti[3].setFieldValue("33");
					wrti[3].setView(true);
					wrti[3].setEdit(true);

					wrti[4] = new WorkflowRequestTableField();
					wrti[4].setFieldName("zrrd_ksgldid");// 客诉管理单id
					wrti[4].setFieldValue("009");
					// wrti[4].setFieldValue("34");
					wrti[4].setView(true);
					wrti[4].setEdit(true);

					dtr.setWorkflowRequestTableFields(wrti);
					dtrs6[i] = dtr;

				}

				WorkflowDetailTableInfo wdtf6 = new WorkflowDetailTableInfo();
				wdtf6.setWorkflowRequestTableRecords(dtrs6);

				// 只有2个子表单
				WorkflowDetailTableInfo[] workflowDetailTableInfos = new WorkflowDetailTableInfo[6];
				workflowDetailTableInfos[0] = wdtf1;
				workflowDetailTableInfos[1] = wdtf2;
				workflowDetailTableInfos[2] = wdtf3;
				workflowDetailTableInfos[3] = wdtf4;
				workflowDetailTableInfos[4] = wdtf5;
				workflowDetailTableInfos[5] = wdtf6;

				requestInfo.setWorkflowDetailTableInfos(workflowDetailTableInfos);// 子表单信息
			}

			if (workflowMainTableInfo != null) {
				String addrss = "http://192.168.0.35//services/WorkflowService";
				WorkflowServicePortTypeProxy client = new WorkflowServicePortTypeProxy(addrss);
				requestInfo.setCreatorId(createId + "");
				result = client.doCreateWorkflowRequest(requestInfo, Integer.valueOf(createId));
				// log.info(result);
				System.out.println(result);
			}

		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}
}
