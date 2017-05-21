package com.ai.yc.translator.service.atom.interfaces;
import java.util.List;

import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguageCriteria;

public interface IYCUserLanguageAtomSV {
	
	public int insertUserLanguageInfo(UsrLanguage usrLanguage);
	
	public List<UsrLanguage> queryUserLanguage(UsrLanguageCriteria example);
}
