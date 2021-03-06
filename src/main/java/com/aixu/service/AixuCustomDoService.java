package com.aixu.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aixu.bean.AixuCustomDo;
import com.aixu.bean.AixuCustomDoExample;
import com.aixu.dao.AixuCustomDoMapper;

/**
* @desc	客户处理
* @date 2017年12月19日
*/

@Service
public class AixuCustomDoService {
	private final static Logger logger = LoggerFactory.getLogger(AixuCustomDoService.class);
	@Autowired
	private AixuCustomDoMapper AixuCustomDoDao;
	
	/**
	 * @desc  存储客户处理
	 * @param aixuCustomDos
	 * @return
	 */
	@Transactional
	public boolean saveAixuCustomDo(List<AixuCustomDo> aixuCustomDos) {
		try {
			for(int i=0; i<aixuCustomDos.size(); i++) {
				aixuCustomDos.get(i).setHandleState("审批中");
				AixuCustomDoDao.insert(aixuCustomDos.get(i));				//存储客户处理
			}
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			logger.info("<--客户处理存储出错-->");
			return false;
		}
	}
	
	/**
	 * @desc 通过客诉id取客户处理
	 * @param id
	 * @return
	 */
	public List<AixuCustomDo> getCustomDoByBaseId(String id){
		AixuCustomDoExample exp = new AixuCustomDoExample();
		exp.createCriteria().andBaseIdEqualTo(id);
		return AixuCustomDoDao.selectByExample(exp);
	}
	
	/**
	 * @desc  根据id获取客户处理
	 * @param id
	 * @return
	 */
	public AixuCustomDo getCustomDoById(String id) {
		return AixuCustomDoDao.selectByPrimaryKey(id);
	}
	
	/**
	 * @desc  更新客户处理
	 * @param aixuCustomDo
	 * @return
	 */
	@Transactional
	public boolean updateCustomer(AixuCustomDo aixuCustomDo) {
		try {
			AixuCustomDoDao.updateByPrimaryKeySelective(aixuCustomDo);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}

