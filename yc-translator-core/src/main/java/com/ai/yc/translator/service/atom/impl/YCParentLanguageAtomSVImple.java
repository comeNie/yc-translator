package com.ai.yc.translator.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.translator.dao.mapper.bo.UsrParentLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrParentLanguageCriteria;
import com.ai.yc.translator.dao.mapper.interfaces.UsrParentLanguageMapper;
import com.ai.yc.translator.service.atom.interfaces.IYCParentLanguageAtomSV;

@Component
public class YCParentLanguageAtomSVImple implements IYCParentLanguageAtomSV{
	
	@Autowired
	private  transient UsrParentLanguageMapper usrParentLanguageMapper;
	
	@Override
	public List<UsrParentLanguage> queryExtendValue(
			UsrParentLanguageCriteria example) {
		return usrParentLanguageMapper.selectByExample(example);
	}
	

}
