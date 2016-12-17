package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:57:56 
 * @version 
 * @since  
 */
public class YCSearchTranslatorExtendsListResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7670610037072597383L;
	/**
	 * 译员ID 必填
	 */
	@NotBlank(message = "译员id不能为空")
	private String translatorId;
	
	private List<UsrExtendMessage> ExtendList;

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

	public List<UsrExtendMessage> getExtendList() {
		return ExtendList;
	}

	public void setExtendList(List<UsrExtendMessage> extendList) {
		ExtendList = extendList;
	}
	
	
}
