package com.ai.yc.translator.api.userlanguage.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageRequest;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageResponse;

@Path("/usrLanguageservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserLanguageSV {
	
    /**
	 * 新增语言对
	 * @return 
	 * @author zhangyuehong
     * @ApiDocMethod
     * @ApiCode 
     * @RestRelativeURL usrLanguageservice/insertLanguageInfo
	 */
    @POST
    @Path("/insertLanguageInfo")
    public BaseResponse insertLanguageInfo(UsrLanguageRequest languageRequest) throws BusinessException,SystemException;
    
    /**
  	 * 根据用户Id查询语言
  	 * @return 
  	 * @author zhangyuehong
       * @ApiDocMethod
       * @ApiCode 
       * @RestRelativeURL usrLanguageservice/queryLanguageInfo
  	 */
      @POST
      @Path("/queryLanguageInfo")
      public UsrLanguageResponse queryLanguageInfo(String userId) throws BusinessException,SystemException;
}
