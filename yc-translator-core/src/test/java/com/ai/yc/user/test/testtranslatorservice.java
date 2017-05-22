package com.ai.yc.user.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
import com.ai.yc.translator.api.translatorservice.param.TraslatorCertificateInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorInfoResponse;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.translatorservice.param.searchYCLSPInfoRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCWorkExprienceRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.SearchYCEduHistoryRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UpdateYCTranslatorRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UsrCertificateMessage;
import com.ai.yc.translator.api.translatorservice.param.newparam.UsrEducationMessage;
import com.ai.yc.translator.api.translatorservice.param.newparam.UsrWorkMessage;
import com.ai.yc.translator.api.translatorservice.param.newparam.YCSearchEduHistoryResponse;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageInfo;
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
		translatorRequest.setWorkingLife(12);
		translatorRequest.setAreaOfExperise("1");
		translatorRequest.setAreaOfUse("12");
		usSV.insertTranslator(translatorRequest);
	}
	
	@Test
	public void insertCerInfo(){
		
		List<UsrLanguageInfo> language = new ArrayList<UsrLanguageInfo>();
		UsrLanguageInfo usrLanguage = new UsrLanguageInfo();
		usrLanguage.setDuadId("121");
		usrLanguage.setLanguageId("120");
		usrLanguage.setTranslationType("2");
		usrLanguage.setUserId("525335");
		usrLanguage.setState("2");
		usrLanguage.setReferencePrice(new BigDecimal(200));
		language.add(usrLanguage);
		
		List<UsrEducationMessage> eduResultList = new ArrayList<UsrEducationMessage>();
		UsrEducationMessage edu = new UsrEducationMessage();
		edu.setEduAddr("aa");
		edu.setEduBackground("本科");
		edu.setSchool("师范");
		edu.setTranslatorId("525335");
		edu.setStudyStartTime("2016");
		edu.setStudyEndTime("2017");
		edu.setEduBackground("sfefe");
		eduResultList.add(edu);
		
		List<UsrWorkMessage> workResultList = new ArrayList<UsrWorkMessage>();
		UsrWorkMessage work = new UsrWorkMessage();
		work.setCompany("亚信");
		work.setTranslatorId("525335");
		work.setPosition("专业");
		workResultList.add(work);
		
		List<UsrCertificateMessage> cardResultList = new ArrayList<UsrCertificateMessage>();
		UsrCertificateMessage certifi = new UsrCertificateMessage();
		certifi.setCertificateName("sefe");
		certifi.setCertificateLevel("1");
		certifi.setTranslatorId("525335");
		cardResultList.add(certifi);
		
		TraslatorCertificateInfoRequest request = new TraslatorCertificateInfoRequest();
		request.setLanguageList(language);
		request.setCardResultList(cardResultList);
		request.setEduResultList(eduResultList);
		request.setWorkResultList(workResultList);
		request.setUserId("525335");
		
		
		usSV.insertCertificateInfo(request);
	}
	
	@Test
	public void testEducationQuery(){
		SearchYCEduHistoryRequest searchParams = new SearchYCEduHistoryRequest();
		searchParams.setTranslatorId("2");
		YCSearchEduHistoryResponse response = usSV.searchEduHistory(searchParams);
		System.out.println(JSON.toJSONString(response));
	}
}
