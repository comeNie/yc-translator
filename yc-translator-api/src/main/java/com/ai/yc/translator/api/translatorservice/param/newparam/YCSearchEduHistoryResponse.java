package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;
import java.util.List;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:55:15 
 * @version 
 * @since  
 */
public class YCSearchEduHistoryResponse implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = -92201909614710869L;
	private String translatorId;
	private List<UsrEducationMessage> translatorEduList;
	public String getTranslatorId() {
		return translatorId;
	}
	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}
	public List<UsrEducationMessage> getTranslatorEduList() {
		return translatorEduList;
	}
	public void setTranslatorEduList(List<UsrEducationMessage> translatorEduList) {
		this.translatorEduList = translatorEduList;
	}
	
	
}
