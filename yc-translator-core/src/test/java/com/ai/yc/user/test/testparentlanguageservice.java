package com.ai.yc.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.vo.BaseListResponse;
import com.ai.yc.translator.api.parentlanguage.interfaces.IYCParentLanguageSV;
import com.ai.yc.translator.api.parentlanguage.param.UsrParentLanguageInfo;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testparentlanguageservice {

		@Autowired
		private IYCParentLanguageSV usSV;
		
		@Test
		public void queryUsrExtendValue(){
			BaseListResponse<UsrParentLanguageInfo> response = usSV.queryLanguageValue();
			System.out.println(JSON.toJSONString(response));
		}
}
