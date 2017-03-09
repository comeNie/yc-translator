package com.ai.yc.translator.api.contributionvalue.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class UsrContributionValuePageResponse extends BaseResponse{
	private static final long serialVersionUID = 1L;
	private PageInfo<UsrContributionValueInfo> UsrContributionValueInfoPage;
	public PageInfo<UsrContributionValueInfo> getUsrContributionValueInfoPage() {
		return UsrContributionValueInfoPage;
	}
	public void setUsrContributionValueInfoPage(
			PageInfo<UsrContributionValueInfo> usrContributionValueInfoPage) {
		UsrContributionValueInfoPage = usrContributionValueInfoPage;
	}
	
	
}
