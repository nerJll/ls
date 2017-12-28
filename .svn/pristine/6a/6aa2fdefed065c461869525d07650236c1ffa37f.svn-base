package com.aixu.dao;

import com.aixu.bean.AixuBadReason;
import com.aixu.bean.AixuBadReasonExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AixuBadReasonMapper {
    int countByExample(AixuBadReasonExample example);

    int deleteByExample(AixuBadReasonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AixuBadReason record);

    int insertSelective(AixuBadReason record);

    List<AixuBadReason> selectByExample(AixuBadReasonExample example);

    AixuBadReason selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AixuBadReason record, @Param("example") AixuBadReasonExample example);

    int updateByExample(@Param("record") AixuBadReason record, @Param("example") AixuBadReasonExample example);

    int updateByPrimaryKeySelective(AixuBadReason record);

    int updateByPrimaryKey(AixuBadReason record);
    
    List<AixuBadReason> selectParentNode();
    
    List<AixuBadReason> selectSonNode(Integer parentId);
}