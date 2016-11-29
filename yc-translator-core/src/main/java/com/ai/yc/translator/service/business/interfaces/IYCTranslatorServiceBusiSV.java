package com.ai.yc.translator.service.business.interfaces;


import com.ai.opt.base.exception.BusinessException;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.translatorservice.param.searchYCLSPInfoRequest;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslator;

public interface IYCTranslatorServiceBusiSV {
    

	public UsrTranslator searchYCUsrTranslatorInfo(SearchYCTranslatorRequest searchReq) throws BusinessException;
	
	public YCTranslatorSkillListResponse getTranslatorSkillList(String userId) throws BusinessException;

	public YCLSPInfoReponse searchLSPInfoBussiness(searchYCLSPInfoRequest searchLSPParams) throws BusinessException;

}
