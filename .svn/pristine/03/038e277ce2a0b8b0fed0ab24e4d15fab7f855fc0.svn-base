package com.aixu.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aixu.bean.AixuNbzgxgyz;
import com.aixu.dao.AixuNbzgxgyzMapper;

@Service
public class VerifyService {
	private final static Logger logger = LoggerFactory.getLogger(AixuCustomDoService.class);
	
	@Autowired
	private AixuNbzgxgyzMapper verifyDAO;
	
	@Transactional
	public void saveVerify(AixuNbzgxgyz verify) {
		try {
			verifyDAO.insertSelective(verify);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("<--效果验证存储出错-->");
			e.printStackTrace();
		}
	}
}
