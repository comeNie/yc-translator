package com.ai.yc.translator.api.translatorservice.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class LspTranslatorInfoResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	private List<LspTranslatorInfo> list ;

	public List<LspTranslatorInfo> getList() {
		return list;
	}

	public void setList(List<LspTranslatorInfo> list) {
		this.list = list;
	}
	

}
