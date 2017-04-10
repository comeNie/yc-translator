package com.ai.yc.translator.dao.mapper.interfaces;

import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrLanguageMapper {
    int countByExample(UsrLanguageCriteria example);

    int deleteByExample(UsrLanguageCriteria example);

    int deleteByPrimaryKey(String languageId);

    int insert(UsrLanguage record);

    int insertSelective(UsrLanguage record);

    List<UsrLanguage> selectByExample(UsrLanguageCriteria example);

    UsrLanguage selectByPrimaryKey(String languageId);

    int updateByExampleSelective(@Param("record") UsrLanguage record, @Param("example") UsrLanguageCriteria example);

    int updateByExample(@Param("record") UsrLanguage record, @Param("example") UsrLanguageCriteria example);

    int updateByPrimaryKeySelective(UsrLanguage record);

    int updateByPrimaryKey(UsrLanguage record);
}