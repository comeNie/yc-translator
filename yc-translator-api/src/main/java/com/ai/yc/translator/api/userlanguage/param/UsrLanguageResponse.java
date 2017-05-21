package com.ai.yc.translator.api.userlanguage.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

public class UsrLanguageResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	private List<UsrLanguageInfo> list;

	public List<UsrLanguageInfo> getList() {
		return list;
	}

	public void setList(List<UsrLanguageInfo> list) {
		this.list = list;
	}

}
