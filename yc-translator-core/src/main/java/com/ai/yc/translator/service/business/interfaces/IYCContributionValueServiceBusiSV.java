package com.ai.yc.translator.service.business.interfaces;


import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValuePageRequest;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValuePageResponse;
import com.ai.yc.translator.dao.mapper.bo.UsrContributionValue;

public interface IYCContributionValueServiceBusiSV {
	
	public BaseResponse insertContributionValue(UsrContributionValue request) throws BusinessException,SystemException;
	
	public UsrContributionValuePageResponse queryContributionValue(UsrContributionValuePageRequest request) throws BusinessException,SystemException;
}
