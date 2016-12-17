package com.ai.yc.translator.api.translatorservice.param.newparam;

public class UsrExtendMessage {
    private String extendId;

    private String translatorId;

    private String extendType;

    private String extendKey;

    public String getExtendId() {
        return extendId;
    }

    public void setExtendId(String extendId) {
        this.extendId = extendId == null ? null : extendId.trim();
    }

    public String getTranslatorId() {
        return translatorId;
    }

    public void setTranslatorId(String translatorId) {
        this.translatorId = translatorId == null ? null : translatorId.trim();
    }

    public String getExtendType() {
        return extendType;
    }

    public void setExtendType(String extendType) {
        this.extendType = extendType == null ? null : extendType.trim();
    }

    public String getExtendKey() {
        return extendKey;
    }

    public void setExtendKey(String extendKey) {
        this.extendKey = extendKey == null ? null : extendKey.trim();
    }
}