package com.ai.yc.translator.dao.mapper.interfaces;

import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrLanguageMapper {
    int countByExample(UsrLanguageCriteria example);

    int deleteByExample(UsrLanguageCriteria example);

    int insert(UsrLanguage record);

    int insertSelective(UsrLanguage record);

    List<UsrLanguage> selectByExample(UsrLanguageCriteria example);

    int updateByExampleSelective(@Param("record") UsrLanguage record, @Param("example") UsrLanguageCriteria example);

    int updateByExample(@Param("record") UsrLanguage record, @Param("example") UsrLanguageCriteria example);
}