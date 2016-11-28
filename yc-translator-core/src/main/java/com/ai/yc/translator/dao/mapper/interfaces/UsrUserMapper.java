package com.ai.yc.translator.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ai.yc.translator.dao.mapper.bo.UsrUser;
import com.ai.yc.translator.dao.mapper.bo.UsrUserCriteria;

public interface UsrUserMapper {
    int countByExample(UsrUserCriteria example);

    int deleteByExample(UsrUserCriteria example);

    int deleteByPrimaryKey(String userId);

    int insert(UsrUser record);

    int insertSelective(UsrUser record);

    List<UsrUser> selectByExample(UsrUserCriteria example);

    UsrUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UsrUser record, @Param("example") UsrUserCriteria example);

    int updateByExample(@Param("record") UsrUser record, @Param("example") UsrUserCriteria example);

    int updateByPrimaryKeySelective(UsrUser record);

    int updateByPrimaryKey(UsrUser record);
}