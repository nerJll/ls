package com.aixu.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.bean.AixuCustomDo;
import com.aixu.bean.AixuLawsuiDetail;
import com.aixu.bean.AixuNbfxpcl;
import com.aixu.bean.AixuZrrd;
import com.aixu.entity.AixuUser;

/**
 * @desc	OA触发方法
 * @author jianglinle
 * @date 2017年12月8日
 */
public class OAUtils {
	/**
	 * @desc  触发OA审批：基本信息+客户处理
	 * @param lch 流程号：722 	
	 * @param wjid 申请人号：
	 */
	public static void sendOABaseInfo1(String lch, String userId,
			AixuBaseLawsuit aixuBaseLawsuit,
			List<AixuLawsuiDetail> aixuLawsuiDetails,
			List<AixuCustomDo> aixuCustomDos,
			AixuUser user) {
		List<Map<String, String>> itemTableMap = null;
		Map<String, String> mainTableMap = null;
		mainTableMap = new HashMap<String, String>();
		mainTableMap.put("apply_user", "1016087");
		itemTableMap = new ArrayList<Map<String, String>>();
		for (int i = 0; i < 10; i++) {
			Map<String, String> map = new HashMap<String, String>();
			itemTableMap.add(map);
		}
		//OA流程
		String workflowId = lch;	//722
		int createId = Integer.parseInt(userId); //1551
		String result = OAUtils_Send.sendOABaseInfo1(mainTableMap, itemTableMap, 
				workflowId, createId,
				aixuBaseLawsuit,
				aixuLawsuiDetails,
				aixuCustomDos,
				user);
		System.out.print(result);
	}
	
	/**
	 * @desc  触发OA审批：基本信息+内部风险品处理
	 * @param lch 流程号：742 	
	 * @param wjid 申请人号：
	 */
	public static void sendOABaseInfo2(String lch, String userId,
			AixuBaseLawsuit aixuBaseLawsuit,
			List<AixuLawsuiDetail> aixuLawsuiDetails,
			List<AixuNbfxpcl> AixuNbfxpcls,
			AixuUser user) {
		List<Map<String, String>> itemTableMap = null;
		Map<String, String> mainTableMap = null;
		mainTableMap = new HashMap<String, String>();
		mainTableMap.put("apply_user", "1016087");
		itemTableMap = new ArrayList<Map<String, String>>();
		for (int i = 0; i < 10; i++) {
			Map<String, String> map = new HashMap<String, String>();
			itemTableMap.add(map);
		}
		//OA流程
		String workflowId = lch;	//722
		int createId = Integer.parseInt(userId); //1551
		String result = OAUtils_Send.sendOABaseInfo2(mainTableMap, itemTableMap, 
				workflowId, createId,
				aixuBaseLawsuit,
				aixuLawsuiDetails,
				AixuNbfxpcls,
				user);
		System.out.print(result);
	}

	/**
	 * @desc  触发OA审批：基本信息+责任认定
	 * @param lch 流程号：737 	
	 * @param wjid 申请人号：
	 */
	public static void sendOABaseInfo3(String lch, String userId,
			AixuBaseLawsuit aixuBaseLawsuit,
			List<AixuLawsuiDetail> aixuLawsuiDetails,
			List<AixuZrrd> aixuZrrds,
			AixuUser user) {
		List<Map<String, String>> itemTableMap = null;
		Map<String, String> mainTableMap = null;
		mainTableMap = new HashMap<String, String>();
		mainTableMap.put("apply_user", "1016087");
		itemTableMap = new ArrayList<Map<String, String>>();
		for (int i = 0; i < 10; i++) {
			Map<String, String> map = new HashMap<String, String>();
			itemTableMap.add(map);
		}
		//OA流程
		String workflowId = lch;	//737
		int createId = Integer.parseInt(userId); //1551
		String result = OAUtils_Send.sendOABaseInfo3(mainTableMap, itemTableMap, 
				workflowId, createId,
				aixuBaseLawsuit,
				aixuLawsuiDetails,
				aixuZrrds,
				user);
		System.out.print(result);
	}
}
