package com.ai.yc.translator.api.translatorservice.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.translatorservice.param.AlloTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.AlloTranslatorResponse;
import com.ai.yc.translator.api.translatorservice.param.HBBaseResponse;
import com.ai.yc.translator.api.translatorservice.param.LspTranslatorInfo;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.translator.api.translatorservice.param.TraslatorCertificateInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorInfoResponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.translatorservice.param.searchYCLSPInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCCertificationsRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCEduHistoryRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCLanguageSkillRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCTranslatorExtendsListRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCWorkExprienceRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCCertificationsRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCEduHistoryRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCTranslatorExtendsListRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCWorkExprienceRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertLanguageSkillResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertTranslatorExtendsListResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertTranslatorResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchCertificationsResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchEduHistoryResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchTranslatorExtendsListResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchWorkExprienceResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateTranslatorResponse;


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
	
	/**
	 * 插入译员信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0004
     * @RestRelativeURL yctranslatorservice/insertTranslator
	 */
	@POST
	@Path("/insertTranslator")
	YCInsertTranslatorResponse insertTranslator(InsertYCTranslatorRequest insertYCTranslatorParams);
	
	/**
	 * 修改译员信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0005
     * @RestRelativeURL yctranslatorservice/updateTranslator
	 */
	@POST
	@Path("updateTranslator")
	HBBaseResponse<YCUpdateTranslatorResponse> updateTranslator(UpdateYCTranslatorRequest UpdateYCTranslatorParams);
	
	
	/**
	 * 修改译员语种
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0006
     * @RestRelativeURL yctranslatorservice/insertLanguageSkill
	 */
	@POST
	@Path("insertLanguageSkill")
	HBBaseResponse<YCInsertLanguageSkillResponse> insertLanguageSkill(InsertYCLanguageSkillRequest insertParams);
	
	/**
	 * 插入教育信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0010
     * @RestRelativeURL yctranslatorservice/insertEduHistory
	 */
	@POST
	@Path("insertEduHistory")
	BaseResponse insertEduHistory(InsertYCEduHistoryRequest insertParams);
	/**
	 * 查询译员教育信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0012
     * @RestRelativeURL yctranslatorservice/searchEduHistory
	 */
	@POST
	@Path("searchEduHistory")
	YCSearchEduHistoryResponse searchEduHistory(SearchYCEduHistoryRequest searchParams);
	
	/**
	 * 插入译员工作经历
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0014
     * @RestRelativeURL yctranslatorservice/insertWorkExprience
	 */
	@POST
	@Path("insertWorkExprience")
	BaseResponse insertWorkExprience(InsertYCWorkExprienceRequest insertParams);
	/**
	 * 查询译员工作经历
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0016
     * @RestRelativeURL yctranslatorservice/searchWorkExprience
	 */
	@POST
	@Path("searchWorkExprience")
	YCSearchWorkExprienceResponse searchWorkExprience(SearchYCWorkExprienceRequest searchParams);
	
	/**
	 * 插入译员证书信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0018
     * @RestRelativeURL yctranslatorservice/insertCertifications
	 */
	@POST
	@Path("insertCertifications")
	BaseResponse insertCertifications(InsertYCCertificationsRequest insertParams);
	/**
	 * 查询译员证书信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0020
     * @RestRelativeURL yctranslatorservice/searchCertifications
	 */
	@POST
	@Path("searchCertifications")
	YCSearchCertificationsResponse searchCertifications(SearchYCCertificationsRequest searchParams);
	/**
	 * 修改译员扩展信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0022
     * @RestRelativeURL yctranslatorservice/insertTranslatorExtendsList
	 */
	@POST
	@Path("insertTranslatorExtendsList")
	HBBaseResponse<YCInsertTranslatorExtendsListResponse> insertTranslatorExtendsList(InsertYCTranslatorExtendsListRequest insertParams);
	/**
	 * 查询译员扩展信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0024
     * @RestRelativeURL yctranslatorservice/searchTranslatorExtendsList
	 */
	@POST
	@Path("searchTranslatorExtendsList")
	HBBaseResponse<YCSearchTranslatorExtendsListResponse> searchTranslatorExtendsList(SearchYCTranslatorExtendsListRequest searchParams);
	
	/**
	 * 通过用户Id修改译员信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0009
     * @RestRelativeURL yctranslatorservice/updateTranslatorByUserId
	 */
	@POST
	@Path("updateTranslatorByUserId")
	public BaseResponse updateTranslatorByUserId(UpdateYCTranslatorRequest UpdateYCTranslatorParams);
	
	
	/**
	 * 通过LSPId和语言对ID获取译员信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_00010
     * @RestRelativeURL yctranslatorservice/getTranslatorInfoByLSPLanguageId
	 */
	@POST
	@Path("getTranslatorsByLSPLanguageId")
	public BaseListResponse<LspTranslatorInfo> getTranslatorsByLSPLanguageId(SearchYCTranslatorRequest searchTranslatorRequest);
	
	/**
	 * 删除译员信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_00010
     * @RestRelativeURL yctranslatorservice/deleteTranslatorInfo
	 */
	@POST
	@Path("deleteTranslatorInfo")
	public BaseResponse deleteTranslatorInfo(String translatorId);
	
	/**
	 * 插入译员认证信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_00010
     * @RestRelativeURL yctranslatorservice/insertCertificateInfo
	 */
	@POST
	@Path("insertCertificateInfo")
	public BaseResponse insertCertificateInfo(TraslatorCertificateInfoRequest request);
	/**
	 * 查询lsp下的译员信息
	 * @param request
	 * @return
	 * @author zhanglh
	 * @ApiCode
	 * @RestRelativeURL yctranslatorservice/queryAlloTranslator
	 */
	@POST
	@Path("queryAlloTranslator")
	public AlloTranslatorResponse queryAlloTranslator(AlloTranslatorRequest request);
}
