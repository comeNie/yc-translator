package com.ai.yc.translator.api.usrextend.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.usrextend.interfaces.IYCUsrExtendValueSV;
import com.ai.yc.translator.api.usrextend.param.UsrExtendInfo;
import com.ai.yc.translator.api.usrextend.param.UsrExtendRequest;
import com.ai.yc.translator.service.business.interfaces.IYCUsrExtendServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class YCUsrExtendServiceSVImpl implements IYCUsrExtendValueSV{

	@Autowired
    private IYCUsrExtendServiceBusiSV usrExtendServiceBusiSV;
	
	@Override
	@POST
	@Path("/insertExtendValue")
	public BaseResponse insertExtendValue(UsrExtendRequest request)
			throws BusinessException, SystemException {
		return usrExtendServiceBusiSV.insertExtendValue(request);
	}

	@Override
	@POST
	@Path("/queryContributionValue")
	public BaseListResponse<UsrExtendInfo> queryExtendValue(
			UsrExtendRequest extendRequest) throws BusinessException,
			SystemException {
		return usrExtendServiceBusiSV.queryExtendValue(extendRequest);
	}

}
