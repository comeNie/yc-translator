package com.ai.yc.translator.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.translator.dao.mapper.bo.UsrCustFileExt;
import com.ai.yc.translator.dao.mapper.bo.UsrCustFileExtCriteria;
import com.ai.yc.translator.dao.mapper.interfaces.UsrCustFileExtMapper;
import com.ai.yc.translator.service.atom.interfaces.ICustFileAtomSV;


@Component
public class CustFileAtomSVImpl implements ICustFileAtomSV {

    @Autowired
    private transient UsrCustFileExtMapper cmCustFileExtMapper;
    
    @Override
    public int insert(UsrCustFileExt record) {
        return cmCustFileExtMapper.insert(record);
    }

    @Override
    public List<UsrCustFileExt> selectByExample(UsrCustFileExtCriteria example) {
        return cmCustFileExtMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UsrCustFileExt record, UsrCustFileExtCriteria example) {
        return cmCustFileExtMapper.updateByExampleSelective(record, example);
    }

}
