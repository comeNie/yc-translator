package com.ai.yc.translator.api.translatorservice.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryRequest;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoResponse;

@Path("/translatorInfoService")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ITranslatorInfoServiceSV {
  /**
   * 查询译员列表信息
   * 
   */
	TranslatorInfoResponse  queryTranslatorInfo(TranslatorInfoQueryRequest param) throws BusinessException,SystemException;
}
