package com.ai.yc.translator.api.contributionvalue.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValuePageRequest;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValuePageResponse;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValueRequest;

@Path("/usrcontributionservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUsrContributionValueSV {
	
	/**
	 * 新增贡献值
	 * @return 
	 * @author zhangyuehong
     * @ApiDocMethod
     * @ApiCode UAC_0011
     * @RestRelativeURL usrcontributionservice/insertContributionValue
	 */
    @POST
    @Path("/insertContributionValue")
	public BaseResponse insertContributionValue(UsrContributionValueRequest request) throws BusinessException,SystemException;
    /**
	 * 查询某个译员的贡献值
	 * @return 
	 * @author zhangyuehong
     * @ApiDocMethod
     * @ApiCode 
     * @RestRelativeURL usrcontributionservice/queryContributionValue
	 */
    @POST
    @Path("/queryContributionValue")
    public UsrContributionValuePageResponse queryContributionValue(UsrContributionValuePageRequest request) throws BusinessException,SystemException;
    
}
