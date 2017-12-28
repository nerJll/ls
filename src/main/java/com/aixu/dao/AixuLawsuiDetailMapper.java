package com.aixu.dao;

import com.aixu.bean.AixuLawsuiDetail;
import com.aixu.bean.AixuLawsuiDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AixuLawsuiDetailMapper {
    int countByExample(AixuLawsuiDetailExample example);

    int deleteByExample(AixuLawsuiDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(AixuLawsuiDetail record);

    int insertSelective(AixuLawsuiDetail record);

    List<AixuLawsuiDetail> selectByExample(AixuLawsuiDetailExample example);

    AixuLawsuiDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AixuLawsuiDetail record, @Param("example") AixuLawsuiDetailExample example);

    int updateByExample(@Param("record") AixuLawsuiDetail record, @Param("example") AixuLawsuiDetailExample example);

    int updateByPrimaryKeySelective(AixuLawsuiDetail record);

    int updateByPrimaryKey(AixuLawsuiDetail record);
    
    // fk query
    List<AixuLawsuiDetail> selectByFk(String baseId);
    	
}