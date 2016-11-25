package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.yc.user.api.userservice.param.YCLSPInfoReponse;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrLanguage;
import com.ai.yc.user.dao.mapper.bo.UsrLanguageCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrLsp;
import com.ai.yc.user.dao.mapper.bo.UsrLspCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrTranslator;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;


public interface IYCUserServiceAtomSV {
    // 用户
    public int insertUserInfo(UsrUser user);

    int updateUserInfo(@Param("record") UsrUser record,
            @Param("example") UsrUserCriteria example);

    public UsrUser getUserInfo(String userId);

	public UsrTranslator getUsrTranslatorInfo(String userId);

	public UsrContact getUsrContactInfo(String userId);
	
	public UsrUser getUserInfoByNickName(UsrUserCriteria example);

	public List<UsrLanguage> getUsrLanguageList(UsrLanguageCriteria userIdCri);

	public UsrLsp searchLspById(String lspId) ;

	public List<UsrLsp> searchLspByName(UsrLspCriteria example) ;

	public UsrTranslator getUsrTranslatorInfoByTranslatorId(String translatorId);

}
