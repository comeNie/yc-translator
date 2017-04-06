package com.ai.yc.translator.dao.mapper.interfaces.attach;

import com.ai.yc.translator.api.translatorservice.param.UsrTranslatorPageInfoRequest;

public class UsrTranslatorQueryList {

	public String queryUserTranslatorCount(UsrTranslatorPageInfoRequest pageInfoRequest){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("select count(*) count from usr_translator translator ");
		if(pageInfoRequest.getNickname() != null){
			stringBuffer.append("and translator.nick_name ="+pageInfoRequest.getNickname());
		}
		if(pageInfoRequest.getMotherTongue() != null){
			stringBuffer.append("and translator.mother_tongue = "+pageInfoRequest.getMotherTongue());
		}
		if(pageInfoRequest.getMobilePhone() != null){
			stringBuffer.append("and translator.mobile_phone = "+pageInfoRequest.getMobilePhone());
		}
		if(pageInfoRequest.getUserSource() != null){
			stringBuffer.append("and members.user_source = "+pageInfoRequest.getUserSource());
		}
		return stringBuffer.toString();
	}
	
	public String queryUserTranslator(UsrTranslatorPageInfoRequest pageInfoRequest){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("select translator.translator_id,translator.user_id,translator.nickname,translator.mobile_phone,translator.lastname,translator.firstname,translator.sex,translator.mother_tongue,translator.working_life,translator.create_time,translator.state from usr_translator translator ");
		if(pageInfoRequest.getNickname() != null){
			stringBuffer.append("and translator.nick_name ="+pageInfoRequest.getNickname());
		}
		if(pageInfoRequest.getMotherTongue() != null){
			stringBuffer.append("and translator.mother_tongue = "+pageInfoRequest.getMotherTongue());
		}
		if(pageInfoRequest.getMobilePhone() != null){
			stringBuffer.append("and translator.mobile_phone = "+pageInfoRequest.getMobilePhone());
		}
		if(pageInfoRequest.getUserSource() != null){
			stringBuffer.append("and members.user_source = "+pageInfoRequest.getUserSource());
		}
		return stringBuffer.toString();
	}
	
	
	
}
