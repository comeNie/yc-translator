package com.ai.yc.translator.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.usrextend.param.UsrExtendInfo;
import com.ai.yc.translator.api.usrextend.param.UsrExtendRequest;

public interface IYCUsrExtendServiceBusiSV {
	
	public BaseResponse insertExtendValue(UsrExtendRequest request) throws BusinessException,SystemException;
	
	public BaseListResponse<UsrExtendInfo> queryExtendValue(UsrExtendRequest extendRequest) throws BusinessException,SystemException;
	
}
