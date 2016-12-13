package com.ai.yc.translator.api.translatorservice.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.yc.translator.api.translatorservice.param.HBBaseResponse;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.translator.api.translatorservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorInfoResponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.translatorservice.param.searchYCLSPInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.DeleteYCCertificationsRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.DeleteYCEduHistoryRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.DeleteYCLanguageSkillRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.DeleteYCTranslatorExtendsListRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.DeleteYCWorkExprienceRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCCertificationsRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCEduHistoryRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCLanguageSkillRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCTranslatorExtendsListRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCWorkExprienceRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCCertificationsRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCEduHistoryRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCLanguageSkillRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCTranslatorExtendsListRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCWorkExprienceRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCCertificationsRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCEduHistoryRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCLanguageSkillRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCTranslatorExtendsListRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCWorkExprienceRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCDeleteCertificationsResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCDeleteEduHistoryResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCDeleteLanguageSkillResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCDeleteTranslatorExtendsListResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCDeleteWorkExprienceResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertCertificationsResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertEduHistoryResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertLanguageSkillResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertTranslatorExtendsListResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertTranslatorResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertWorkExprienceResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchCertificationsResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchEduHistoryResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchLanguageSkillResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchTranslatorExtendsListResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchWorkExprienceResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateCertificationsResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateEduHistoryResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateLanguageSkillResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateTranslatorExtendsListResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateTranslatorResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateWorkExprienceResponse;


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
	HBBaseResponse<YCInsertTranslatorResponse> insertTranslator(InsertYCTranslatorRequest insertYCTranslatorParams);
	
	/**
	 * 插入译员信息
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0005
     * @RestRelativeURL yctranslatorservice/updateTranslator
	 */
	@POST
	@Path("updateTranslator")
	HBBaseResponse<YCUpdateTranslatorResponse> updateTranslator(UpdateYCTranslatorRequest UpdateYCTranslatorParams);
	
	
	/**
	 * 新增译员语种
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0006
     * @RestRelativeURL yctranslatorservice/insertLanguageSkill
	 */
	@POST
	@Path("insertLanguageSkill")
	HBBaseResponse<YCInsertLanguageSkillResponse> insertLanguageSkill(InsertYCLanguageSkillRequest insertParams);
	/**
	 * 更新译员语种
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0007
     * @RestRelativeURL yctranslatorservice/updateLanguageSkill
	 */
	@POST
	@Path("updateLanguageSkill")
	HBBaseResponse<YCUpdateLanguageSkillResponse> updateLanguageSkill(UpdateYCLanguageSkillRequest updateParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0008
     * @RestRelativeURL yctranslatorservice/searchLanguageSkill
	 */
	@POST
	@Path("searchLanguageSkill")
	HBBaseResponse<YCSearchLanguageSkillResponse> searchLanguageSkill(SearchYCLanguageSkillRequest searchParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0009
     * @RestRelativeURL yctranslatorservice/deleteLanguageSkill
	 */
	@POST
	@Path("deleteLanguageSkill")
	HBBaseResponse<YCDeleteLanguageSkillResponse> deleteLanguageSkill(DeleteYCLanguageSkillRequest deleteParams);
	
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0010
     * @RestRelativeURL yctranslatorservice/insertEduHistory
	 */
	@POST
	@Path("insertEduHistory")
	HBBaseResponse<YCInsertEduHistoryResponse> insertEduHistory(InsertYCEduHistoryRequest insertParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0011
     * @RestRelativeURL yctranslatorservice/updateEduHistory
	 */
	@POST
	@Path("updateEduHistory")
	HBBaseResponse<YCUpdateEduHistoryResponse> updateEduHistory(UpdateYCEduHistoryRequest updateParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0012
     * @RestRelativeURL yctranslatorservice/searchEduHistory
	 */
	@POST
	@Path("searchEduHistory")
	HBBaseResponse<YCSearchEduHistoryResponse> searchEduHistory(SearchYCEduHistoryRequest searchParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0013
     * @RestRelativeURL yctranslatorservice/deleteEduHistory
	 */
	@POST
	@Path("deleteEduHistory")
	HBBaseResponse<YCDeleteEduHistoryResponse> deleteEduHistory(DeleteYCEduHistoryRequest deleteParams);
	
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0014
     * @RestRelativeURL yctranslatorservice/insertWorkExprience
	 */
	@POST
	@Path("insertWorkExprience")
	HBBaseResponse<YCInsertWorkExprienceResponse> insertWorkExprience(InsertYCWorkExprienceRequest insertParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0015
     * @RestRelativeURL yctranslatorservice/updateEduHistory
	 */
	@POST
	@Path("updateEduHistory")
	HBBaseResponse<YCUpdateWorkExprienceResponse> updateWorkExprience(UpdateYCWorkExprienceRequest updateParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0016
     * @RestRelativeURL yctranslatorservice/searchWorkExprience
	 */
	@POST
	@Path("searchWorkExprience")
	HBBaseResponse<YCSearchWorkExprienceResponse> searchWorkExprience(SearchYCWorkExprienceRequest searchParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0017
     * @RestRelativeURL yctranslatorservice/deleteWorkExprience
	 */
	@POST
	@Path("deleteWorkExprience")
	HBBaseResponse<YCDeleteWorkExprienceResponse> deleteWorkExprience(DeleteYCWorkExprienceRequest deleteParams);
	
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0018
     * @RestRelativeURL yctranslatorservice/insertCertifications
	 */
	@POST
	@Path("insertCertifications")
	HBBaseResponse<YCInsertCertificationsResponse> insertCertifications(InsertYCCertificationsRequest insertParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0019
     * @RestRelativeURL yctranslatorservice/updateCertifications
	 */
	@POST
	@Path("updateCertifications")
	HBBaseResponse<YCUpdateCertificationsResponse> updateCertifications(UpdateYCCertificationsRequest updateParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0020
     * @RestRelativeURL yctranslatorservice/searchCertifications
	 */
	@POST
	@Path("searchCertifications")
	HBBaseResponse<YCSearchCertificationsResponse> searchCertifications(SearchYCCertificationsRequest searchParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0021
     * @RestRelativeURL yctranslatorservice/deleteCertifications
	 */
	@POST
	@Path("deleteCertifications")
	HBBaseResponse<YCDeleteCertificationsResponse> deleteCertifications(DeleteYCCertificationsRequest deleteParams);
	
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0022
     * @RestRelativeURL yctranslatorservice/insertTranslatorExtendsList
	 */
	@POST
	@Path("insertTranslatorExtendsList")
	HBBaseResponse<YCInsertTranslatorExtendsListResponse> insertTranslatorExtendsList(InsertYCTranslatorExtendsListRequest insertParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0023
     * @RestRelativeURL yctranslatorservice/updateTranslatorExtendsList
	 */
	@POST
	@Path("updateTranslatorExtendsList")
	HBBaseResponse<YCUpdateTranslatorExtendsListResponse> updateTranslatorExtendsList(UpdateYCTranslatorExtendsListRequest updateParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0024
     * @RestRelativeURL yctranslatorservice/searchTranslatorExtendsList
	 */
	@POST
	@Path("searchTranslatorExtendsList")
	HBBaseResponse<YCSearchTranslatorExtendsListResponse> searchTranslatorExtendsList(SearchYCTranslatorExtendsListRequest searchParams);
	/**
	 * 
	 * @param 
	 * @return
	 * @ApiCode TRANSLATOR_0025
     * @RestRelativeURL yctranslatorservice/deleteTranslatorExtendsList
	 */
	@POST
	@Path("deleteTranslatorExtendsList")
	HBBaseResponse<YCDeleteTranslatorExtendsListResponse> deleteTranslatorExtendsList(DeleteYCTranslatorExtendsListRequest deleteParams);
}
