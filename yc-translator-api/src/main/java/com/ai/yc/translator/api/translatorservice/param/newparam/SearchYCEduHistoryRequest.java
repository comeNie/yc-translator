package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:55:28 
 * @version 
 * @since  
 */
public class SearchYCEduHistoryRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4773241305098079174L;

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
