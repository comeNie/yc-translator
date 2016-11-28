package com.ai.yc.translator.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslatorCriteria;

public interface UsrTranslatorMapper {
    int countByExample(UsrTranslatorCriteria example);

    int deleteByExample(UsrTranslatorCriteria example);

    int deleteByPrimaryKey(String translatorId);

    int insert(UsrTranslator record);

    int insertSelective(UsrTranslator record);

    List<UsrTranslator> selectByExample(UsrTranslatorCriteria example);

    UsrTranslator selectByPrimaryKey(String translatorId);

    int updateByExampleSelective(@Param("record") UsrTranslator record, @Param("example") UsrTranslatorCriteria example);

    int updateByExample(@Param("record") UsrTranslator record, @Param("example") UsrTranslatorCriteria example);

    int updateByPrimaryKeySelective(UsrTranslator record);

    int updateByPrimaryKey(UsrTranslator record);
}