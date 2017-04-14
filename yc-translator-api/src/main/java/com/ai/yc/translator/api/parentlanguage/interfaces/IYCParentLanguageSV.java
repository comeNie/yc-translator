package com.ai.yc.translator.api.parentlanguage.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.yc.translator.api.parentlanguage.param.UsrParentLanguageInfo;

@Path("/usrparentLanguageservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCParentLanguageSV {
	
    /**
	 * 查询母语
	 * @return 
	 * @author zhangyuehong
     * @ApiDocMethod
     * @ApiCode 
     * @RestRelativeURL usrparentLanguageservice/queryLanguageValue
	 */
    @POST
    @Path("/queryLanguageValue")
    public BaseListResponse<UsrParentLanguageInfo> queryLanguageValue() throws BusinessException,SystemException;
    
}
