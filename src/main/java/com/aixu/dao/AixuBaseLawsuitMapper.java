package com.aixu.dao;

import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.bean.AixuBaseLawsuitExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AixuBaseLawsuitMapper {
    int countByExample(AixuBaseLawsuitExample example);

    int deleteByExample(AixuBaseLawsuitExample example);

    int deleteByPrimaryKey(String id);

    int insert(AixuBaseLawsuit record);

    int insertSelective(AixuBaseLawsuit record);

    List<AixuBaseLawsuit> selectByExampleWithBLOBs(AixuBaseLawsuitExample example);

    List<AixuBaseLawsuit> selectByExample(AixuBaseLawsuitExample example);

    AixuBaseLawsuit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AixuBaseLawsuit record, @Param("example") AixuBaseLawsuitExample example);

    int updateByExampleWithBLOBs(@Param("record") AixuBaseLawsuit record, @Param("example") AixuBaseLawsuitExample example);

    int updateByExample(@Param("record") AixuBaseLawsuit record, @Param("example") AixuBaseLawsuitExample example);

    int updateByPrimaryKeySelective(AixuBaseLawsuit record);

    int updateByPrimaryKeyWithBLOBs(AixuBaseLawsuit record);

    int updateByPrimaryKey(AixuBaseLawsuit record);
}