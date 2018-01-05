package com.aixu.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aixu.bean.AixuNbzgdc;
import com.aixu.dao.AixuNbzgdcMapper;

@Service
public class StrategyService {
	
	private final static Logger logger = LoggerFactory.getLogger(AixuCustomDoService.class);
	
	@Autowired
	private AixuNbzgdcMapper strategyDAO;
	
	/**
	 * 添加策略
	 * @param strategy 实体类
	 */
	@Transactional
	@Async
	public void saveStrategy(AixuNbzgdc strategy) {
		try {
			strategyDAO.insertSelective(strategy);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("<--整改策略存储出错-->");
			e.printStackTrace();
		}
	}
	
}
