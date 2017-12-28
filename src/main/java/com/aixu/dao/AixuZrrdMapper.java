package com.aixu.dao;

import com.aixu.bean.AixuZrrd;
import com.aixu.bean.AixuZrrdExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AixuZrrdMapper {
    int countByExample(AixuZrrdExample example);

    int deleteByExample(AixuZrrdExample example);

    int deleteByPrimaryKey(String zrrdId);

    int insert(AixuZrrd record);

    int insertSelective(AixuZrrd record);

    List<AixuZrrd> selectByExample(AixuZrrdExample example);

    AixuZrrd selectByPrimaryKey(String zrrdId);

    int updateByExampleSelective(@Param("record") AixuZrrd record, @Param("example") AixuZrrdExample example);

    int updateByExample(@Param("record") AixuZrrd record, @Param("example") AixuZrrdExample example);

    int updateByPrimaryKeySelective(AixuZrrd record);

    int updateByPrimaryKey(AixuZrrd record);
    
    // 外键查询
    List<AixuZrrd> selectByFk(String baseId);
}