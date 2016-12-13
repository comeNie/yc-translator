package com.ai.yc.translator.service.business.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.UsrLanguageMessage;
import com.ai.yc.translator.api.translatorservice.param.UsrLspMessage;
import com.ai.yc.translator.api.translatorservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.translatorservice.param.searchYCLSPInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertTranslatorResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateTranslatorResponse;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguageCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLsp;
import com.ai.yc.translator.dao.mapper.bo.UsrLspCriteria;
import com.ai.yc.translator.dao.mapper.bo.UsrLspRelation;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.service.atom.interfaces.IYCTranslatorServiceAtomSV;
import com.ai.yc.translator.service.business.interfaces.IYCTranslatorServiceBusiSV;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service
@Transactional
public class YCTranslatorServiceBusiSVImpl implements IYCTranslatorServiceBusiSV {

	@SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(YCTranslatorServiceBusiSVImpl.class);

	@Autowired
	public IYCTranslatorServiceAtomSV ycUSAtomSV;


	@Override
	public UsrTranslator searchYCUsrTranslatorInfo(SearchYCTranslatorRequest searchReq) throws BusinessException {
		if (StringUtil.isBlank(searchReq.getUserId()) && StringUtil.isBlank(searchReq.getTranslatorId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户Id与译员id不能同时为空");
		}
		if (!StringUtil.isBlank(searchReq.getUserId()) && !StringUtil.isBlank(searchReq.getTranslatorId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户Id与译员id不能同时存在");
		}
		UsrTranslator utr = null;
		if(!StringUtil.isBlank(searchReq.getUserId())){
			utr = ycUSAtomSV.getUsrTranslatorInfo(searchReq.getUserId());
		} else {
			utr = ycUSAtomSV.getUsrTranslatorInfoByTranslatorId(searchReq.getTranslatorId());
		}
		if (null == utr) {
			return null;
		}
		
		return utr;
	}


	@Override
	public YCTranslatorSkillListResponse getTranslatorSkillList(String userId) throws BusinessException {
		if (StringUtil.isBlank(userId)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户ID不能为空");
		}
		YCTranslatorSkillListResponse translatorSkillList = new YCTranslatorSkillListResponse();
		
		// 获取译员信息
		UsrTranslator utr = ycUSAtomSV.getUsrTranslatorInfo(userId);
		if (null == utr) {
			return translatorSkillList;
		}
		// 获取LSP信息
		UsrLspRelation ulr = ycUSAtomSV.getUsrLspRelationByTranslatorId(utr.getTranslatorId());
		if(null == ulr){
			translatorSkillList.setLspId("0");
			translatorSkillList.setLspRole("0");
		}else{
			translatorSkillList.setLspId(ulr.getLspId());
			translatorSkillList.setLspRole(ulr.getTranslatorRole());
		}
		
		BeanUtils.copyProperties(translatorSkillList, utr);
		// 获取技能列表
		List<UsrLanguage> usrLanguageList = ycUSAtomSV.getUsrLanguageList(utr.getTranslatorId());
		translatorSkillList.setUsrLanguageList(changUsrLanguageToUsrLanguageMessage(usrLanguageList));
		
		return translatorSkillList;
	}

	

	@Override
	public YCLSPInfoReponse searchLSPInfoBussiness(searchYCLSPInfoRequest params) {
		UsrLsp usrLsp = null;
		YCLSPInfoReponse yclspRep = new YCLSPInfoReponse();
		yclspRep.setLspId(params.getLspId());
		yclspRep.setLspName(params.getLspName());
		List<UsrLsp> usrLspList = new ArrayList<UsrLsp>();
		if (!StringUtil.isBlank(params.getLspId()) && StringUtil.isBlank(params.getLspName())) {
			usrLsp = ycUSAtomSV.searchLspById(params.getLspId());
			if (null == usrLsp) {
				return yclspRep;
			}
			usrLspList.add(usrLsp);
			yclspRep.setUsrLspList(changUsrLspToUsrLspMessage(usrLspList));
		}
		if (StringUtil.isBlank(params.getLspId()) && !StringUtil.isBlank(params.getLspName())) {
			UsrLspCriteria example = new UsrLspCriteria();
			UsrLspCriteria.Criteria criteria = example.createCriteria();
			criteria.andLspNameLike(params.getLspName());
			usrLspList = ycUSAtomSV.searchLspByName(example);
			if (null == usrLspList) {
				return yclspRep;
			}
			if (null == usrLspList.get(0)){
				return yclspRep;
			}
			yclspRep.setUsrLspList(changUsrLspToUsrLspMessage(usrLspList));
		}
		if (StringUtil.isBlank(params.getLspId()) && StringUtil.isBlank(params.getLspName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "参数不能同时为空");
		}
		if (!StringUtil.isBlank(params.getLspId()) && !StringUtil.isBlank(params.getLspName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "参数不能同时有值");
		}
		return yclspRep;
	}

	private List<UsrLanguageMessage> changUsrLanguageToUsrLanguageMessage(List<UsrLanguage> usrLanguageList) {
		Gson g = new Gson();
		Type type = new TypeToken<List<UsrLanguageMessage>>(){}.getType();
		return g.fromJson(g.toJson(usrLanguageList), type);
	}
	
	private List<UsrLspMessage> changUsrLspToUsrLspMessage(List<UsrLsp> usrLspList) {
		Gson g = new Gson();
		Type type = new TypeToken<List<UsrLspMessage>>(){}.getType();
		return g.fromJson(g.toJson(usrLspList), type);
	}


	@Override
	public YCInsertTranslatorResponse insertTranslatorBusiness(InsertYCTranslatorRequest insertYCTranslatorParams)
			throws BusinessException {
		if (StringUtil.isBlank(insertYCTranslatorParams.getUserId()) 
				&& StringUtil.isBlank(insertYCTranslatorParams.getUsername())
				&& StringUtil.isBlank(insertYCTranslatorParams.getNickname())
				&& StringUtil.isBlank(insertYCTranslatorParams.getMobilePhone())
				&& StringUtil.isBlank(insertYCTranslatorParams.getEmail())
				&& StringUtil.isBlank(insertYCTranslatorParams.getLegalCertNum())
				&& StringUtil.isBlank(insertYCTranslatorParams.getMotherTongue())
				&& insertYCTranslatorParams.getWorkingLife() > 0
				&& StringUtil.isBlank(insertYCTranslatorParams.getAreaOfExperise())
				&& StringUtil.isBlank(insertYCTranslatorParams.getAreaOfUse())
				) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "必填字段不能为空");
		}
		YCInsertTranslatorResponse itr = new YCInsertTranslatorResponse();
		
		UsrTranslator newTranslator = new UsrTranslator();
		BeanUtils.copyProperties(newTranslator, insertYCTranslatorParams);
		String translatorId = SeqUtil.getNewId("YC_TRANSLATOR_ID$SEQ", 10);
		newTranslator.setTranslatorId(translatorId);
		ycUSAtomSV.insertTranslatorInc(newTranslator);
		
	    BeanUtils.copyProperties(itr, newTranslator);
		return itr;
	}


	@Override
	public YCUpdateTranslatorResponse updateTranslatorBusiness(UpdateYCTranslatorRequest updateYCTranslatorParams)
			throws BusinessException {
//		if (StringUtil.isBlank(insertYCTranslatorParams.getUserId()) 
//				&& StringUtil.isBlank(insertYCTranslatorParams.getUsername())
//				&& StringUtil.isBlank(insertYCTranslatorParams.getNickname())
//				&& StringUtil.isBlank(insertYCTranslatorParams.getMobilePhone())
//				&& StringUtil.isBlank(insertYCTranslatorParams.getEmail())
//				&& StringUtil.isBlank(insertYCTranslatorParams.getLegalCertNum())
//				&& StringUtil.isBlank(insertYCTranslatorParams.getMotherTongue())
//				&& insertYCTranslatorParams.getWorkingLife() > 0
//				&& StringUtil.isBlank(insertYCTranslatorParams.getAreaOfExperise())
//				&& StringUtil.isBlank(insertYCTranslatorParams.getAreaOfUse())
//				) {
//			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "必填字段不能为空");
//		}
		return null;
	}


}
