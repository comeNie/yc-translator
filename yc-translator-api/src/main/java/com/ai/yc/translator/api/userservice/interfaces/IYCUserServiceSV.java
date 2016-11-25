package com.ai.yc.translator.api.userservice.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.yc.translator.api.userservice.param.InsertYCTranslatorRequest;
import com.ai.yc.translator.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.translator.api.userservice.param.SearchYCContactRequest;
import com.ai.yc.translator.api.userservice.param.SearchYCTranslatorRequest;
import com.ai.yc.translator.api.userservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.translator.api.userservice.param.SearchYCUserRequest;
import com.ai.yc.translator.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.translator.api.userservice.param.YCContactInfoResponse;
import com.ai.yc.translator.api.userservice.param.YCInsertTranslatorResponse;
import com.ai.yc.translator.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.translator.api.userservice.param.YCLSPInfoReponse;
import com.ai.yc.translator.api.userservice.param.YCTranslatorInfoResponse;
import com.ai.yc.translator.api.userservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.translator.api.userservice.param.YCUpdateUserResponse;
import com.ai.yc.translator.api.userservice.param.YCUserInfoResponse;
import com.ai.yc.translator.api.userservice.param.searchYCLSPInfoRequest;


@Path("/ycuserservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserServiceSV {


	/**
	 * 新增用户信息基本数据
	 * @param 
	 * @return
	 * @ApiCode USR_0001
     * @RestRelativeURL ycuserservice/insertYCUser
	 */
	@POST
	@Path("/insertYCUser")
	YCInsertUserResponse insertYCUser(InsertYCUserRequest registerParamsRequest);
	/**
	 * 修改用户基本信息数据
	 * @param 
	 * @return
	 * @ApiCode USR_0003
     * @RestRelativeURL ycuserservice/updateUserBaseInfo
	 */
	@POST
	@Path("/updateYCUserInfo")
	YCUpdateUserResponse updateYCUserInfo(UpdateYCUserRequest updateUserParams) ;
	/**
	 * 查询用户基本信息数据
	 * @param 
	 * @return
	 * @ApiCode USR_0002
     * @RestRelativeURL ycuserservice/searchYCUserInfo
	 */
	@POST
	@Path("/searchYCUserInfo")
	YCUserInfoResponse searchYCUserInfo(SearchYCUserRequest ucUser) ;

	/**
	 * 通过昵称查询基本信息
	 * @param 
	 * @return
	 * @ApiCode USR_0008
     * @RestRelativeURL ycuserservice/searchUserInfoByNickName
	 */
	@POST
	@Path("/searchUserInfoByNickName")
	public YCUserInfoResponse searchUserInfoByNickName(String nickName);
	
//	/**
//	 * 通过昵称查询基本信息
//	 * @param 
//	 * @return
//	 * @ApiCode USR_000
//     * @RestRelativeURL ycuserservice/insertYCTranslatorInfo
//	 */
//	@POST
//	@Path("insertYCTranslatorInfo")
//	public YCInsertTranslatorResponse insertYCTranslatorInfo(InsertYCTranslatorRequest translatorInfo);
	
	
	/**
	 * 查询译员基本信息数据
	 * @param 
	 * @return
	 * @ApiCode USR_0004
     * @RestRelativeURL ycuserservice/searchYCTranslatorInfo
	 */
	@POST
	@Path("/searchYCTranslatorInfo")
	YCTranslatorInfoResponse searchYCTranslatorInfo(SearchYCTranslatorRequest tUsrId);
	
	/**
	 * 查询译员通讯录
	 * @param 
	 * @return
	 * @ApiCode USR_0005
     * @RestRelativeURL ycuserservice/searchYCContactInfo
	 */
	@POST
	@Path("/searchYCContactInfo")
	YCContactInfoResponse searchYCContactInfo(SearchYCContactRequest cUsrId);
	

	/**
	 * 查询译员语言技能列表
	 * @param 
	 * @return
	 * @ApiCode USR_0009
     * @RestRelativeURL ycuserservice/SearchTranslatorSkillList
	 */
	@POST
	@Path("/SearchTranslatorSkillList")
	YCTranslatorSkillListResponse getTranslatorSkillList(SearchYCTranslatorSkillListRequest getSkillList);
	
	/**
	 * 查询LSP信息
	 * @param 
	 * @return
	 * @ApiCode USR_0010
     * @RestRelativeURL ycuserservice/searchLSPInfo
	 */
	@POST
	@Path("/searchLSPInfo")
	YCLSPInfoReponse searchLSPInfo(searchYCLSPInfoRequest searchLSPParams);
	
}
