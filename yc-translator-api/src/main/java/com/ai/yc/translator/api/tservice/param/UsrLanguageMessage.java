package com.ai.yc.translator.api.tservice.param;

public class UsrLanguageMessage {
	private String translatorId;

    private String extendId;

    private String translationType;

    private Integer referencePrice;

    private String state;

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

    public Integer getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(Integer referencePrice) {
        this.referencePrice = referencePrice;
    }

	public String getTranslationType() {
		return translationType;
	}

	public void setTranslationType(String translationType) {
		this.translationType = translationType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}