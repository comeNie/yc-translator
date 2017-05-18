package com.ai.yc.translator.service.business.interfaces;



import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryResponse;
import com.ai.yc.translator.dao.mapper.bo.UsrLsp;

import java.util.List;


public interface ITranslatorInfoServiceBusiSV {
   /**
    * 查询译员信息表
    * @param translatorInfoQueryRequest
    * @return
    */
	public TranslatorInfoQueryResponse queryPageInfoTranslatorInfo(UsrTranslatorPageInfoRequest translatorInfoQueryRequest);

    /**
     * 查询lsp帐户信息
     *
     */
    public List<UsrLsp> queryLspAccountInfo(String param);
	
}
