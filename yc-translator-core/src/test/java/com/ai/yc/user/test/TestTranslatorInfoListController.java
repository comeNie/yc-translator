package com.ai.yc.user.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.ai.yc.translator.api.translatorservice.interfaces.IYCUserTranslatorSV;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryResponse;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfoRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class TestTranslatorInfoListController {
	@Autowired
	private IYCUserTranslatorSV ycUserTranslatorSV;
	@Test
	public void queryTranslatorInfoList(){
		UsrTranslatorPageInfoRequest pageInfoRequest = new UsrTranslatorPageInfoRequest();
		pageInfoRequest.setState(0);
		//userInfoRequest.setCompanyName("1212");
		pageInfoRequest.setPageNo(1);
		pageInfoRequest.setPageSize(10);
		TranslatorInfoQueryResponse response = ycUserTranslatorSV.queryPageInfoTranslatorInfo(pageInfoRequest) ;
		System.out.println(JSON.toJSONString(response));		
	}

}
