package com.ai.yc.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.yc.translator.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.translator.api.userservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.userservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.translator.api.userservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.userservice.param.YCTranslatorInfoResponse;
import com.ai.yc.translator.api.userservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.userservice.param.searchYCLSPInfoRequest;
import com.alibaba.fastjson.JSON;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月4日 上午10:17:52 
 * @version 
 * @since  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testusrservice {

	@Autowired
	private IYCUserServiceSV usSV;
	
	
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
		YCTranslatorSkillListResponse response = usSV.getTranslatorSkillList(a);
		System.out.println(JSON.toJSONString(response));
	}
	@Test
	public void testSearchLsp() {
		searchYCLSPInfoRequest a = new searchYCLSPInfoRequest();
		a.setLspId("1");
		YCLSPInfoReponse response = usSV.searchLSPInfo(a);
		System.out.println(JSON.toJSONString(response));
	}
	
}
