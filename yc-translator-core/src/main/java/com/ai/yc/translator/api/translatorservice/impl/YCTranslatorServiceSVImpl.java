package com.ai.yc.translator.api.translatorservice.impl;


import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.translator.api.translatorservice.interfaces.IYCTranslatorServiceSV;
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
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.service.business.interfaces.IYCTranslatorServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class YCTranslatorServiceSVImpl implements IYCTranslatorServiceSV {

	private static final Logger LOGGER = LoggerFactory.getLogger(YCTranslatorServiceSVImpl.class);
    @Autowired
    private IYCTranslatorServiceBusiSV ycUsrServiceBusiSv;

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
			LOGGER.error("查询失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		
		result.setResponseHeader(responseHeader);
		return result;
	}
	

	@Override
	public YCTranslatorSkillListResponse getTranslatorSkillList(SearchYCTranslatorSkillListRequest getSkillList) {
		LOGGER.debug("getTranslatorSkillList input params:", getSkillList);
		ResponseHeader responseHeader;
		YCTranslatorSkillListResponse result = new YCTranslatorSkillListResponse();
		try{
			result = ycUsrServiceBusiSv.getTranslatorSkillList(getSkillList.getUserId());
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		}catch(BusinessException e){
			LOGGER.error("查询失败",e);
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, e.getErrorMessage());
		}
		result.setResponseHeader(responseHeader);
		return result;
	}

	@Override
	public YCLSPInfoReponse searchLSPInfo(searchYCLSPInfoRequest searchLSPParams) {
		LOGGER.debug("searchLSPInfo input params:", searchLSPParams);
		ResponseHeader responseHeader;
		YCLSPInfoReponse result = new YCLSPInfoReponse();
		try{
			result = ycUsrServiceBusiSv.searchLSPInfoBussiness(searchLSPParams);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		}catch(BusinessException e){
			LOGGER.error("查询失败",e);
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, e.getErrorMessage());
		}
		result.setResponseHeader(responseHeader);
		return result;
	}


	@Override
	public YCInsertTranslatorResponse insertTranslator(
			InsertYCTranslatorRequest insertYCTranslatorParams) {
		LOGGER.debug("insertTranslator input params:", insertYCTranslatorParams);
		YCInsertTranslatorResponse  response = new YCInsertTranslatorResponse();
		ResponseHeader responseHeader = null;
		try{
			response = ycUsrServiceBusiSv.insertTranslatorBusiness(insertYCTranslatorParams);
			responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"新增译员成功");
		}catch(BusinessException e){
			LOGGER.error("查询失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,"新增译员失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
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
			LOGGER.error("查询失败",e);
			updateTranslatorResp = new HBBaseResponse<YCUpdateTranslatorResponse>(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
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
			LOGGER.error("查询失败",e);
			insertLanguageSkillResp = new HBBaseResponse<YCInsertLanguageSkillResponse>(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return insertLanguageSkillResp;
	}

	@Override
	public BaseResponse insertEduHistory(InsertYCEduHistoryRequest insertParams) {
		LOGGER.debug("insertEduHistory input params:", insertParams);
		return ycUsrServiceBusiSv.insertEduHistoryBusiness(insertParams);
	}

	@Override
	public YCSearchEduHistoryResponse searchEduHistory(SearchYCEduHistoryRequest searchParams) {
		LOGGER.debug("searchEduHistory input params:", searchParams);
		YCSearchEduHistoryResponse result = null;
		try{
			result = ycUsrServiceBusiSv.searchEduHistoryBusiness(searchParams);
		}catch(BusinessException e){
			LOGGER.error("查询失败",e);
		}
		return result;
	}

	@Override
	public BaseResponse insertWorkExprience(
			InsertYCWorkExprienceRequest insertParams) {
		LOGGER.debug("insertWorkExprience input params:", insertParams);
		BaseResponse response = null;
		ResponseHeader header = null;
		try{
			response = ycUsrServiceBusiSv.insertWorkExprienceBusiness(insertParams);
			header = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"插入成功");
		}catch(BusinessException e){
			LOGGER.error("查询失败",e);
			header = new ResponseHeader(false,ExceptCodeConstants.FAILD,"插入成功");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public YCSearchWorkExprienceResponse searchWorkExprience(
			SearchYCWorkExprienceRequest searchParams) {
		LOGGER.debug("searchWorkExprience input params:", searchParams);
		YCSearchWorkExprienceResponse response = null;
		ResponseHeader header = null;
		try{
			response = ycUsrServiceBusiSv.searchWorkExperenceBusiness(searchParams);
			header = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"查询成功");
		}catch(BusinessException e){
			LOGGER.error("查询失败",e);
			header = new ResponseHeader(true,ExceptCodeConstants.FAILD,"查询失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse insertCertifications(
			InsertYCCertificationsRequest insertParams) {
		LOGGER.debug("insertCertifications input params:", insertParams);
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			response = ycUsrServiceBusiSv.insertCertificateBusiness(insertParams);
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "插入成功");
		}catch(BusinessException e){
			LOGGER.error("查询失败",e);
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "插入失败");
		}
		return response;
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
			LOGGER.error("查询失败",e);
			searchCertificateResp = new HBBaseResponse<YCSearchCertificationsResponse>(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
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
			LOGGER.error("查询失败",e);
			insertExtendResponse = new HBBaseResponse<YCInsertTranslatorExtendsListResponse>(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
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
			LOGGER.error("查询失败",e);
			searchExtendResp = new HBBaseResponse<YCSearchTranslatorExtendsListResponse>(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		return searchExtendResp;
	}


	@Override
	@POST
	@Path("updateTranslatorByUserId")
	public BaseResponse updateTranslatorByUserId(UpdateYCTranslatorRequest updateYCTranslatorParams) {
		LOGGER.debug("updateTranslator input params:", updateYCTranslatorParams);
		BaseResponse response = new BaseResponse();
		ResponseHeader header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新译员信息成功");
		try{
			 ycUsrServiceBusiSv.updateTranslatorByUserId(updateYCTranslatorParams);
		}catch(BusinessException e){
			LOGGER.error("更新失败",e);
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "更新译员信息失败");
		}
		response.setResponseHeader(header);
		return response;
	}


	@Override
	@POST
	@Path("getTranslatorsByLSPLanguageId")
	public BaseListResponse<LspTranslatorInfo> getTranslatorsByLSPLanguageId(
			SearchYCTranslatorRequest searchTranslatorRequest) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	@POST
	@Path("deleteTranslatorInfo")
	public BaseResponse deleteTranslatorInfo(String translatorId) {
		// TODO Auto-generated method stub
		return ycUsrServiceBusiSv.deleteTranslator(translatorId);
	}


	@Override
	@POST
	@Path("insertCertificateInfo")
	public BaseResponse insertCertificateInfo(TraslatorCertificateInfoRequest request) {
		InsertYCCertificationsRequest certificationRequest = new InsertYCCertificationsRequest();
		certificationRequest.setCertificateList(request.getCardResultList());
		return ycUsrServiceBusiSv.insertCertificateInfo(request);
	}
}
