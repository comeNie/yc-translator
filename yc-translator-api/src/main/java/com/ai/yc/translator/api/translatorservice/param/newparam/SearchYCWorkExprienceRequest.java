package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:59:42 
 * @version 
 * @since  
 */
public class SearchYCWorkExprienceRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2066524922716212958L;
	/**
	 * 译员ID
	 * 必填
	 */
	@NotBlank(message = "译员id不能为空")
    private String translatorId;

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}
}
