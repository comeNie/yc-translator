package com.ai.yc.translator.service.atom.impl;


import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfo;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfoRequest;
import com.ai.yc.translator.dao.mapper.interfaces.UsrTranslatorMapper;
import com.ai.yc.translator.dao.mapper.interfaces.attach.UsrTranslatorAttachMapper;
import com.ai.yc.translator.service.atom.interfaces.ITranslatorInfoServiceAtomSV;
@Component
public class TranslatorInfoServiceAtomSVImpl implements ITranslatorInfoServiceAtomSV {
	@Autowired
	private  transient UsrTranslatorMapper usrTranslatorMapper;
	@Autowired
	private  transient UsrTranslatorAttachMapper UsrTranslatorAttachMapper;
	private static final Logger log = LogManager.getLogger(TranslatorInfoServiceAtomSVImpl.class);
	@Override
	public int getTranslatorListCount(
			UsrTranslatorPageInfoRequest translatorInfoQueryRequest) {
		return UsrTranslatorAttachMapper.getTranslatorInfoCount(translatorInfoQueryRequest);		
	}

	@Override
	public List<UsrTranslatorPageInfo> queryCompanyInfoList(
			UsrTranslatorPageInfoRequest pageInfoRequest) {
		return UsrTranslatorAttachMapper.getTranslatorInfoList(pageInfoRequest);
	}

}
