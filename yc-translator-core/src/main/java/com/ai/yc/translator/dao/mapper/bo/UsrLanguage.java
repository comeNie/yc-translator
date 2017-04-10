package com.ai.yc.translator.dao.mapper.bo;

import java.math.BigDecimal;

public class UsrLanguage {
    private String languageId;

    private String userId;

    private String duadId;

    private String translationType;

    private BigDecimal referencePrice;

    private String state;

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId == null ? null : languageId.trim();
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