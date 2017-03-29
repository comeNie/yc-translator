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
    PageInfo<TranslatorInfo> pageInfo;
	public PageInfo<TranslatorInfo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<TranslatorInfo> pageInfo) {
		this.pageInfo = pageInfo;
	}    
}
