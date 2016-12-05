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
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.service.business.interfaces.IYCTranslatorServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
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
			insertTranslatorResp = new HBBaseResponse<YCInsertTranslatorResponse>(true,ExceptCodeConstants.SUCCESS,e.getErrorMessage());
		}
		return insertTranslatorResp;
	}


	@Override
	public HBBaseResponse<YCUpdateTranslatorResponse> updateTranslator(
			UpdateYCTranslatorRequest UpdateYCTranslatorParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCInsertLanguageSkillResponse> insertLanguageSkill(
			InsertYCLanguageSkillRequest insertParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCUpdateLanguageSkillResponse> updateLanguageSkill(
			UpdateYCLanguageSkillRequest updateParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCSearchLanguageSkillResponse> searchLanguageSkill(
			SearchYCLanguageSkillRequest searchParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCDeleteLanguageSkillResponse> deleteLanguageSkill(
			DeleteYCLanguageSkillRequest deleteParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCInsertEduHistoryResponse> insertEduHistory(InsertYCEduHistoryRequest insertParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCUpdateEduHistoryResponse> updateEduHistory(UpdateYCEduHistoryRequest updateParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCSearchEduHistoryResponse> searchEduHistory(SearchYCEduHistoryRequest searchParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCDeleteEduHistoryResponse> deleteEduHistory(DeleteYCEduHistoryRequest deleteParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCInsertWorkExprienceResponse> insertWorkExprience(
			InsertYCWorkExprienceRequest insertParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCUpdateWorkExprienceResponse> updateWorkExprience(
			UpdateYCWorkExprienceRequest updateParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCSearchWorkExprienceResponse> searchWorkExprience(
			SearchYCWorkExprienceRequest searchParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCDeleteWorkExprienceResponse> deleteWorkExprience(
			DeleteYCWorkExprienceRequest deleteParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCInsertCertificationsResponse> insertCertifications(
			InsertYCCertificationsRequest insertParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCUpdateCertificationsResponse> updateCertifications(
			UpdateYCCertificationsRequest updateParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCSearchCertificationsResponse> searchCertifications(
			SearchYCCertificationsRequest searchParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCDeleteCertificationsResponse> deleteCertifications(
			DeleteYCCertificationsRequest deleteParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCInsertTranslatorExtendsListResponse> insertTranslatorExtendsList(
			InsertYCTranslatorExtendsListRequest insertParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCUpdateTranslatorExtendsListResponse> updateTranslatorExtendsList(
			UpdateYCTranslatorExtendsListRequest updateParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCSearchTranslatorExtendsListResponse> searchTranslatorExtendsList(
			SearchYCTranslatorExtendsListRequest searchParams) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HBBaseResponse<YCDeleteTranslatorExtendsListResponse> deleteTranslatorExtendsList(
			DeleteYCTranslatorExtendsListRequest deleteParams) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
