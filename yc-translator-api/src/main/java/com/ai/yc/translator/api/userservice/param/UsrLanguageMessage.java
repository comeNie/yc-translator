package com.ai.yc.translator.api.userservice.param;

public class UsrLanguageMessage {
    private String translatorId;

    private String extendId;

    private String userType;

    private Integer referencePrice;

    public String getTranslatorId() {
        return translatorId;
    }

    public void setTranslatorId(String translatorId) {
        this.translatorId = translatorId == null ? null : translatorId.trim();
    }

    public String getExtendId() {
        return extendId;
    }

    public void setExtendId(String extendId) {
        this.extendId = extendId == null ? null : extendId.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Integer getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(Integer referencePrice) {
        this.referencePrice = referencePrice;
    }
}