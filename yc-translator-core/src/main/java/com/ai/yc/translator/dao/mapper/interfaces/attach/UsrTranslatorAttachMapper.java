package com.ai.yc.translator.dao.mapper.interfaces.attach;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfo;
import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfoRequest;
public interface UsrTranslatorAttachMapper {
	@SelectProvider(type=UsrTranslatorQueryList.class,method="queryUserTranslator")
	@Results({
			@Result(property = "translatorId", column = "translator.translator_id", javaType = String.class),
			@Result(property = "usersource", column = "members.usersource", javaType = Integer.class),
			@Result(property = "nickname", column = "translator.nickname", javaType = String.class),
			@Result(property = "mobilePhone", column = "translator.mobile_phone", javaType = String.class),
			@Result(property = "email", column = "members.email", javaType = String.class),
			@Result(property = "lastname", column = "translator.lastname", javaType = String.class),
			@Result(property = "firstname", column = "translator.firstname", javaType = String.class),
			@Result(property = "sex", column = "translator.sex", javaType = String.class),
			@Result(property = "motherTongue", column = "translator.mother_tongue", javaType = String.class),
			@Result(property = "workingLife", column = "translator.working_life", javaType = String.class),
			@Result(property = "createTime", column = "translator.create_time", javaType = Timestamp.class),
			@Result(property = "state", column = "translator.state", javaType = Integer.class), })	
	public List<UsrTranslatorPageInfo> getTranslatorInfoList(UsrTranslatorPageInfoRequest request);
	
	@SelectProvider(type=UsrTranslatorQueryList.class,method="queryUserTranslatorCount")
	public int getTranslatorInfoCount(UsrTranslatorPageInfoRequest request);

}
