package com.aixu.dao;

import com.aixu.bean.AixuNbzgxgyz;
import com.aixu.bean.AixuNbzgxgyzExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AixuNbzgxgyzMapper {
    int countByExample(AixuNbzgxgyzExample example);

    int deleteByExample(AixuNbzgxgyzExample example);

    int deleteByPrimaryKey(String nbzgxgyzId);

    int insert(AixuNbzgxgyz record);

    int insertSelective(AixuNbzgxgyz record);

    List<AixuNbzgxgyz> selectByExample(AixuNbzgxgyzExample example);

    AixuNbzgxgyz selectByPrimaryKey(String nbzgxgyzId);

    int updateByExampleSelective(@Param("record") AixuNbzgxgyz record, @Param("example") AixuNbzgxgyzExample example);

    int updateByExample(@Param("record") AixuNbzgxgyz record, @Param("example") AixuNbzgxgyzExample example);

    int updateByPrimaryKeySelective(AixuNbzgxgyz record);

    int updateByPrimaryKey(AixuNbzgxgyz record);
    
    //  外键查询
    List<AixuNbzgxgyz> selectByFk(String baseId);
}