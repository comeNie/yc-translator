package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:54:32 
 * @version 
 * @since  
 */
public class InsertYCEduHistoryRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7530249083410007001L;
	/**
	 * 译员ID
	 * 必填
	 */
	@NotBlank(message = "译员id不能为空")
	private String translatorId;
	
	private List<UsrEducationMessage> educationList;

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

	public List<UsrEducationMessage> getEducationList() {
		return educationList;
	}

	public void setEducationList(List<UsrEducationMessage> educationList) {
		this.educationList = educationList;
	}
	
	
}
