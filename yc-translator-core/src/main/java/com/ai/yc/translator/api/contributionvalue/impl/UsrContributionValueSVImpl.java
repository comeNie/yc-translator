package com.ai.yc.translator.api.contributionvalue.impl;


import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.translator.api.contributionvalue.interfaces.IYCUsrContributionValueSV;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValuePageRequest;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValuePageResponse;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValueRequest;
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.dao.mapper.bo.UsrContributionValue;
import com.ai.yc.translator.dao.mapper.bo.UsrContributionValueCriteria;
import com.ai.yc.translator.service.business.interfaces.IYCContributionValueServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
@Component
public class UsrContributionValueSVImpl implements IYCUsrContributionValueSV{

	@Autowired
	private IYCContributionValueServiceBusiSV valueServiceBusiSV;
	
	@Override
	@POST
	@Path("/insertContributionValue")
	public BaseResponse insertContributionValue(
			UsrContributionValueRequest request) throws BusinessException,
			SystemException {
		
		if(StringUtil.isBlank(request.getUserId())){
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "用户Id不能为空");
		}
		UsrContributionValue contributionValue = new UsrContributionValue();
		BeanUtils.copyProperties(contributionValue, request);
		String recordId = SeqUtil.getNewId("YC_CONTRIBUTION$RECORD_ID$SEQ", 8);
		contributionValue.setRecordId(recordId);
		
		return valueServiceBusiSV.insertContributionValue(contributionValue);
	}

	@Override
	@POST
	@Path("/queryContributionValue")
	public UsrContributionValuePageResponse queryContributionValue(
			UsrContributionValuePageRequest request) throws BusinessException,
			SystemException {
		
		if(StringUtil.isBlank(request.getUserId())){
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "用户Id不能为空");
		}
		UsrContributionValueCriteria example = new UsrContributionValueCriteria();
		UsrContributionValueCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(request.getUserId());
		return valueServiceBusiSV.queryContributionValue(request);
	}

	
}
