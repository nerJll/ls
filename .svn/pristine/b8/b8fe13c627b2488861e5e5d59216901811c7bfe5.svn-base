package com.aixu.dao;

import com.aixu.bean.AixuNbfxpcl;
import com.aixu.bean.AixuNbfxpclExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AixuNbfxpclMapper {
    int countByExample(AixuNbfxpclExample example);

    int deleteByExample(AixuNbfxpclExample example);

    int deleteByPrimaryKey(String nbfxpclId);

    int insert(AixuNbfxpcl record);

    int insertSelective(AixuNbfxpcl record);

    List<AixuNbfxpcl> selectByExample(AixuNbfxpclExample example);

    AixuNbfxpcl selectByPrimaryKey(String nbfxpclId);

    int updateByExampleSelective(@Param("record") AixuNbfxpcl record, @Param("example") AixuNbfxpclExample example);

    int updateByExample(@Param("record") AixuNbfxpcl record, @Param("example") AixuNbfxpclExample example);

    int updateByPrimaryKeySelective(AixuNbfxpcl record);

    int updateByPrimaryKey(AixuNbfxpcl record);
    
    // 外键查询
    List<AixuNbfxpcl> selectByFk(String baseId);
}