package com.ai.yc.translator.service.atom.interfaces;

import java.util.List;

import com.ai.yc.translator.dao.mapper.bo.UsrCertificate;
import com.ai.yc.translator.dao.mapper.bo.UsrEducation;
import com.ai.yc.translator.dao.mapper.bo.UsrExtend;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLsp;
import com.ai.yc.translator.dao.mapper.bo.UsrLspCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLspRelation;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.dao.mapper.bo.UsrWork;


public interface IYCTranslatorServiceAtomSV {
	
	public List<UsrLanguage> getUsrLanguageList(String translatorId);

	public UsrLsp searchLspById(String lspId) ;

	public List<UsrLsp> searchLspByName(UsrLspCriteria example) ;

	public UsrTranslator getUsrTranslatorInfo(String userId);
	
	public UsrTranslator getUsrTranslatorInfoByTranslatorId(String translatorId);

	public int insertTranslatorInc(UsrTranslator newTranslator);

	public UsrLspRelation getUsrLspRelationByTranslatorId(String translatorId);

	public int updateTranslatorInc(UsrTranslator newTranslator);

	public int deleteLanguageSkillByTranslator(String translatorId);

	public int insertTranslatorLanguageSkill(UsrLanguage ulm);

	public int deleteEducationByTranslatorId(String translatorId);

	public int insertEducation(UsrEducation translatorEducation);

	public List<UsrEducation> searchEduByTranslatorId(String translatorId);

	public int deleteWorkExprienceByTranslatorId(String translatorId);

	public int insertWorkExprience(UsrWork work);

	public List<UsrWork> searchWorkByTranslatorId(String translatorId);

	public int deleteCertificateByTranslatorId(String translatorId);

	public int insertTranslatorCertificate(UsrCertificate certificate);

	public int deleteExtendByTranslatorId(String translatorId);

	public int insertTranslatorExtend(UsrExtend extend);

	public List<UsrCertificate> searchCertificateByTranslatorId(String translatorId);

	public List<UsrExtend> searchExtendByTranslatorId(String translatorId);
	
}
