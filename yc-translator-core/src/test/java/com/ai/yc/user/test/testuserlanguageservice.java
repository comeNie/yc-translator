package com.ai.yc.user.test;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.yc.translator.api.userlanguage.interfaces.IYCUserLanguageSV;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testuserlanguageservice {
	@Autowired
	private IYCUserLanguageSV userLanguageSV;
	@Test
	public void testLanguageInsert(){
		UsrLanguageRequest languageRequest = new UsrLanguageRequest();
		languageRequest.setDuadId("1");
		languageRequest.setReferencePrice(new BigDecimal(200));
		languageRequest.setTranslationType("0");
		languageRequest.setUserId("525335");
		languageRequest.setState("0");
		userLanguageSV.insertLanguageInfo(languageRequest);
	}
	@Test
	public void testQueryLanguage(){
		System.out.println(JSON.toJSON(userLanguageSV.queryLanguageInfo("525335")));
	}
}
