package com.ai.yc.translator.dao.mapper.interfaces;

import com.ai.yc.translator.dao.mapper.bo.UsrEducation;
import com.ai.yc.translator.dao.mapper.bo.UsrEducationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrEducationMapper {
    int countByExample(UsrEducationCriteria example);

    int deleteByExample(UsrEducationCriteria example);

    int deleteByPrimaryKey(String educationId);

    int insert(UsrEducation record);

    int insertSelective(UsrEducation record);

    List<UsrEducation> selectByExample(UsrEducationCriteria example);

    UsrEducation selectByPrimaryKey(String educationId);

    int updateByExampleSelective(@Param("record") UsrEducation record, @Param("example") UsrEducationCriteria example);

    int updateByExample(@Param("record") UsrEducation record, @Param("example") UsrEducationCriteria example);

    int updateByPrimaryKeySelective(UsrEducation record);

    int updateByPrimaryKey(UsrEducation record);
}