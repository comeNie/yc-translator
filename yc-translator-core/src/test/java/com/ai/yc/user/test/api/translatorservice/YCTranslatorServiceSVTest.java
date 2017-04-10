package com.ai.yc.user.test.api.translatorservice;

import com.ai.yc.translator.api.translatorservice.interfaces.IYCTranslatorServiceSV;
import com.ai.yc.translator.api.translatorservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.translator.api.translatorservice.param.YCTranslatorSkillListResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liutong on 2017/4/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class YCTranslatorServiceSVTest {
    @Autowired
    IYCTranslatorServiceSV translatorServiceSV;

    @Test
    public void getTranslatorSkillListTest(){
        SearchYCTranslatorSkillListRequest searchYCUserReq = new SearchYCTranslatorSkillListRequest();
        searchYCUserReq.setTenantId("yeecloud");
        searchYCUserReq.setUserId("525378");
        YCTranslatorSkillListResponse userInfoResponse = translatorServiceSV.getTranslatorSkillList(searchYCUserReq);
        System.out.println(userInfoResponse.getVipLevel()+":"+userInfoResponse.getApproveState());
    }
}
