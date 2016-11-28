package com.ai.yc.translator.api.userservice.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.yc.translator.api.userservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.userservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.translator.api.userservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.userservice.param.YCTranslatorInfoResponse;
import com.ai.yc.translator.api.userservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.userservice.param.searchYCLSPInfoRequest;


@Path("/ycuserservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserServiceSV {
	/**
	 * 查询译员基本信息数据
	 * uid／translatorid任选其一进行查询
	 * 不可同时传入
	 * @param 
	 * @return
	 * @ApiCode USR_0004
     * @RestRelativeURL ycuserservice/searchYCTranslatorInfo
	 */
	@POST
	@Path("/searchYCTranslatorInfo")
	YCTranslatorInfoResponse searchYCTranslatorInfo(SearchYCTranslatorRequest tUsrId);
	

	/**
	 * 查询译员语言技能列表
	 * @param 
	 * @return
	 * @ApiCode USR_0009
     * @RestRelativeURL ycuserservice/SearchTranslatorSkillList
	 */
	@POST
	@Path("/SearchTranslatorSkillList")
	YCTranslatorSkillListResponse getTranslatorSkillList(SearchYCTranslatorSkillListRequest getSkillList);
	
	/**
	 * 查询LSP信息
	 * @param 
	 * @return
	 * @ApiCode USR_0010
     * @RestRelativeURL ycuserservice/searchLSPInfo
	 */
	@POST
	@Path("/searchLSPInfo")
	YCLSPInfoReponse searchLSPInfo(searchYCLSPInfoRequest searchLSPParams);
	
}
