package com.ai.yc.translator.api.usrlanguage.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.userlanguage.interfaces.IYCUserLanguageSV;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageRequest;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageResponse;
import com.ai.yc.translator.service.business.interfaces.IYCUserLanguageServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class UsrLanguageServiceSVImpl implements IYCUserLanguageSV{
	
	@Autowired
	private IYCUserLanguageServiceBusiSV languageServiceBusiSv;

	@Override
	@POST
	@Path("/insertLanguageInfo")
	public BaseResponse insertLanguageInfo(UsrLanguageRequest languageRequest) throws BusinessException,
			SystemException {
		return languageServiceBusiSv.InsertUserLanguage(languageRequest);
	}

	@Override
	@POST
	@Path("/queryLanguageInfo")
	public UsrLanguageResponse queryLanguageInfo(String userId)
			throws BusinessException, SystemException {
		
		return languageServiceBusiSv.queryUserLanguage(userId);
	}

}
