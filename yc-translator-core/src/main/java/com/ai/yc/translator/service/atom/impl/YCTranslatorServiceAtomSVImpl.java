package com.ai.yc.translator.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.translator.dao.mapper.bo.UsrCertificate;
import com.ai.yc.translator.dao.mapper.bo.UsrCertificateCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrEducation;
import com.ai.yc.translator.dao.mapper.bo.UsrEducationCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrExtend;
import com.ai.yc.translator.dao.mapper.bo.UsrExtendCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguageCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLsp;
import com.ai.yc.translator.dao.mapper.bo.UsrLspCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLspRelation;
import com.ai.yc.translator.dao.mapper.bo.UsrLspRelationCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslatorCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrWork;
import com.ai.yc.translator.dao.mapper.bo.UsrWorkCriteria;
import com.ai.yc.translator.dao.mapper.interfaces.UsrCertificateMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrEducationMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrExtendMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrLanguageMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrLspMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrLspRelationMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrTranslatorMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrWorkMapper;
import com.ai.yc.translator.service.atom.interfaces.IYCTranslatorServiceAtomSV;

@Component
public class YCTranslatorServiceAtomSVImpl implements IYCTranslatorServiceAtomSV {

	@Autowired
	private transient UsrTranslatorMapper uTranslatorMapper;

	@Autowired
	private transient UsrLanguageMapper uLanguageMapper;

	@Autowired
	private transient UsrLspMapper uLspMapper;

	@Autowired
	private transient UsrLspRelationMapper uLspRelationMapper;

	@Autowired
	private transient UsrEducationMapper uEduMapper;
	
	@Autowired
	private transient UsrWorkMapper uWorkMapper;
	
	@Autowired
	private transient UsrCertificateMapper uCertificateMapper;
	
	@Autowired
	private transient UsrExtendMapper uExtendMapper;

	@Override
	public UsrTranslator getUsrTranslatorInfo(String userId) {
		UsrTranslatorCriteria example = new UsrTranslatorCriteria();
		UsrTranslatorCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<UsrTranslator> list = uTranslatorMapper.selectByExample(example);
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	@Override
	public UsrTranslator getUsrTranslatorInfoByTranslatorId(String translatorId) {
		UsrTranslatorCriteria example = new UsrTranslatorCriteria();
		UsrTranslatorCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(translatorId);
		List<UsrTranslator> list = uTranslatorMapper.selectByExample(example);
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	@Override
	public List<UsrLanguage> getUsrLanguageList(String userId) {
		UsrLanguageCriteria example = new UsrLanguageCriteria();
		UsrLanguageCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		return uLanguageMapper.selectByExample(example);
	}

	@Override
	public UsrLsp searchLspById(String lspId) {
		return uLspMapper.selectByPrimaryKey(lspId);
	}

	@Override
	public List<UsrLsp> searchLspByName(UsrLspCriteria example) {
		return uLspMapper.selectByExample(example);
	}

	@Override
	public int insertTranslatorInc(UsrTranslator newTranslator) {
		return uTranslatorMapper.insertSelective(newTranslator);
	}

	@Override
	public UsrLspRelation getUsrLspRelationByTranslatorId(String translatorId) {
		UsrLspRelationCriteria example = new UsrLspRelationCriteria();
		UsrLspRelationCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(translatorId);
		List<UsrLspRelation> list = uLspRelationMapper.selectByExample(example);
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	/**
	 * TranslatorId为主键
	 */
	@Override
	public int updateTranslatorInc(UsrTranslator newTranslator) {
		return uTranslatorMapper.updateByPrimaryKey(newTranslator);
	}

	@Override
	public int deleteLanguageSkillByTranslator(String userId) {
		UsrLanguageCriteria example = new UsrLanguageCriteria();
		UsrLanguageCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		return uLanguageMapper.deleteByExample(example);
	}

	@Override
	public int insertTranslatorLanguageSkill(UsrLanguage ulm) {
		return uLanguageMapper.insert(ulm);
	}

	@Override
	public int deleteEducationByTranslatorId(String translatorId) {
		UsrEducationCriteria example = new UsrEducationCriteria();
		UsrEducationCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(translatorId);
		return uEduMapper.deleteByExample(example);
	}

	@Override
	public int insertEducation(UsrEducation translatorEducation) {
		return uEduMapper.insertSelective(translatorEducation);
	}

	@Override
	public List<UsrEducation> searchEduByTranslatorId(String translatorId) {
		UsrEducationCriteria example = new UsrEducationCriteria();
		UsrEducationCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(translatorId);
		List<UsrEducation> list = uEduMapper.selectByExample(example);
		return list;
	}

	@Override
	public int deleteWorkExprienceByTranslatorId(String translatorId) {
		UsrWorkCriteria example = new UsrWorkCriteria();
		UsrWorkCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(translatorId);
		return uWorkMapper.deleteByExample(example);
	}

	@Override
	public int insertWorkExprience(UsrWork work) {
		// TODO Auto-generated method stub
		return uWorkMapper.insertSelective(work);
	}

	@Override
	public List<UsrWork> searchWorkByTranslatorId(String translatorId) {
		UsrWorkCriteria example = new UsrWorkCriteria();
		UsrWorkCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(translatorId);
		List<UsrWork> list = uWorkMapper.selectByExample(example);
		return list;
	}
	
	@Override
	public int deleteCertificateByTranslatorId(String translatorId) {
		UsrCertificateCriteria example = new UsrCertificateCriteria();
		UsrCertificateCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(translatorId);
		return uCertificateMapper.deleteByExample(example);
	}

	@Override
	public int insertTranslatorCertificate(UsrCertificate certificate) {
		return uCertificateMapper.insertSelective(certificate);
	}

	@Override
	public int deleteExtendByTranslatorId(String translatorId) {
		UsrExtendCriteria example = new UsrExtendCriteria();
		UsrExtendCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(translatorId);
		return uExtendMapper.deleteByExample(example);
	}

	@Override
	public int insertTranslatorExtend(UsrExtend extend) {
		return uExtendMapper.insert(extend);
	}

	@Override
	public List<UsrCertificate> searchCertificateByTranslatorId(String translatorId) {
		UsrCertificateCriteria example = new UsrCertificateCriteria();
		UsrCertificateCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(translatorId);
		List<UsrCertificate> list = uCertificateMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<UsrExtend> searchExtendByTranslatorId(String translatorId) {
		UsrExtendCriteria example = new UsrExtendCriteria();
		UsrExtendCriteria.Criteria criteria = example.createCriteria();
		criteria.andTranslatorIdEqualTo(translatorId);
		List<UsrExtend> list = uExtendMapper.selectByExample(example);
		return list;
	}

	@Override
	public int updateTranslatorByUserId(UsrTranslator newTranslator,
			UsrTranslatorCriteria criteria) {
		return uTranslatorMapper.updateByExampleSelective(newTranslator, criteria);
	}

	@Override
	public int deleteTranslatorInfo(String translatorId) {
		// TODO Auto-generated method stub
		return uTranslatorMapper.deleteByPrimaryKey(translatorId);
	}

}
