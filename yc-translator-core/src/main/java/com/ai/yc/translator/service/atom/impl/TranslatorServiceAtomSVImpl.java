package com.ai.yc.translator.service.atom.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryRequest;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoResponse;
import com.ai.yc.translator.dao.mapper.bo.UsrTranslatorCriteria;
import com.ai.yc.translator.service.atom.interfaces.ITranslatorInfoServiceAtomSV;
import com.alibaba.fastjson.JSON;

public class TranslatorServiceAtomSVImpl implements
		ITranslatorInfoServiceAtomSV {
	private static final Logger log = LogManager.getLogger(TranslatorServiceAtomSVImpl.class);

	@Override
	public PageInfo<TranslatorInfoResponse> translatorInfoQuery(TranslatorInfoQueryRequest translatorInfoQueryRequest) throws BusinessException, SystemException {
		List<TranslatorInfoResponse> translatorInfoResponses = new ArrayList<TranslatorInfoResponse>();
		UsrTranslatorCriteria usrTranslatorCriteria = new UsrTranslatorCriteria();
		UsrTranslatorCriteria.Criteria criteria = usrTranslatorCriteria.createCriteria();
		log.info("查询译员列表信息服务实现==============+"+JSON.toJSONString(translatorInfoQueryRequest));
		String orderByClause = "USER_ID desc";
		usrTranslatorCriteria.setOrderByClause(orderByClause);
		if(!StringUtil.isBlank(translatorInfoQueryRequest.getFirstname())){
			criteria.andFirstnameEqualTo(translatorInfoQueryRequest.getFirstname());
		}
		return null;
	}

}
