package com.aixu.dao;

import com.aixu.bean.AixuCustomDo;
import com.aixu.bean.AixuCustomDoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AixuCustomDoMapper {
    int countByExample(AixuCustomDoExample example);

    int deleteByExample(AixuCustomDoExample example);

    int deleteByPrimaryKey(String id);

    int insert(AixuCustomDo record);

    int insertSelective(AixuCustomDo record);

    List<AixuCustomDo> selectByExample(AixuCustomDoExample example);

    AixuCustomDo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AixuCustomDo record, @Param("example") AixuCustomDoExample example);

    int updateByExample(@Param("record") AixuCustomDo record, @Param("example") AixuCustomDoExample example);

    int updateByPrimaryKeySelective(AixuCustomDo record);

    int updateByPrimaryKey(AixuCustomDo record);
    
    // 外间查询
    List<AixuCustomDo> selectByFk(String baseId);
    	
}