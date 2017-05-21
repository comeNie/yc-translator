package com.ai.yc.translator.service.business.impl;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageInfo;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageRequest;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageResponse;
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguage;
import com.ai.yc.translator.dao.mapper.bo.UsrLanguageCriteria;
import com.ai.yc.translator.service.atom.interfaces.IYCUserLanguageAtomSV;
import com.ai.yc.translator.service.business.interfaces.IYCUserLanguageServiceBusiSV;

@Service
@Transactional
public class IYCUserLanguageServiceBusiSVImpl implements IYCUserLanguageServiceBusiSV{
	@Autowired
	private IYCUserLanguageAtomSV userLanguageAtomSV;

	@Override
	public BaseResponse InsertUserLanguage(UsrLanguageRequest languageRequest)
			throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader hearder = null;
		try{
			UsrLanguage usrLanguage = new UsrLanguage();
			String languageId = SeqUtil.getNewId("YC_LANGUAGE_ID$SEQ", 10);
			BeanUtils.copyProperties(usrLanguage, languageRequest);
			usrLanguage.setLanguageId(languageId);
			userLanguageAtomSV.insertUserLanguageInfo(usrLanguage);
			hearder = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "新增语言对成功");
		}catch(Exception e){
			e.printStackTrace();
			hearder = new ResponseHeader(false, ExceptCodeConstants.FAILD, "新增语言对失败");
		}
		response.setResponseHeader(hearder);
		return response;
	}

	@Override
	public UsrLanguageResponse queryUserLanguage(String userId) {
		UsrLanguageResponse response = new UsrLanguageResponse();
		ResponseHeader hearder = null;
		 List<UsrLanguageInfo> returnResult = new ArrayList<UsrLanguageInfo>();
		try{
			UsrLanguageCriteria example = new UsrLanguageCriteria();
			UsrLanguageCriteria.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(userId);
			List<UsrLanguage> list = userLanguageAtomSV.queryUserLanguage(example);
			for(int i=0;i<list.size();i++){
				UsrLanguage usrLanguage = list.get(i);
				UsrLanguageInfo usrResult = new UsrLanguageInfo();
				BeanUtils.copyProperties(usrResult, usrLanguage);
				returnResult.add(usrResult);
			}
			hearder = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "新增语言对成功");
		}catch(Exception e){
			e.printStackTrace();
			hearder = new ResponseHeader(false, ExceptCodeConstants.FAILD, "新增语言对失败");
		}
		response.setList(returnResult);
		response.setResponseHeader(hearder);
		return response;
	}
	

	

}
