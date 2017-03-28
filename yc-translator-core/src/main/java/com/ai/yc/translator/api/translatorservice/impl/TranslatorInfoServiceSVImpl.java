package com.ai.yc.translator.api.translatorservice.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.yc.translator.api.translatorservice.interfaces.ITranslatorInfoServiceSV;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryRequest;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryResponse;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoResponse;
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.service.business.interfaces.ITranslatorInfoServiceBusiSV;

public class TranslatorInfoServiceSVImpl implements ITranslatorInfoServiceSV {
	 private static final Logger log = LogManager.getLogger(TranslatorInfoServiceSVImpl.class);
	    @Autowired
	    private ITranslatorInfoServiceBusiSV iTranslatorInfoQuerySV;
    /**
     * 译员信息列表查询
     * 
     */
	@Override
	public TranslatorInfoQueryResponse queryTranslatorInfo(
			TranslatorInfoQueryRequest param) throws BusinessException,
			SystemException {
		log.info("译员列表信息查询");
		TranslatorInfoQueryResponse translatorInfoQueryResponse = new TranslatorInfoQueryResponse();
        ResponseHeader responseHeader = new ResponseHeader();
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
        }
        try {
            PageInfo<TranslatorInfoResponse> pageInfo = iTranslatorInfoQuerySV.translatorInfoQuery(param);
            translatorInfoQueryResponse.setPageInfo(pageInfo);
            responseHeader.setIsSuccess(true);
            responseHeader.setResultCode(ExceptCodeConstants.SUCCESS);
            responseHeader.setResultMessage("账单查询成功");
            translatorInfoQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            translatorInfoQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptCodeConstants.SYSTEM_ERROR);
            responseHeader.setResultMessage("账单查询失败");
            translatorInfoQueryResponse.setResponseHeader(responseHeader);
        }

        return translatorInfoQueryResponse;
	}

}
