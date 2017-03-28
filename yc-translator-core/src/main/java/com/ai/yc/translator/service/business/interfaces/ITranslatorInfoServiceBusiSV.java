package com.ai.yc.translator.service.business.interfaces;

import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryRequest;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoResponse;

public interface ITranslatorInfoServiceBusiSV {
   /**
    * 查询译员信息表
    * @param translatorInfoQueryRequest
    * @return
    */
	public PageInfo<TranslatorInfoResponse> translatorInfoQuery(TranslatorInfoQueryRequest translatorInfoQueryRequest);
}
