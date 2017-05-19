package com.ai.yc.translator.dao.mapper.interfaces;

import com.ai.yc.translator.dao.mapper.bo.UsrWork;
import com.ai.yc.translator.dao.mapper.bo.UsrWorkCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrWorkMapper {
    int countByExample(UsrWorkCriteria example);

    int deleteByExample(UsrWorkCriteria example);

    int deleteByPrimaryKey(String workId);

    int insert(UsrWork record);

    int insertSelective(UsrWork record);

    List<UsrWork> selectByExample(UsrWorkCriteria example);

    UsrWork selectByPrimaryKey(String workId);

    int updateByExampleSelective(@Param("record") UsrWork record, @Param("example") UsrWorkCriteria example);

    int updateByExample(@Param("record") UsrWork record, @Param("example") UsrWorkCriteria example);

    int updateByPrimaryKeySelective(UsrWork record);

    int updateByPrimaryKey(UsrWork record);
}