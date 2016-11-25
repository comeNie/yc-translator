package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.yc.user.dao.mapper.bo.UsrCustFileExt;
import com.ai.yc.user.dao.mapper.bo.UsrCustFileExtCriteria;


public interface ICustFileAtomSV {

    int insert(UsrCustFileExt record);

    int updateByExampleSelective(@Param("record") UsrCustFileExt record, @Param("example") UsrCustFileExtCriteria example);
    
    List<UsrCustFileExt> selectByExample(UsrCustFileExtCriteria example);
    
}
