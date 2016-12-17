package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import com.ai.yc.translator.api.translatorservice.param.UsrLanguageMessage;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:51:46 
 * @version 
 * @since  
 */
public class InsertYCLanguageSkillRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3037736620026918199L;

	/**
	 * 译员id为必填
	 */
	@NotBlank(message = "译员id不为空")
	private String translatorId;
	/**
	 * 语言列表
	 */
	private List<UsrLanguageMessage> translatorLanguageSkill;

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

	public List<UsrLanguageMessage> getTranslatorLanguageSkill() {
		return translatorLanguageSkill;
	}

	public void setTranslatorLanguageSkill(List<UsrLanguageMessage> translatorLanguageSkill) {
		this.translatorLanguageSkill = translatorLanguageSkill;
	}
}
