package com.ai.yc.translator.api.translatorservice.param;

import java.math.BigDecimal;

public class LspTranslatorInfo {
	/**
	 * 译员Id
	 */
	private String translatorId;
	/**
	 * 译员名称
	 */
	private String translatorName;
	/**
	 * 参考价格
	 */
	private BigDecimal referencePrice;
	public String getTranslatorId() {
		return translatorId;
	}
	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}
	public String getTranslatorName() {
		return translatorName;
	}
	public void setTranslatorName(String translatorName) {
		this.translatorName = translatorName;
	}
	public BigDecimal getReferencePrice() {
		return referencePrice;
	}
	public void setReferencePrice(BigDecimal referencePrice) {
		this.referencePrice = referencePrice;
	}
}
