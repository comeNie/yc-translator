package com.ai.yc.translator.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguageCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLsp;
import com.ai.yc.translator.dao.mapper.bo.UsrLspCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslatorCriteria;
import com.ai.yc.translator.dao.mapper.interfaces.UsrLanguageMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrLspMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrTranslatorMapper;
import com.ai.yc.translator.service.atom.interfaces.IYCTranslatorServiceAtomSV;


@Component
public class YCTranslatorServiceAtomSVImpl implements IYCTranslatorServiceAtomSV {

	@Autowired
	private transient UsrTranslatorMapper uTranslatorMapper;

	
	@Autowired
	private transient UsrLanguageMapper uLanguageMapper;
	
	@Autowired
	private transient UsrLspMapper uLspMapper;
	
	@Override
	public UsrTranslator getUsrTranslatorInfo(String userId) {
		UsrTranslatorCriteria example = new UsrTranslatorCriteria();
		UsrTranslatorCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<UsrTranslator> list = uTranslatorMapper.selectByExample(example);
		if(list.size() > 0)
		{
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
		if(list.size() > 0)
		{
			return list.get(0);
		} else {
			return null;
		}
	}


	@Override
	public List<UsrLanguage> getUsrLanguageList(UsrLanguageCriteria userIdCri) {
		return uLanguageMapper.selectByExample(userIdCri);
	}

	@Override
	public UsrLsp searchLspById(String lspId) {
		return uLspMapper.selectByPrimaryKey(lspId);
	}

	@Override
	public List<UsrLsp> searchLspByName(UsrLspCriteria example) {
		return uLspMapper.selectByExample(example);
	}


	
}
