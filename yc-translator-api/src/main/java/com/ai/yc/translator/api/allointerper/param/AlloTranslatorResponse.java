package com.ai.yc.translator.api.allointerper.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class AlloTranslatorResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;
	private List<AlloTranslatorInfo> translatorList;

	public List<AlloTranslatorInfo> getTranslatorList() {
		return translatorList;
	}

	public void setTranslatorList(List<AlloTranslatorInfo> translatorList) {
		this.translatorList = translatorList;
	}

}
