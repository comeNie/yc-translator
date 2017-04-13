package com.ai.yc.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.yc.translator.api.translatorservice.interfaces.IYCTranslatorServiceSV;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.translator.api.translatorservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorInfoResponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.translatorservice.param.searchYCLSPInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCTranslatorRequest;
import com.ai.yc.translator.api.usrextend.interfaces.IYCUsrExtendValueSV;
import com.ai.yc.translator.api.usrextend.param.UsrExtendInfo;
import com.ai.yc.translator.api.usrextend.param.UsrExtendRequest;
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
public class testextendservice {

	@Autowired
	private IYCUsrExtendValueSV usSV;
	
	@Test
	public void insertUsrExtendValue(){
		UsrExtendRequest extendRequest = new UsrExtendRequest();
		extendRequest.setExtendKey("2");
		extendRequest.setExtendType("1");
		extendRequest.setTranslatorId("11");
		usSV.insertExtendValue(extendRequest);
	}
	
	@Test
	public void queryUsrExtendValue(){
		UsrExtendRequest extendRequest = new UsrExtendRequest();
		extendRequest.setExtendType("1");
		extendRequest.setTranslatorId("11");
		BaseListResponse<UsrExtendInfo> list = usSV.queryExtendValue(extendRequest);
		System.out.println(JSON.toJSONString(list));
	}
}
