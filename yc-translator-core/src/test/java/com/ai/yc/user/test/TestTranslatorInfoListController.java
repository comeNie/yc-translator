package com.ai.yc.user.test;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.yc.translator.api.translatorservice.interfaces.IYCUserTranslatorSV;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfo;
import com.ai.yc.translator.api.translatorservice.param.TranslatorInfoQueryResponse;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfoRequest;
import com.ai.yc.ucenter.api.members.interfaces.IYCUcMembersSV;
import com.ai.yc.ucenter.api.members.param.UcMembersInfo;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class TestTranslatorInfoListController {
	@Autowired
	private IYCUserTranslatorSV ycUserTranslatorSV;
	@Test
	public void queryTranslatorInfoList(){
//		IYCUcMembersSV iYCUcMembersSV = DubboConsumerFactory.getService(IYCUcMembersSV.class);
		UsrTranslatorPageInfoRequest pageInfoRequest = new UsrTranslatorPageInfoRequest();
		pageInfoRequest.setPageNo(1);
		pageInfoRequest.setPageSize(10);
		pageInfoRequest.setState(0);
		TranslatorInfoQueryResponse response = ycUserTranslatorSV.queryPageInfoTranslatorInfo(pageInfoRequest);
		List<TranslatorInfo> list = new ArrayList<TranslatorInfo>();
//		for(int i=0;i<response.getPageInfo().getResult().size();i++){
//			TranslatorInfo translatorInfo =  response.getPageInfo().getResult().get(i);
//			UcMembersInfo ucMembersInfo = iYCUcMembersSV.queryUcMember(Integer.parseInt(translatorInfo.getUserId()));
//			translatorInfo.setUsersource(ucMembersInfo.getUsersource());
//			translatorInfo.setEmail(ucMembersInfo.getEmail());
//			list.add(translatorInfo);
//		}
		response.getPageInfo().setResult(list);		
		System.out.println(JSON.toJSONString(response));		
	}

}
