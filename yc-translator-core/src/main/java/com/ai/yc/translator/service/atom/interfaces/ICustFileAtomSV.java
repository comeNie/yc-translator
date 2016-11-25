package com.ai.yc.translator.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.yc.translator.dao.mapper.bo.UsrCustFileExt;
import com.ai.yc.translator.dao.mapper.bo.UsrCustFileExtCriteria;


public interface ICustFileAtomSV {

    int insert(UsrCustFileExt record);

    int updateByExampleSelective(@Param("record") UsrCustFileExt record, @Param("example") UsrCustFileExtCriteria example);
    
    List<UsrCustFileExt> selectByExample(UsrCustFileExtCriteria example);
    
}
