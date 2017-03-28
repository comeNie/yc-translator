package com.ai.yc.translator.api.translatorservice.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
/**
 * 译员列表信息查询结果
 * @author hexf3
 *
 */
public class TranslatorInfoQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;


    PageInfo<TranslatorInfoResponse> pageInfo;


	public PageInfo<TranslatorInfoResponse> getPageInfo() {
		return pageInfo;
	}


	public void setPageInfo(PageInfo<TranslatorInfoResponse> pageInfo) {
		this.pageInfo = pageInfo;
	}
    
}
