package com.ai.yc.translator.api.translatorservice.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.translator.api.translatorservice.interfaces.IYCTranslatorServiceSV;
import com.ai.yc.translator.api.translatorservice.param.HBBaseResponse;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorSkillListRequest;
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
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.service.business.interfaces.IYCTranslatorServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class YCTranslatorServiceSVImpl implements IYCTranslatorServiceSV {

	private static final Logger LOGGER = LoggerFactory.getLogger(YCTranslatorServiceSVImpl.class);
    @Autowired
    public IYCTranslatorServiceBusiSV ycUsrServiceBusiSv;

	@Override
	public YCTranslatorInfoResponse searchYCTranslatorInfo(SearchYCTranslatorRequest tUsrId) {
		LOGGER.debug("searchYCTranslatorInfo input params:", tUsrId);
		ResponseHeader responseHeader = null;
		UsrTranslator usrTranslator = null;
		YCTranslatorInfoResponse result = new YCTranslatorInfoResponse();
		try{
			
			usrTranslator = ycUsrServiceBusiSv.searchYCUsrTranslatorInfo(tUsrId);
			responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"查询成功");
			if (null != usrTranslator){
				BeanUtils.copyProperties(result, usrTranslator);
			}
			result.setResponseCode(ExceptCodeConstants.SUCCESS);
		}catch(BusinessException e){
			LOGGER.error("修改失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		
		result.setResponseHeader(responseHeader);
		return result;
	}
	

	@Override
	public YCTranslatorSkillListResponse getTranslatorSkillList(SearchYCTranslatorSkillListRequest getSkillList) {
		LOGGER.debug("getTranslatorSkillList input params:", getSkillList);
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新成功");
		YCTranslatorSkillListResponse result = new YCTranslatorSkillListResponse();
		try{
			result = ycUsrServiceBusiSv.getTranslatorSkillList(getSkillList.getUserId());
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, e.getErrorMessage());
		}
		result.setResponseHeader(responseHeader);
		return result;
	}

	@Override
	public YCLSPInfoReponse searchLSPInfo(searchYCLSPInfoRequest searchLSPParams) {
		LOGGER.debug("searchLSPInfo input params:", searchLSPParams);
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新成功");
		YCLSPInfoReponse result = new YCLSPInfoReponse();
		try{
			result = ycUsrServiceBusiSv.searchLSPInfoBussiness(searchLSPParams);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, e.getErrorMessage());
		}
		result.setResponseHeader(responseHeader);
		return result;
	}


	@Override
	public HBBaseResponse<YCInsertTranslatorResponse> insertTranslator(
			InsertYCTranslatorRequest insertYCTranslatorParams) {
		LOGGER.debug("insertTranslator input params:", insertYCTranslatorParams);
		HBBaseResponse<YCInsertTranslatorResponse> insertTranslatorResp = null;
		YCInsertTranslatorResponse result = null;
		try{
			result = ycUsrServiceBusiSv.insertTranslatorBusiness(insertYCTranslatorParams);
			insertTranslatorResp = new HBBaseResponse<YCInsertTranslatorResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			insertTranslatorResp = new HBBaseResponse<YCInsertTranslatorResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return insertTranslatorResp;
	}


	@Override
	public HBBaseResponse<YCUpdateTranslatorResponse> updateTranslator(
			UpdateYCTranslatorRequest updateYCTranslatorParams) {
		LOGGER.debug("updateTranslator input params:", updateYCTranslatorParams);
		HBBaseResponse<YCUpdateTranslatorResponse> updateTranslatorResp = null;
		YCUpdateTranslatorResponse result = null;
		try{
			result = ycUsrServiceBusiSv.updateTranslatorBusiness(updateYCTranslatorParams);
			updateTranslatorResp = new HBBaseResponse<YCUpdateTranslatorResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			updateTranslatorResp = new HBBaseResponse<YCUpdateTranslatorResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return updateTranslatorResp;
	}


	@Override
	public HBBaseResponse<YCInsertLanguageSkillResponse> insertLanguageSkill(
			InsertYCLanguageSkillRequest insertParams) {
		LOGGER.debug("insertLanguageSkill input params:", insertParams);
		HBBaseResponse<YCInsertLanguageSkillResponse> insertLanguageSkillResp = null;
		YCInsertLanguageSkillResponse result = null;
		try{
			result = ycUsrServiceBusiSv.insertLanguageSkillBusiness(insertParams);
			insertLanguageSkillResp = new HBBaseResponse<YCInsertLanguageSkillResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			insertLanguageSkillResp = new HBBaseResponse<YCInsertLanguageSkillResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return insertLanguageSkillResp;
	}

	@Override
	public HBBaseResponse<YCInsertEduHistoryResponse> insertEduHistory(InsertYCEduHistoryRequest insertParams) {
		LOGGER.debug("insertEduHistory input params:", insertParams);
		HBBaseResponse<YCInsertEduHistoryResponse> insertEduHistoryResponse = null;
		YCInsertEduHistoryResponse result = null;
		try{
			result = ycUsrServiceBusiSv.insertEduHistoryBusiness(insertParams);
			insertEduHistoryResponse = new HBBaseResponse<YCInsertEduHistoryResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			insertEduHistoryResponse = new HBBaseResponse<YCInsertEduHistoryResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return insertEduHistoryResponse;
	}

	@Override
	public HBBaseResponse<YCSearchEduHistoryResponse> searchEduHistory(SearchYCEduHistoryRequest searchParams) {
		LOGGER.debug("searchEduHistory input params:", searchParams);
		HBBaseResponse<YCSearchEduHistoryResponse> searchEduHistoryResp = null;
		YCSearchEduHistoryResponse result = null;
		try{
			result = ycUsrServiceBusiSv.searchEduHistoryBusiness(searchParams);
			searchEduHistoryResp = new HBBaseResponse<YCSearchEduHistoryResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			searchEduHistoryResp = new HBBaseResponse<YCSearchEduHistoryResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return searchEduHistoryResp;
	}

	@Override
	public HBBaseResponse<YCInsertWorkExprienceResponse> insertWorkExprience(
			InsertYCWorkExprienceRequest insertParams) {
		LOGGER.debug("insertWorkExprience input params:", insertParams);
		HBBaseResponse<YCInsertWorkExprienceResponse> insertWorkExprienceResponse = null;
		YCInsertWorkExprienceResponse result = null;
		try{
			result = ycUsrServiceBusiSv.insertWorkExprienceBusiness(insertParams);
			insertWorkExprienceResponse = new HBBaseResponse<YCInsertWorkExprienceResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			insertWorkExprienceResponse = new HBBaseResponse<YCInsertWorkExprienceResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return insertWorkExprienceResponse;
	}

	@Override
	public HBBaseResponse<YCSearchWorkExprienceResponse> searchWorkExprience(
			SearchYCWorkExprienceRequest searchParams) {
		LOGGER.debug("searchWorkExprience input params:", searchParams);
		HBBaseResponse<YCSearchWorkExprienceResponse> searchEduHistoryResp = null;
		YCSearchWorkExprienceResponse result = null;
		try{
			result = ycUsrServiceBusiSv.searchWorkExperenceBusiness(searchParams);
			searchEduHistoryResp = new HBBaseResponse<YCSearchWorkExprienceResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			searchEduHistoryResp = new HBBaseResponse<YCSearchWorkExprienceResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return searchEduHistoryResp;
	}

	@Override
	public HBBaseResponse<YCInsertCertificationsResponse> insertCertifications(
			InsertYCCertificationsRequest insertParams) {
		LOGGER.debug("insertCertifications input params:", insertParams);
		HBBaseResponse<YCInsertCertificationsResponse> insertCertificateResponse = null;
		YCInsertCertificationsResponse result = null;
		try{
			result = ycUsrServiceBusiSv.insertCertificateBusiness(insertParams);
			insertCertificateResponse = new HBBaseResponse<YCInsertCertificationsResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			insertCertificateResponse = new HBBaseResponse<YCInsertCertificationsResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return insertCertificateResponse;
	}

	@Override
	public HBBaseResponse<YCSearchCertificationsResponse> searchCertifications(
			SearchYCCertificationsRequest searchParams) {
		LOGGER.debug("searchCertifications input params:", searchParams);
		HBBaseResponse<YCSearchCertificationsResponse> searchCertificateResp = null;
		YCSearchCertificationsResponse result = null;
		try{
			result = ycUsrServiceBusiSv.searchCertificateBusiness(searchParams);
			searchCertificateResp = new HBBaseResponse<YCSearchCertificationsResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			searchCertificateResp = new HBBaseResponse<YCSearchCertificationsResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return searchCertificateResp;
	}

	@Override
	public HBBaseResponse<YCInsertTranslatorExtendsListResponse> insertTranslatorExtendsList(
			InsertYCTranslatorExtendsListRequest insertParams) {
		LOGGER.debug("insertTranslatorExtendsList input params:", insertParams);
		HBBaseResponse<YCInsertTranslatorExtendsListResponse> insertExtendResponse = null;
		YCInsertTranslatorExtendsListResponse result = null;
		try{
			result = ycUsrServiceBusiSv.insertExtendResponseBusiness(insertParams);
			insertExtendResponse = new HBBaseResponse<YCInsertTranslatorExtendsListResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			insertExtendResponse = new HBBaseResponse<YCInsertTranslatorExtendsListResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return insertExtendResponse;
	}


	@Override
	public HBBaseResponse<YCSearchTranslatorExtendsListResponse> searchTranslatorExtendsList(
			SearchYCTranslatorExtendsListRequest searchParams) {
		LOGGER.debug("searchTranslatorExtendsList input params:", searchParams);
		HBBaseResponse<YCSearchTranslatorExtendsListResponse> searchExtendResp = null;
		YCSearchTranslatorExtendsListResponse result = null;
		try{
			result = ycUsrServiceBusiSv.searchExtendBusiness(searchParams);
			searchExtendResp = new HBBaseResponse<YCSearchTranslatorExtendsListResponse>(true,ExceptCodeConstants.SUCCESS,result);
		}catch(BusinessException e){
			searchExtendResp = new HBBaseResponse<YCSearchTranslatorExtendsListResponse>(true,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return searchExtendResp;
	}
}
