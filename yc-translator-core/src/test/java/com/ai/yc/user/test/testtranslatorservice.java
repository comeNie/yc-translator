package com.ai.yc.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
public class testtranslatorservice {

	@Autowired
	private IYCTranslatorServiceSV usSV;
	
	
	@Test
	public void testTranslator() {
		SearchYCTranslatorRequest s = new SearchYCTranslatorRequest();
//		s.setUserId("4444314");
		s.setTranslatorId("1");
		YCTranslatorInfoResponse r = usSV.searchYCTranslatorInfo(s);
		System.out.println(JSON.toJSONString(r));
	}
	
	@Test
	public void testSearchSkill() {
		SearchYCTranslatorSkillListRequest a = new SearchYCTranslatorSkillListRequest();
		a.setUserId("4444314");
//		a.setUserId("4444361");
		YCTranslatorSkillListResponse response = usSV.getTranslatorSkillList(a);
		System.out.println(JSON.toJSONString(response));
	}
	@Test
	public void testSearchLsp() {
		searchYCLSPInfoRequest a = new searchYCLSPInfoRequest();
		a.setLspId("9");
		YCLSPInfoReponse response = usSV.searchLSPInfo(a);
		System.out.println(JSON.toJSONString(response));
	}
	
	@Test
	public void testUpdateTranslator() {
		Gson g = new Gson();
		
		UpdateYCTranslatorRequest a = new UpdateYCTranslatorRequest();
		a.setUserId("526013");
		a.setNickname("FUCK-YOU");
		a.setFirstname("aaa");
		a.setLastname("bbb");
		a.setSex(0);
		a.setProvince("BJ");
		BaseResponse response = usSV.updateTranslatorByUserId(a);
		System.out.println(g.toJson(response));
	}
	
	@Test
	public void insertTralatorTest(){
		InsertYCTranslatorRequest translatorRequest = new InsertYCTranslatorRequest();
		translatorRequest.setUserId("12345");
		translatorRequest.setFirstName("test");
		translatorRequest.setLastName("test");
		translatorRequest.setBirthday(DateUtil.getSysDate());
		translatorRequest.setWorkingLife(12);
		translatorRequest.setAreaOfExperise("1");
		translatorRequest.setAreaOfUse("12");
		usSV.insertTranslator(translatorRequest);
	}
}
