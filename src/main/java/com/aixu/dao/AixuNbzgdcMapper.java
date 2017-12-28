package com.aixu.dao;

import com.aixu.bean.AixuNbzgdc;
import com.aixu.bean.AixuNbzgdcExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AixuNbzgdcMapper {
    int countByExample(AixuNbzgdcExample example);

    int deleteByExample(AixuNbzgdcExample example);

    int deleteByPrimaryKey(String nbzgdcId);

    int insert(AixuNbzgdc record);

    int insertSelective(AixuNbzgdc record);

    List<AixuNbzgdc> selectByExample(AixuNbzgdcExample example);

    AixuNbzgdc selectByPrimaryKey(String nbzgdcId);

    int updateByExampleSelective(@Param("record") AixuNbzgdc record, @Param("example") AixuNbzgdcExample example);

    int updateByExample(@Param("record") AixuNbzgdc record, @Param("example") AixuNbzgdcExample example);

    int updateByPrimaryKeySelective(AixuNbzgdc record);

    int updateByPrimaryKey(AixuNbzgdc record);
    
    // 外键查询
    List<AixuNbzgdc> selectByFk(String baseId);
}