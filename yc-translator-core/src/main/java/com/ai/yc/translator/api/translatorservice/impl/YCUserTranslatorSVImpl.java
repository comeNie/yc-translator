package com.ai.yc.translator.api.translatorservice.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.translator.api.translatorservice.interfaces.IYCUserTranslatorSV;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryResponse;
import com.ai.yc.translator.service.business.interfaces.ITranslatorInfoServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class YCUserTranslatorSVImpl implements IYCUserTranslatorSV {
	 private static final Logger log = LogManager.getLogger(YCUserTranslatorSVImpl.class);
	    @Autowired
	    private ITranslatorInfoServiceBusiSV iTranslatorInfoQuerySV;    
	@Override
	@POST
	@Path("/queryPageInfoTranslatorInfo")
	public TranslatorInfoQueryResponse queryPageInfoTranslatorInfo(
			UsrTranslatorPageInfoRequest param) throws BusinessException,
			SystemException {		
		return iTranslatorInfoQuerySV.queryPageInfoTranslatorInfo(param);
	}
}
