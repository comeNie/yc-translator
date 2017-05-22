package com.ai.yc.translator.api.translatorservice.param;

import java.util.List;

import com.ai.yc.translator.api.translatorservice.param.newparam.InsertYCWorkExprienceRequest;
import com.ai.yc.translator.api.translatorservice.param.newparam.UsrCertificateMessage;
import com.ai.yc.translator.api.translatorservice.param.newparam.UsrEducationMessage;
import com.ai.yc.translator.api.translatorservice.param.newparam.UsrWorkMessage;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageInfo;
import com.ai.yc.translator.api.userlanguage.param.UsrLanguageRequest;

public class TraslatorCertificateInfoRequest {
	String userId;
	List<UsrLanguageInfo> languageList;
	List<UsrEducationMessage> eduResultList;
	List<UsrWorkMessage> workResultList;
	List<UsrCertificateMessage> cardResultList;
	public List<UsrEducationMessage> getEduResultList() {
		return eduResultList;
	}
	public void setEduResultList(List<UsrEducationMessage> eduResultList) {
		this.eduResultList = eduResultList;
	}
	public List<UsrWorkMessage> getWorkResultList() {
		return workResultList;
	}
	public void setWorkResultList(List<UsrWorkMessage> workResultList) {
		this.workResultList = workResultList;
	}
	public List<UsrCertificateMessage> getCardResultList() {
		return cardResultList;
	}
	public void setCardResultList(List<UsrCertificateMessage> cardResultList) {
		this.cardResultList = cardResultList;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<UsrLanguageInfo> getLanguageList() {
		return languageList;
	}
	public void setLanguageList(List<UsrLanguageInfo> languageList) {
		this.languageList = languageList;
	}
	
}
