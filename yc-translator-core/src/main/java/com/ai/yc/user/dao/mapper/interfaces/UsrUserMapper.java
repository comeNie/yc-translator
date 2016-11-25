package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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