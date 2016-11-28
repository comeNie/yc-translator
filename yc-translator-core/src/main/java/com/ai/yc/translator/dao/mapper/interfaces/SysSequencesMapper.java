package com.ai.yc.translator.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ai.yc.translator.dao.mapper.bo.SysSequences;
import com.ai.yc.translator.dao.mapper.bo.SysSequencesCriteria;

public interface SysSequencesMapper {
    int countByExample(SysSequencesCriteria example);

    int deleteByExample(SysSequencesCriteria example);

    int deleteByPrimaryKey(String sequenceName);

    int insert(SysSequences record);

    int insertSelective(SysSequences record);

    List<SysSequences> selectByExample(SysSequencesCriteria example);

    SysSequences selectByPrimaryKey(String sequenceName);

    int updateByExampleSelective(@Param("record") SysSequences record, @Param("example") SysSequencesCriteria example);

    int updateByExample(@Param("record") SysSequences record, @Param("example") SysSequencesCriteria example);

    int updateByPrimaryKeySelective(SysSequences record);

    int updateByPrimaryKey(SysSequences record);
}