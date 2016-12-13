package com.ai.yc.translator.dao.mapper.interfaces;

import com.ai.yc.translator.dao.mapper.bo.UsrLspRelation;
import com.ai.yc.translator.dao.mapper.bo.UsrLspRelationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrLspRelationMapper {
    int countByExample(UsrLspRelationCriteria example);

    int deleteByExample(UsrLspRelationCriteria example);

    int deleteByPrimaryKey(String lspTranslatorId);

    int insert(UsrLspRelation record);

    int insertSelective(UsrLspRelation record);

    List<UsrLspRelation> selectByExample(UsrLspRelationCriteria example);

    UsrLspRelation selectByPrimaryKey(String lspTranslatorId);

    int updateByExampleSelective(@Param("record") UsrLspRelation record, @Param("example") UsrLspRelationCriteria example);

    int updateByExample(@Param("record") UsrLspRelation record, @Param("example") UsrLspRelationCriteria example);

    int updateByPrimaryKeySelective(UsrLspRelation record);

    int updateByPrimaryKey(UsrLspRelation record);
}