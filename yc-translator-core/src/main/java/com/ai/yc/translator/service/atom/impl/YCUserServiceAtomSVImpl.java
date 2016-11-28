package com.ai.yc.translator.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.yc.translator.dao.mapper.bo.UsrContact;
import com.ai.yc.translator.dao.mapper.bo.UsrContactCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguageCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLsp;
import com.ai.yc.translator.dao.mapper.bo.UsrLspCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslatorCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrUser;
import com.ai.yc.translator.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.translator.dao.mapper.interfaces.UsrContactMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrLanguageMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrLspMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrTranslatorMapper;
import com.ai.yc.translator.dao.mapper.interfaces.UsrUserMapper;
import com.ai.yc.translator.service.atom.interfaces.IYCUserServiceAtomSV;


@Component
public class YCUserServiceAtomSVImpl implements IYCUserServiceAtomSV {

	@Autowired
	private transient UsrUserMapper tUserMapper;
	
	@Autowired
	private transient UsrTranslatorMapper uTranslatorMapper;

	@Autowired
	private transient UsrContactMapper uContactMapper;
	
	@Autowired
	private transient UsrLanguageMapper uLanguageMapper;
	
	@Autowired
	private transient UsrLspMapper uLspMapper;
	
	@Override
	public int updateUserInfo(UsrUser record, UsrUserCriteria example) {
		return tUserMapper.updateByExampleSelective(record, example);
	}

	@Override
	public UsrUser getUserInfo(String userId) {
		return tUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int insertUserInfo(UsrUser user) {
		return tUserMapper.insert(user);
	}

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
	public List<UsrContact> getUsrContactInfo(String userId) {
		UsrContactCriteria example = new UsrContactCriteria();
		UsrContactCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		return uContactMapper.selectByExample(example);
//		return uContactMapper.selectByPrimaryKey(userId);
	}

	@Override
	public UsrUser getUserInfoByNickName(UsrUserCriteria example) {
		List<UsrUser> list = tUserMapper.selectByExample(example);
		if(!CollectionUtil.isEmpty(list)){
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

	@Override
	public int insertContactInfo(UsrContact usrContact) {
		return uContactMapper.insertSelective(usrContact);
	}

	@Override
	public int deleteContactInfo(String contactId) {
		return uContactMapper.deleteByPrimaryKey(contactId);
	}

	
}
