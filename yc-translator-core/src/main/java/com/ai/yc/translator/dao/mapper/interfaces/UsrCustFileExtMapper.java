package com.ai.yc.translator.dao.mapper.interfaces;

import com.ai.yc.translator.dao.mapper.bo.UsrCustFileExt;
import com.ai.yc.translator.dao.mapper.bo.UsrCustFileExtCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrCustFileExtMapper {
    int countByExample(UsrCustFileExtCriteria example);

    int deleteByExample(UsrCustFileExtCriteria example);

    int deleteByPrimaryKey(String infoExtId);

    int insert(UsrCustFileExt record);

    int insertSelective(UsrCustFileExt record);

    List<UsrCustFileExt> selectByExample(UsrCustFileExtCriteria example);

    UsrCustFileExt selectByPrimaryKey(String infoExtId);

    int updateByExampleSelective(@Param("record") UsrCustFileExt record, @Param("example") UsrCustFileExtCriteria example);

    int updateByExample(@Param("record") UsrCustFileExt record, @Param("example") UsrCustFileExtCriteria example);

    int updateByPrimaryKeySelective(UsrCustFileExt record);

    int updateByPrimaryKey(UsrCustFileExt record);
}