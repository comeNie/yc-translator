package com.ai.yc.translator.api.translatorservice.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.translator.api.translatorservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorInfoResponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.translatorservice.param.searchYCLSPInfoRequest;


@Path("/yctranslatorservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCTranslatorServiceSV {
	/**
	 * 查询译员基本信息数据
	 * uid／translatorid任选其一进行查询
	 * 不可同时传入
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0001
     * @RestRelativeURL yctranslatorservice/searchYCTranslatorInfo
	 */
	@POST
	@Path("/searchYCTranslatorInfo")
	YCTranslatorInfoResponse searchYCTranslatorInfo(SearchYCTranslatorRequest tUsrId);
	

	/**
	 * 查询译员语言技能列表
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0002
     * @RestRelativeURL yctranslatorservice/SearchTranslatorSkillList
	 */
	@POST
	@Path("/SearchTranslatorSkillList")
	YCTranslatorSkillListResponse getTranslatorSkillList(SearchYCTranslatorSkillListRequest getSkillList);
	
	/**
	 * 查询LSP信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0003
     * @RestRelativeURL yctranslatorservice/searchLSPInfo
	 */
	@POST
	@Path("/searchLSPInfo")
	YCLSPInfoReponse searchLSPInfo(searchYCLSPInfoRequest searchLSPParams);
	
}
