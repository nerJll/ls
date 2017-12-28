package com.aixu.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aixu.bean.AixuLawsuiDetail;
import com.aixu.bean.AixuLawsuiDetailExample;
import com.aixu.dao.AixuLawsuiDetailMapper;

/**
* @desc	客诉详情
* @date 2017年12月19日
*/

@Service
public class BaseInfoDetailService {
	private final static Logger logger = LoggerFactory.getLogger(BaseInfoDetailService.class);
	@Autowired
	private AixuLawsuiDetailMapper aixuLawsuiDetailMapper;
	
	/**
	 * @desc	存储客诉详情
	 * @param aixuLawsuiDetails
	 * @return
	 */
	public boolean saveBaseInfoDetail(List<AixuLawsuiDetail> aixuLawsuiDetails) {
		try {
			for(int i=0; i<aixuLawsuiDetails.size(); i++) {
				aixuLawsuiDetailMapper.insert(aixuLawsuiDetails.get(i));	//存储客诉详情
			}
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			logger.info("<--存储客诉详情信息出错-->");
			return false;
		}
	}
	
	/**
	 * @desc 通过基本信息id获取客诉详情
	 * @param id
	 * @return
	 */
	public List<AixuLawsuiDetail> getDetilByBaseId(String id){
		AixuLawsuiDetailExample exp = new AixuLawsuiDetailExample();
		exp.createCriteria().andBaseIdEqualTo(id);
		return aixuLawsuiDetailMapper.selectByExample(exp);
	}
	
	/** 根据主键获取客诉详情
	 * @desc
	 * @param id
	 * @return
	 */
	public AixuLawsuiDetail getAixuLawsuitDetailById(String id) {
		return aixuLawsuiDetailMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * @desc  更新客诉详情
	 * @param aixuLawsuiDetail
	 * @return
	 */
	public boolean updateDetail(AixuLawsuiDetail aixuLawsuiDetail) {
		try {
			aixuLawsuiDetailMapper.updateByPrimaryKeySelective(aixuLawsuiDetail);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}

