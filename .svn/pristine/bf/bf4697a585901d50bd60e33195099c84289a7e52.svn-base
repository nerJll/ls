package com.aixu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aixu.bean.AixuBadReason;
import com.aixu.dao.AixuBadReasonMapper;

@Service
public class BadReasonService {
	@Autowired
	private AixuBadReasonMapper badReasonDAO;
	
	/**
	 * 父分类
	 * @return
	 */
	public List<AixuBadReason> getParentReason() {
		List<AixuBadReason> parentsList = this.badReasonDAO.selectParentNode();
		return parentsList;
	}
	
	/**
	 * 子项目
	 * @return
	 */
	public List<AixuBadReason> getSonReason(Integer parentId) {
		List<AixuBadReason> sonsList = this.badReasonDAO.selectSonNode(parentId);
		return sonsList;
	}
}
