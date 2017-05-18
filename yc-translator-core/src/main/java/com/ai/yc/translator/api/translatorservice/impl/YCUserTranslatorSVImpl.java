package com.ai.yc.translator.api.translatorservice.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.translator.api.translatorservice.param.LspTranslatorInfo;
import com.ai.yc.translator.api.translatorservice.param.UsrLspMessageResponse;
import com.ai.yc.translator.dao.mapper.bo.UsrLsp;
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

import java.util.List;

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

	@Override
	public UsrLspMessageResponse queryLspAccountInfo(LspTranslatorInfo param) throws BusinessException, SystemException {
		log.debug("按用户id查询lsp帐户开始");
		UsrLspMessageResponse usrLspMessageResponse = new UsrLspMessageResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			if (param == null) {
				throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:参数不能为空");
			}
			if (StringUtil.isBlank(param.getTranslatorId())) {
				throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:译员ID不能为空");
			}

			List<UsrLsp> usrLsps = iTranslatorInfoQuerySV.queryLspAccountInfo(param.getTranslatorId());
			log.debug("lsp查询结束");
			if(CollectionUtil.isEmpty(usrLsps)){
				responseHeader.setResultCode("0001");
				responseHeader.setResultMessage("lsp信息不存在!");
				usrLspMessageResponse.setResponseHeader(responseHeader);
			}else{
				BeanUtils.copyProperties(usrLspMessageResponse,usrLsps.get(0));
				responseHeader.setResultCode("0000");
				responseHeader.setResultMessage("成功");
				responseHeader.setIsSuccess(true);
				usrLspMessageResponse.setResponseHeader(responseHeader);
			}
			return usrLspMessageResponse;
		}catch(Exception e){
			responseHeader.setResultCode("0002");
			responseHeader.setResultMessage("查询资料失败");
			usrLspMessageResponse.setResponseHeader(responseHeader);
			return usrLspMessageResponse;
		}
	}
}
