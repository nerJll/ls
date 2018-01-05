package com.aixu.util;

import java.util.HashMap;
import java.util.Map;

/**
* @desc 人为获取部门id
* @date 2018年1月4日
*/
public class DepFactory {
	
	public static String getDepIdByName(String depName) {
		Map<String,String> depMap = new HashMap<>();
		depMap.put("爱旭测试", "246");
		depMap.put("爱旭测试1", "458");
		return depMap.get(depName);
	}
}

