package com.ai.yc.translator.api.userlanguage.param;

import java.math.BigDecimal;

public class UsrLanguageInfo {
	/**
	 * 语言对主键Id
	 */
	private String languageId;
	/**
	 * 用户Id
	 */
    private String userId;
    /**
     * 语言对Id
     */
    private String duadId;
    /**
     * 翻译类型
     */
    private String translationType;
    /**
     * 翻译价格
     */
    private BigDecimal referencePrice;
    /**
     * 翻译状态
     */
    private String state;

    
    
    public String getLanguageId() {
		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getDuadId() {
        return duadId;
    }

    public void setDuadId(String duadId) {
        this.duadId = duadId == null ? null : duadId.trim();
    }

    public String getTranslationType() {
        return translationType;
    }

    public void setTranslationType(String translationType) {
        this.translationType = translationType == null ? null : translationType.trim();
    }

    public BigDecimal getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(BigDecimal referencePrice) {
        this.referencePrice = referencePrice;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}
