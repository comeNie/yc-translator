package com.ai.yc.translator.service.business.interfaces;


import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.YCLSPInfoReponse;
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
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertCertificationsResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertEduHistoryResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertLanguageSkillResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertTranslatorExtendsListResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertTranslatorResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCInsertWorkExprienceResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchCertificationsResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchEduHistoryResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchTranslatorExtendsListResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchWorkExprienceResponse;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateTranslatorResponse;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;

public interface IYCTranslatorServiceBusiSV {
    

	public UsrTranslator searchYCUsrTranslatorInfo(SearchYCTranslatorRequest searchReq) throws BusinessException;
	
	public YCTranslatorSkillListResponse getTranslatorSkillList(String userId) throws BusinessException;

	public YCLSPInfoReponse searchLSPInfoBussiness(searchYCLSPInfoRequest searchLSPParams) throws BusinessException;

	public YCInsertTranslatorResponse insertTranslatorBusiness(InsertYCTranslatorRequest insertYCTranslatorParams) throws BusinessException;

	public YCUpdateTranslatorResponse updateTranslatorBusiness(UpdateYCTranslatorRequest updateYCTranslatorParams) throws BusinessException;

	public YCInsertLanguageSkillResponse insertLanguageSkillBusiness(InsertYCLanguageSkillRequest insertParams);

	public YCInsertEduHistoryResponse insertEduHistoryBusiness(InsertYCEduHistoryRequest insertParams);

	public YCSearchEduHistoryResponse searchEduHistoryBusiness(SearchYCEduHistoryRequest searchParams);

	public YCInsertWorkExprienceResponse insertWorkExprienceBusiness(InsertYCWorkExprienceRequest insertParams);

	public YCSearchWorkExprienceResponse searchWorkExperenceBusiness(SearchYCWorkExprienceRequest searchParams);

	public YCInsertCertificationsResponse insertCertificateBusiness(InsertYCCertificationsRequest insertParams);

	public YCInsertTranslatorExtendsListResponse insertExtendResponseBusiness(
			InsertYCTranslatorExtendsListRequest insertParams);

	public YCSearchCertificationsResponse searchCertificateBusiness(SearchYCCertificationsRequest searchParams);

	public YCSearchTranslatorExtendsListResponse searchExtendBusiness(
			SearchYCTranslatorExtendsListRequest searchParams);
	
	public YCUpdateTranslatorResponse updateTranslatorByUserId(UpdateYCTranslatorRequest updateYCTranslatorParams) throws BusinessException;

	public BaseResponse deleteTranslator(String translatorId);
}
