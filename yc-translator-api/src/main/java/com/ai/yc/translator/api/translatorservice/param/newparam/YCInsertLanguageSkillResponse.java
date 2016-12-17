package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:51:17 
 * @version 
 * @since  
 */
public class YCInsertLanguageSkillResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7028991312329466364L;
	private String translatorId;

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}
}
