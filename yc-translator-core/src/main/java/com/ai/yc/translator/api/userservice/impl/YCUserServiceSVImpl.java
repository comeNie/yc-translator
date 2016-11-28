package com.ai.yc.translator.api.userservice.impl;


import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.translator.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.translator.api.userservice.param.InsertYCContactRequest;
import com.ai.yc.translator.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.translator.api.userservice.param.SearchYCContactRequest;
import com.ai.yc.translator.api.userservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.userservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.translator.api.userservice.param.SearchYCUserRequest;
import com.ai.yc.translator.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.translator.api.userservice.param.UsrContactMessage;
import com.ai.yc.translator.api.userservice.param.YCContactInfoResponse;
import com.ai.yc.translator.api.userservice.param.YCInsertContactResponse;
import com.ai.yc.translator.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.translator.api.userservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.userservice.param.YCTranslatorInfoResponse;
import com.ai.yc.translator.api.userservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.userservice.param.YCUpdateUserResponse;
import com.ai.yc.translator.api.userservice.param.YCUserInfoResponse;
import com.ai.yc.translator.api.userservice.param.searchYCLSPInfoRequest;
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.dao.mapper.bo.UsrContact;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;
import com.ai.yc.translator.dao.mapper.bo.UsrUser;
import com.ai.yc.translator.service.business.interfaces.IYCUserServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service(validation = "true")
@Component
public class YCUserServiceSVImpl implements IYCUserServiceSV {

	private static final Logger LOGGER = LoggerFactory.getLogger(YCUserServiceSVImpl.class);
    @Autowired
    public IYCUserServiceBusiSV ycUsrServiceBusiSv;

	@Override
	public YCInsertUserResponse insertYCUser(InsertYCUserRequest insertInfo){
		ResponseHeader responseHeader = null;
		try{
			YCInsertUserResponse response = ycUsrServiceBusiSv.insertUserInfo(insertInfo);
			if(response != null){
				responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"插入成功");
				response.setResponseHeader(responseHeader);
		        return response;
			} else {
				response = new YCInsertUserResponse();
				responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,"传入不支持注册类型，注册失败");
				response.setResponseHeader(responseHeader);
		        return response;
			}
		}catch(BusinessException e){
			LOGGER.error("插入失败",e);
			YCInsertUserResponse response = new YCInsertUserResponse();
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
			response.setResponseHeader(responseHeader);
	        return response;
		}
	}

	@Override
	public YCUpdateUserResponse updateYCUserInfo(UpdateYCUserRequest updateUserParams){
		ResponseHeader responseHeader = null;
		YCUpdateUserResponse response = new YCUpdateUserResponse();
		try{
			ycUsrServiceBusiSv.updateUserInfo(updateUserParams);
			responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"插入成功");
			response.setResponseCode(ExceptCodeConstants.SUCCESS);
		}catch(BusinessException e){
			LOGGER.error("修改失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
        return response;
	}

	

	@Override
	public YCUserInfoResponse searchYCUserInfo(SearchYCUserRequest userId){
		
		ResponseHeader responseHeader = null;
		YCUserInfoResponse result = null ;
		try{
			result = ycUsrServiceBusiSv.searchUserInfo(userId.getUserId());
			responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"查询成功");
		}catch(BusinessException e){
			LOGGER.error("修改失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}

		result.setResponseHeader(responseHeader);
        return result;
	}
	
	

	@Override
	public YCTranslatorInfoResponse searchYCTranslatorInfo(SearchYCTranslatorRequest tUsrId) {
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
	public YCContactInfoResponse searchYCContactInfo(SearchYCContactRequest cUsrId) {
		List<UsrContact> usrContact = null;
		ResponseHeader responseHeader = null;
		YCContactInfoResponse result = new YCContactInfoResponse();
		try{
			usrContact = ycUsrServiceBusiSv.searchUsrContactInfo(cUsrId.getUserId());
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
			result.setUsrContactList(changUsrContactToUsrContactMessage(usrContact));
			result.setResponseCode(ExceptCodeConstants.SUCCESS);
		}catch(BusinessException e){
			LOGGER.error("修改失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		
		result.setResponseHeader(responseHeader);
		return result;
	}
	
	private List<UsrContactMessage> changUsrContactToUsrContactMessage(List<UsrContact> usrContactList) {
		Gson g = new Gson();
		Type type = new TypeToken<List<UsrContactMessage>>(){}.getType();
		return g.fromJson(g.toJson(usrContactList), type);
	}

	@Override
	@POST
	@Path("/searchUserInfoByNickName")
	public YCUserInfoResponse searchUserInfoByNickName(String nickName) {
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新成功");
		YCUserInfoResponse result = new YCUserInfoResponse();
		try{
			UsrUser usruser = ycUsrServiceBusiSv.searchuserInfoByNickName(nickName);
			if(null != usruser)
			{
				BeanUtils.copyProperties(result, usruser);
			}
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.SUCCESS, "查询失败");
		}
		result.setResponseHeader(responseHeader);
		return result;
	}

	@Override
	public YCTranslatorSkillListResponse getTranslatorSkillList(SearchYCTranslatorSkillListRequest getSkillList) {
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新成功");
		YCTranslatorSkillListResponse result = new YCTranslatorSkillListResponse();
		try{
			result = ycUsrServiceBusiSv.getTranslatorSkillList(getSkillList.getUserId());
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.SUCCESS, e.getMessage());
		}
		result.setResponseHeader(responseHeader);
		return result;
	}

	@Override
	public YCLSPInfoReponse searchLSPInfo(searchYCLSPInfoRequest searchLSPParams) {
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新成功");
		YCLSPInfoReponse result = new YCLSPInfoReponse();
		try{
			result = ycUsrServiceBusiSv.searchLSPInfoBussiness(searchLSPParams);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.SUCCESS, e.getMessage());
		}
		result.setResponseHeader(responseHeader);
		return result;
	}

	@Override
	public YCInsertContactResponse insertYCContact(InsertYCContactRequest creq) {
		ResponseHeader responseHeader = null;
		try{
			YCInsertContactResponse response = ycUsrServiceBusiSv.insertContactInfo(creq);
			if(response != null){
				responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"插入成功");
				response.setResponseHeader(responseHeader);
		        return response;
			} else {
				response = new YCInsertContactResponse();
				responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,"插入失败");
				response.setResponseHeader(responseHeader);
		        return response;
			}
		}catch(BusinessException e){
			LOGGER.error("插入失败",e);
			YCInsertContactResponse response = new YCInsertContactResponse();
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
			response.setResponseHeader(responseHeader);
	        return response;
		}
	}

	
	
//	@Override
//	public YCInsertTranslatorResponse insertYCTranslatorInfo(InsertYCTranslatorRequest translatorInfo) {
//		ResponseHeader responseHeader = null;
//		YCInsertTranslatorResponse response = new YCInsertTranslatorResponse();
//		String userId = "";
//		try{
//			userId = ycUsrServiceBusiSv.insertTranslatorInfo(translatorInfo);
//			responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"插入成功");
//		}catch(BusinessException e){
//			LOGGER.error("插入失败",e);
//			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
//		}
//		response.setUserId(userId);
//		response.setResponseHeader(responseHeader);
//        return response;
//	}

}
