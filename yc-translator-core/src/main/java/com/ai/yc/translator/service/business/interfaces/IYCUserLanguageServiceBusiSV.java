package com.ai.yc.translator.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageRequest;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageResponse;

public interface IYCUserLanguageServiceBusiSV {
	
	public BaseResponse InsertUserLanguage(UsrLanguageRequest languageRequest) throws BusinessException,SystemException;
	
	public UsrLanguageResponse queryUserLanguage(String userId);
}
