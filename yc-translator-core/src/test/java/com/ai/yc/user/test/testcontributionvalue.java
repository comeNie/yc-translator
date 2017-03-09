package com.ai.yc.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.translator.api.contributionvalue.interfaces.IYCUsrContributionValueSV;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValuePageRequest;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValuePageResponse;
import com.ai.yc.translator.api.contributionvalue.param.UsrContributionValueRequest;
import com.ai.yc.translator.api.translatorservice.interfaces.IYCTranslatorServiceSV;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.translator.api.translatorservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorInfoResponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.translatorservice.param.searchYCLSPInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCUpdateTranslatorResponse;
import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月4日 上午10:17:52 
 * @version 
 * @since  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testcontributionvalue {

	@Autowired
	private IYCUsrContributionValueSV usSV;
	
	@Test
	public void testInsertContributionValue(){
		UsrContributionValueRequest request = new UsrContributionValueRequest();
		request.setUserId("525840");
		request.setContributionValue(123);
		usSV.insertContributionValue(request);
	}
	
	@Test
	public void testQueryContributionValue(){
		UsrContributionValuePageRequest request = new UsrContributionValuePageRequest();
		request.setUserId("525840");
		request.setPageNo(1);
		request.setPageSize(1);
		UsrContributionValuePageResponse response = usSV.queryContributionValue(request);
		System.out.println(JSON.toJSONString(response));
	}
}
