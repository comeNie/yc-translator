package com.ai.yc.translator.api.usrextend.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.usrextend.param.UsrExtendInfo;
import com.ai.yc.translator.api.usrextend.param.UsrExtendRequest;

@Path("/usrextendservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUsrExtendValueSV {
	
	/**
	 * 新增用途、领域
	 * @return 
	 * @author zhangyuehong
     * @ApiDocMethod
     * @ApiCode UAC_0011
     * @RestRelativeURL usrextendservice/insertExtendValue
	 */
    @POST
    @Path("/insertExtendValue")
	public BaseResponse insertExtendValue(UsrExtendRequest request) throws BusinessException,SystemException;
    /**
	 * 查询某个译员的用途领域
	 * @return 
	 * @author zhangyuehong
     * @ApiDocMethod
     * @ApiCode 
     * @RestRelativeURL usrextendservice/queryExtendValue
	 */
    @POST
    @Path("/queryContributionValue")
    public BaseListResponse<UsrExtendInfo> queryExtendValue(UsrExtendRequest extendRequest) throws BusinessException,SystemException;
    
}
