package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrContactCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrContactMapper {
    int countByExample(UsrContactCriteria example);

    int deleteByExample(UsrContactCriteria example);

    int deleteByPrimaryKey(String contactId);

    int insert(UsrContact record);

    int insertSelective(UsrContact record);

    List<UsrContact> selectByExample(UsrContactCriteria example);

    UsrContact selectByPrimaryKey(String contactId);

    int updateByExampleSelective(@Param("record") UsrContact record, @Param("example") UsrContactCriteria example);

    int updateByExample(@Param("record") UsrContact record, @Param("example") UsrContactCriteria example);

    int updateByPrimaryKeySelective(UsrContact record);

    int updateByPrimaryKey(UsrContact record);
}