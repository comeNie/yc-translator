package com.ai.yc.translator.api.translatorservice.interfaces;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.translator.api.translatorservice.param.LspTranslatorInfo;
import com.ai.yc.translator.api.translatorservice.param.UsrLspMessageResponse;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryResponse;

@Path("/ycUserTranslator")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserTranslatorSV {
  /**
   * 分页 查询译员列表信息
   * 
   */
	@POST
	@Path("/queryPageInfoTranslatorInfo")
	TranslatorInfoQueryResponse queryPageInfoTranslatorInfo(UsrTranslatorPageInfoRequest param) throws BusinessException,SystemException;
	/**
	 * 查询lsp帐户信息
	 *
	 */
	@POST
	@Path("/queryLspAccountInfo")
	UsrLspMessageResponse queryLspAccountInfo(LspTranslatorInfo param) throws BusinessException,SystemException;

}
