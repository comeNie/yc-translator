package com.ai.yc.translator.service.atom.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryRequest;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoResponse;

public interface ITranslatorInfoServiceAtomSV {
	/**
     * 查询译员信息表
     * @param TranslatorInfoQueryRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     */
    public PageInfo<TranslatorInfoResponse> translatorInfoQuery(TranslatorInfoQueryRequest translatorInfoQueryRequest)throws BusinessException, SystemException;


}
