package com.ai.yc.translator.service.atom.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguageCriteria;
import com.ai.yc.translator.dao.mapper.interfaces.UsrLanguageMapper;
import com.ai.yc.translator.service.atom.interfaces.IYCUserLanguageAtomSV;

@Component
public class YCUserLanguageAtomSVImple implements IYCUserLanguageAtomSV{
	
	@Autowired
	private  transient UsrLanguageMapper usrLanguageMapper;

	@Override
	public int insertUserLanguageInfo(UsrLanguage usrLanguage) {
		return usrLanguageMapper.insertSelective(usrLanguage);
	}

	@Override
	public List<UsrLanguage> queryUserLanguage(UsrLanguageCriteria example) {
		return usrLanguageMapper.selectByExample(example);
	}
	
	

}
