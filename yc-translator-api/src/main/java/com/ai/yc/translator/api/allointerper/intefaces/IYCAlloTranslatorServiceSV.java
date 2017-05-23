package com.ai.yc.translator.api.allointerper.intefaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.yc.translator.api.allointerper.param.AlloTranslatorRequest;
import com.ai.yc.translator.api.allointerper.param.AlloTranslatorResponse;


@Path("/allotranslatorservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCAlloTranslatorServiceSV {
	/**
	 * 查询lsp下的译员信息
	 * @param request
	 * @return
	 * @author zhanglh
	 * @ApiCode
	 * @RestRelativeURL allotranslatorservice/queryAlloTranslator
	 */
	@POST
	@Path("queryAlloTranslator")
	public AlloTranslatorResponse queryAlloTranslator(AlloTranslatorRequest request);
}
