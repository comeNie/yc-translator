package com.ai.yc.translator.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.yc.translator.api.parentlanguage.param.UsrParentLanguageInfo;

public interface IYCParentLanguageServiceBusiSV {
	
	public BaseListResponse<UsrParentLanguageInfo> queryParentLanguage() throws BusinessException,SystemException;
	
}
