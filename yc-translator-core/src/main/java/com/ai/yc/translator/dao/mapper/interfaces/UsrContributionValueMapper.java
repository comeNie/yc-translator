package com.ai.yc.translator.dao.mapper.interfaces;

import com.ai.yc.translator.dao.mapper.bo.UsrContributionValue;
import com.ai.yc.translator.dao.mapper.bo.UsrContributionValueCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrContributionValueMapper {
    int countByExample(UsrContributionValueCriteria example);

    int deleteByExample(UsrContributionValueCriteria example);

    int deleteByPrimaryKey(String recordId);

    int insert(UsrContributionValue record);

    int insertSelective(UsrContributionValue record);

    List<UsrContributionValue> selectByExample(UsrContributionValueCriteria example);

    UsrContributionValue selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") UsrContributionValue record, @Param("example") UsrContributionValueCriteria example);

    int updateByExample(@Param("record") UsrContributionValue record, @Param("example") UsrContributionValueCriteria example);

    int updateByPrimaryKeySelective(UsrContributionValue record);

    int updateByPrimaryKey(UsrContributionValue record);
}