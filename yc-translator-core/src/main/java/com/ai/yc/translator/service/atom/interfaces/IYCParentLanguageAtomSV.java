package com.ai.yc.translator.service.atom.interfaces;

import java.util.List;

import com.ai.yc.translator.dao.mapper.bo.UsrParentLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrParentLanguageCriteria;

public interface IYCParentLanguageAtomSV {
	
	public List<UsrParentLanguage> queryExtendValue(UsrParentLanguageCriteria example);
	
}
