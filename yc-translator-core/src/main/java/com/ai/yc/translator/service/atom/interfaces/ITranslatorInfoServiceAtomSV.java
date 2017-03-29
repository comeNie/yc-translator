package com.ai.yc.translator.service.atom.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfo;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfo;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoResponse;

public interface ITranslatorInfoServiceAtomSV {
    public int getTranslatorListCount(UsrTranslatorPageInfoRequest translatorInfoQueryRequest);
    public List<UsrTranslatorPageInfo> queryCompanyInfoList(UsrTranslatorPageInfoRequest pageInfoRequest);
}
