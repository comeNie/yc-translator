package com.ai.yc.translator.api.translatorservice.param;


import java.io.Serializable;


/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月3日 下午7:05:20 
 * @version 
 * @since  
 */
public class SearchYCTranslatorRequest  implements Serializable{
	
	private static final long serialVersionUID = -1445662539360692130L;
	
	/**
	 * 租户Id
	 */
	private String tenantId;
	
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 译员ID
	 */
	private String translatorId;
	/**
	 * lspID
	 */
	private String lspId;
	/**
	 * 语言对Id
	 */
	private String languagePairId;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

	public String getLspId() {
		return lspId;
	}

	public void setLspId(String lspId) {
		this.lspId = lspId;
	}

	public String getLanguagePairId() {
		return languagePairId;
	}

	public void setLanguagePairId(String languagePairId) {
		this.languagePairId = languagePairId;
	}
	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}
