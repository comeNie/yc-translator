package com.ai.yc.translator.dao.mapper.interfaces;

import com.ai.yc.translator.dao.mapper.bo.UsrParentLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrParentLanguageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrParentLanguageMapper {
    int countByExample(UsrParentLanguageCriteria example);

    int deleteByExample(UsrParentLanguageCriteria example);

    int deleteByPrimaryKey(String pkDicTable);

    int insert(UsrParentLanguage record);

    int insertSelective(UsrParentLanguage record);

    List<UsrParentLanguage> selectByExample(UsrParentLanguageCriteria example);

    UsrParentLanguage selectByPrimaryKey(String pkDicTable);

    int updateByExampleSelective(@Param("record") UsrParentLanguage record, @Param("example") UsrParentLanguageCriteria example);

    int updateByExample(@Param("record") UsrParentLanguage record, @Param("example") UsrParentLanguageCriteria example);

    int updateByPrimaryKeySelective(UsrParentLanguage record);

    int updateByPrimaryKey(UsrParentLanguage record);
}