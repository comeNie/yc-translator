package com.ai.yc.translator.api.usrextend.param;

public class UsrExtendInfo {
	/**
	 * 主键Id
	 */
    private String extendId;
    /**
     * 译员Id
     */
    private String translatorId;
    /**
     * 类型 1、用途 2、领域
     */
    private String extendType;
    /**
     * 用途、领域编码值
     */
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