package com.ai.yc.translator.dao.mapper.interfaces;

import com.ai.yc.translator.dao.mapper.bo.UsrLsp;
import com.ai.yc.translator.dao.mapper.bo.UsrLspCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrLspMapper {
    int countByExample(UsrLspCriteria example);

    int deleteByExample(UsrLspCriteria example);

    int deleteByPrimaryKey(String lspId);

    int insert(UsrLsp record);

    int insertSelective(UsrLsp record);

    List<UsrLsp> selectByExample(UsrLspCriteria example);

    UsrLsp selectByPrimaryKey(String lspId);

    int updateByExampleSelective(@Param("record") UsrLsp record, @Param("example") UsrLspCriteria example);

    int updateByExample(@Param("record") UsrLsp record, @Param("example") UsrLspCriteria example);

    int updateByPrimaryKeySelective(UsrLsp record);

    int updateByPrimaryKey(UsrLsp record);
}