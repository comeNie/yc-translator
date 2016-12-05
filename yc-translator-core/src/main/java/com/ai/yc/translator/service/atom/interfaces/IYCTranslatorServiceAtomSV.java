package com.ai.yc.translator.service.atom.interfaces;

import java.util.List;

import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguageCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLsp;
import com.ai.yc.translator.dao.mapper.bo.UsrLspCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;


public interface IYCTranslatorServiceAtomSV {
	
	public List<UsrLanguage> getUsrLanguageList(UsrLanguageCriteria userIdCri);

	public UsrLsp searchLspById(String lspId) ;

	public List<UsrLsp> searchLspByName(UsrLspCriteria example) ;

	public UsrTranslator getUsrTranslatorInfo(String userId);
	
	public UsrTranslator getUsrTranslatorInfoByTranslatorId(String translatorId);

	public int insertTranslatorInc(UsrTranslator newTranslator);

}
