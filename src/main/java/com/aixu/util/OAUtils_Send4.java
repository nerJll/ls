package com.aixu.util;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.aixu.oa.workflow.WorkflowDetailTableInfo;
import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.bean.AixuCustomDo;
import com.aixu.bean.AixuLawsuiDetail;
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

public class OAUtils_Send4 {

	/**
	 * @desc 发送基本信息
	 * @param mainTable
	 * @param itemTable
	 * @param workflowId
	 * @param createId
	 * @return
	 */
	public static String sendOABaseInfo1(Map<String, String> mainTable, List<Map<String, String>> itemTable,
			String workflowId, int createId, AixuBaseLawsuit aixuBaseLawsuit, // 客诉基本信息
			List<AixuLawsuiDetail> aixuLawsuiDetails, // 客诉详情
			List<AixuCustomDo> aixuCustomDos,
			 AixuUser user) { // 客户处理
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
				wrti[0].setFieldValue("1551");// 1551--陈明霞 1552-任博文 1548--姜林乐
				//wrti[0].setFieldValue(user.getUserId());
				wrti[0].setView(true);
				wrti[0].setEdit(true);

				wrti[1] = new WorkflowRequestTableField();
				wrti[1].setFieldName("depId");// 部门号
				//wrti[1].setFieldValue("255");
				wrti[1].setFieldValue(user.getDepId());
				wrti[1].setView(true);
				wrti[1].setEdit(true);

				wrti[2] = new WorkflowRequestTableField();
				wrti[2].setFieldName("position");// 职位
//				wrti[2].setFieldValue("管培生");//
				wrti[2].setFieldValue(user.getPosition());//
				wrti[2].setView(true);// 字段是否可见
				wrti[2].setEdit(true);// 字段是否可编辑

				wrti[3] = new WorkflowRequestTableField();
				wrti[3].setFieldName("company");// 所属公司
//				wrti[3].setFieldValue("浙江爱旭");
				wrti[3].setFieldValue(user.getCompany());
				wrti[3].setView(true);
				wrti[3].setEdit(true);

				wrti[4] = new WorkflowRequestTableField();
				wrti[4].setFieldName("empPhNo");// 手机号
//				wrti[4].setFieldValue("18270884103");
				wrti[4].setFieldValue(user.getPhoneNo());
				wrti[4].setView(true);
				wrti[4].setEdit(true);

				wrti[5] = new WorkflowRequestTableField();
				wrti[5].setFieldName("aixu_base_lawsuit");// 主键id
				wrti[5].setFieldValue(aixuBaseLawsuit.getId());
				//wrti[5].setFieldValue("9987");
				wrti[5].setView(true);
				wrti[5].setEdit(true);

				wrti[6] = new WorkflowRequestTableField();
				wrti[6].setFieldName("lawsuit_no");// 客诉单编号
				wrti[6].setFieldValue(aixuBaseLawsuit.getLawsuitNo());
				//wrti[6].setFieldValue("3434");
				wrti[6].setView(true);
				wrti[6].setEdit(true);

				wrti[7] = new WorkflowRequestTableField();
				wrti[7].setFieldName("custom_name");// 客户名称
				wrti[7].setFieldValue(aixuBaseLawsuit.getCustomName());
				//wrti[7].setFieldValue("阿特斯");
				wrti[7].setView(true);
				wrti[7].setEdit(true);

				wrti[8] = new WorkflowRequestTableField();
				wrti[8].setFieldName("custom_no");// 客户编号
				wrti[8].setFieldValue(aixuBaseLawsuit.getCustomNo());
				//wrti[8].setFieldValue("783");
				wrti[8].setView(true);
				wrti[8].setEdit(true);

				wrti[9] = new WorkflowRequestTableField();
				wrti[9].setFieldName("complain_date");// 投诉日期
				wrti[9].setFieldValue(sdf.format(aixuBaseLawsuit.getComplainDate()));
				//wrti[9].setFieldValue("2017-12-21");
				wrti[9].setView(true);
				wrti[9].setEdit(true);

				wrti[10] = new WorkflowRequestTableField();
				wrti[10].setFieldName("product_type");// 产品型号
				wrti[10].setFieldValue(aixuBaseLawsuit.getProductType());
				//wrti[10].setFieldValue("1");
				wrti[10].setView(true);
				wrti[10].setEdit(true);

				wrti[11] = new WorkflowRequestTableField();
				wrti[11].setFieldName("product_no");// 产品编码
				wrti[11].setFieldValue(aixuBaseLawsuit.getProductNo());
				//wrti[11].setFieldValue("903");
				wrti[11].setView(true);
				wrti[11].setEdit(true);

				wrti[12] = new WorkflowRequestTableField();
				wrti[12].setFieldName("deliver_seq");// 发货批次
				wrti[12].setFieldValue(aixuBaseLawsuit.getDeliverSeq());
				//wrti[12].setFieldValue("342");
				wrti[12].setView(true);
				wrti[12].setEdit(true);

				wrti[13] = new WorkflowRequestTableField();
				wrti[13].setFieldName("sales_no");// 销售订单编号
				wrti[13].setFieldValue(aixuBaseLawsuit.getSalesNo());
				//wrti[13].setFieldValue("343");
				wrti[13].setView(true);
				wrti[13].setEdit(true);

				wrti[14] = new WorkflowRequestTableField();
				wrti[14].setFieldName("duty_factory");// 责任工厂
				wrti[14].setFieldValue(aixuBaseLawsuit.getDutyFactory());
				//wrti[14].setFieldValue("3201");
				wrti[14].setView(true);
				wrti[14].setEdit(true);

				wrti[15] = new WorkflowRequestTableField();
				wrti[15].setFieldName("apply_name");// 申请人姓名
				wrti[15].setFieldValue(aixuBaseLawsuit.getApplyName());
				//wrti[15].setFieldValue("333");
				wrti[15].setView(true);
				wrti[15].setEdit(true);

				wrti[16] = new WorkflowRequestTableField();
				wrti[16].setFieldName("apply_no");// 申请人工号
				wrti[16].setFieldValue(aixuBaseLawsuit.getApplyNo());
				//wrti[16].setFieldValue("322");
				wrti[16].setView(true);
				wrti[16].setEdit(true);

				wrti[17] = new WorkflowRequestTableField();
				wrti[17].setFieldName("is_need_rep");// 客户是否需要报告
				wrti[17].setFieldValue(aixuBaseLawsuit.getIsNeedRep());
				//wrti[17].setFieldValue("1");
				wrti[17].setView(true);
				wrti[17].setEdit(true);

				wrti[18] = new WorkflowRequestTableField();
				wrti[18].setFieldName("lawsuit_state");// 客诉状态
				wrti[18].setFieldValue(aixuBaseLawsuit.getLawsuitNo());
				//wrti[18].setFieldValue("03");
				wrti[18].setView(true);
				wrti[18].setEdit(true);

				wrti[19] = new WorkflowRequestTableField();
				wrti[19].setFieldName("create_time"); // 创建日期
				wrti[19].setFieldValue(sdf.format(aixuBaseLawsuit.getCreateTime()));
				//wrti[19].setFieldValue(sdf.format(new Date()));
				wrti[19].setView(true);
				wrti[19].setEdit(true);
				
				wrti[20] = new WorkflowRequestTableField();
				wrti[20].setFieldName("file_src");// 文件地址
				wrti[20].setFieldType("http:loading.gif");// 文件地址
				//wrti[19].setFieldValue(aixuBaseLawsuit.getFileSrc());
				wrti[20].setFieldValue("http://portal.aikosolar.com/aixu-lawsuit2/images/loading.gif");
				wrti[20].setView(true);
				wrti[20].setEdit(true);

				wrti[21] = new WorkflowRequestTableField();
				wrti[21].setFieldName("file_src");// 文件地址
				wrti[21].setFieldType("http:loading2.gif");// 文件地址
				//wrti[19].setFieldValue(aixuBaseLawsuit.getFileSrc());
				wrti[21].setFieldValue("http://portal.aikosolar.com/aixu-lawsuit2/images/loading2.gif");
				wrti[21].setView(true);
				wrti[21].setEdit(true);
				
				requestInfo.setRequestName("QS04-客诉申请单");
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
				WorkflowRequestTableRecord[] dtrs1 = new WorkflowRequestTableRecord[10];//aixuLawsuiDetails.size()
				for (int i = 0; i < 10; i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("lawsui_detail");// 主键id
					//wrti[0].setFieldValue(aixuLawsuiDetails.get(i).getId());
					wrti[0].setFieldValue("001");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					wrti[1] = new WorkflowRequestTableField();
					wrti[1].setFieldName("lawsuit_tpye");// 客诉类型
					//wrti[1].setFieldValue(aixuLawsuiDetails.get(i).getLawsuitTpye());
					wrti[1].setFieldValue("002");
					wrti[1].setView(true);
					wrti[1].setEdit(true);

					wrti[2] = new WorkflowRequestTableField();
					wrti[2].setFieldName("lawsuit_tpye_detail");// 客诉类型-具体
					//wrti[2].setFieldValue(aixuLawsuiDetails.get(i).getLawsuitTpyeDetail());
					wrti[2].setFieldValue("003");
					wrti[2].setView(true);
					wrti[2].setEdit(true);

					wrti[3] = new WorkflowRequestTableField();
					wrti[3].setFieldName("complain_mount");// 投诉数量
					//wrti[3].setFieldValue(aixuLawsuiDetails.get(i).getComplainMount().toString());
					wrti[3].setFieldValue("33");
					wrti[3].setView(true);
					wrti[3].setEdit(true);

					wrti[4] = new WorkflowRequestTableField();
					wrti[4].setFieldName("product_desc");// 产品内容描述
					//wrti[4].setFieldValue(aixuLawsuiDetails.get(i).getProductDesc());
					wrti[4].setFieldValue("44");
					wrti[4].setView(true);
					wrti[4].setEdit(true);

					wrti[5] = new WorkflowRequestTableField();
					wrti[5].setFieldName("base_id");// 客诉id
					//wrti[5].setFieldValue(aixuLawsuiDetails.get(i).getBaseId());
					wrti[5].setFieldValue("3432");
					wrti[5].setView(true);
					wrti[5].setEdit(true);
					
					wrti[6] = new WorkflowRequestTableField();
					wrti[6].setFieldName("create_time");// 客诉id
					//wrti[6].setFieldValue(aixuLawsuiDetails.get(i).getBaseId());
					wrti[6].setFieldValue("2017-12-21");
					wrti[6].setView(true);
					wrti[6].setEdit(true);

					dtr.setWorkflowRequestTableFields(wrti);
					dtrs1[i] = dtr;

				}

				WorkflowDetailTableInfo wdtf1 = new WorkflowDetailTableInfo();
				wdtf1.setWorkflowRequestTableRecords(dtrs1);

				// 子表单-2
				WorkflowRequestTableRecord[] dtrs2 = new WorkflowRequestTableRecord[10];//aixuCustomDos.size()
				for (int i = 0; i < 10; i++) {
					Map<String, String> map = itemTable.get(i);
					// 一行
					WorkflowRequestTableRecord dtr = new WorkflowRequestTableRecord();
					// 字段
					WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[30];
					wrti[0] = new WorkflowRequestTableField();
					wrti[0].setFieldName("custom_do_id");// 主键
					//wrti[0].setFieldValue(aixuCustomDos.get(i).getId());
					wrti[0].setFieldValue("3344");
					wrti[0].setView(true);// 字段是否可见
					wrti[0].setEdit(true);// 字段是否可编辑

					wrti[1] = new WorkflowRequestTableField();
					wrti[1].setFieldName("type");// 方式
					//wrti[1].setFieldValue(aixuCustomDos.get(i).getType());
					wrti[1].setFieldValue("342");
					wrti[1].setView(true);
					wrti[1].setEdit(true);

					wrti[2] = new WorkflowRequestTableField();
					wrti[2].setFieldName("custom_reduce");// 客户降档
					//wrti[2].setFieldValue(aixuCustomDos.get(i).getCustomReduce() == null ? ""
					//		: aixuCustomDos.get(i).getCustomReduce());
					wrti[2].setFieldValue("342");
					wrti[2].setView(true);
					wrti[2].setEdit(true);

					wrti[3] = new WorkflowRequestTableField();
					wrti[3].setFieldName("custom_mount");// 客户数量
					//wrti[3].setFieldValue(aixuCustomDos.get(i).getCustomMount().toString());
					wrti[3].setFieldValue("33");
					wrti[3].setView(true);
					wrti[3].setEdit(true);

					wrti[4] = new WorkflowRequestTableField();
					wrti[4].setFieldName("judge_reduce");// 判定降档
					/*wrti[4].setFieldValue(
							aixuCustomDos.get(i).getJudgeReduce() == null ? "" : 
								aixuCustomDos.get(i).getJudgeReduce());*/
					wrti[4].setFieldValue("34");
					wrti[4].setView(true);
					wrti[4].setEdit(true);

					wrti[5] = new WorkflowRequestTableField();
					wrti[5].setFieldName("judge_mount");// 判定数量
					/*wrti[5].setFieldValue(aixuCustomDos.get(i).getJudgeMount() == null ? ""
							: aixuCustomDos.get(i).getJudgeMount().toString());*/
					wrti[5].setFieldValue("34");
					wrti[5].setView(true);
					wrti[5].setEdit(true);

					wrti[6] = new WorkflowRequestTableField();
					wrti[6].setFieldName("plan_date");// 计划完成时间
					//wrti[6].setFieldValue(sdf.format(aixuCustomDos.get(i).getPlanDate()));
					wrti[6].setFieldValue(sdf.format(new Date()));
					wrti[6].setView(true);
					wrti[6].setEdit(true);

					wrti[7] = new WorkflowRequestTableField();
					wrti[7].setFieldName("base_id");// 客诉id
					//wrti[7].setFieldValue(aixuCustomDos.get(i).getBaseId());
					wrti[7].setFieldValue("34");
					wrti[7].setView(true);
					wrti[7].setEdit(true);

					wrti[8] = new WorkflowRequestTableField();
					wrti[8].setFieldName("create_time");// 客诉id
					//wrti[6].setFieldValue(aixuLawsuiDetails.get(i).getBaseId());
					wrti[8].setFieldValue("2017-12-21");
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
}
