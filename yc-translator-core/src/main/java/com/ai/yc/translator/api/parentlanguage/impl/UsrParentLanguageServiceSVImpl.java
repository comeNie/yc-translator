package com.ai.yc.translator.api.parentlanguage.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.yc.translator.api.parentlanguage.interfaces.IYCParentLanguageSV;
import com.ai.yc.translator.api.parentlanguage.param.UsrParentLanguageInfo;
import com.ai.yc.translator.service.business.interfaces.IYCParentLanguageServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class UsrParentLanguageServiceSVImpl implements IYCParentLanguageSV{

	@Autowired
	private IYCParentLanguageServiceBusiSV languageServiceBusiSv;
	
	@Override
	@POST
	@Path("/queryLanguageValue")
	public BaseListResponse<UsrParentLanguageInfo> queryLanguageValue()
			throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		return languageServiceBusiSv.queryParentLanguage();
	}

}
