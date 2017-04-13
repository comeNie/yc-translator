package com.ai.yc.translator.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.translator.api.usrextend.param.UsrExtendInfo;
import com.ai.yc.translator.api.usrextend.param.UsrExtendRequest;
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.dao.mapper.bo.UsrExtend;
import com.ai.yc.translator.dao.mapper.bo.UsrExtendCriteria;
import com.ai.yc.translator.service.atom.interfaces.IYCUsrExtendAtomSV;
import com.ai.yc.translator.service.business.interfaces.IYCUsrExtendServiceBusiSV;

@Service
@Transactional
public class IYCUsrExtendServiceBusiSVImpl implements IYCUsrExtendServiceBusiSV{

	@Autowired
	private IYCUsrExtendAtomSV usrExtendAtomSV;
	
	@Override
	public BaseResponse insertExtendValue(UsrExtendRequest request)
			throws BusinessException, SystemException {
		UsrExtend usrExtend = new UsrExtend();
		BaseResponse baseResponse = new BaseResponse();
		ResponseHeader responseHeader = null;
		try{
			BeanUtils.copyProperties(usrExtend, request);
			String extendId = SeqUtil.getNewId("YC_EXTEND_ID$SEQ", 10);
			usrExtend.setExtendId(extendId);
			usrExtendAtomSV.insertExtendValue(usrExtend);
			responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"插入成功");
		}catch(Exception e){
			e.printStackTrace();
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,"插入失败");
		}
		baseResponse.setResponseHeader(responseHeader);
		return baseResponse;
	}

	@Override
	public BaseListResponse<UsrExtendInfo> queryExtendValue(
			UsrExtendRequest extendRequest) throws BusinessException,
			SystemException {
		BaseListResponse<UsrExtendInfo> returnResponse = new BaseListResponse<UsrExtendInfo>();
		List<UsrExtendInfo> returnList = new ArrayList<UsrExtendInfo>();
		ResponseHeader responseHeader = null;
		try{
			UsrExtendCriteria example = new UsrExtendCriteria();
			UsrExtendCriteria.Criteria criteria = example.createCriteria();
			if(!StringUtil.isBlank(extendRequest.getTranslatorId())){
				criteria.andTranslatorIdEqualTo(extendRequest.getTranslatorId());
			}
			if(!StringUtil.isBlank(extendRequest.getExtendType())){
				criteria.andExtendTypeEqualTo(extendRequest.getExtendType());
			}
			List<UsrExtend> usrExtendList = usrExtendAtomSV.queryExtendValue(example);
			for(int i=0;i<usrExtendList.size();i++){
				UsrExtend usrExtend = usrExtendList.get(i);
				UsrExtendInfo usrExtendInfo = new UsrExtendInfo();
				BeanUtils.copyProperties(usrExtendInfo, usrExtend);
				returnList.add(usrExtendInfo);
			}
			responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"查询成功");
		}catch(Exception e){
			e.printStackTrace();
			responseHeader = new ResponseHeader(true,ExceptCodeConstants.FAILD,"查询失败");
		}
		returnResponse.setResult(returnList);
		return returnResponse;
	}

}
