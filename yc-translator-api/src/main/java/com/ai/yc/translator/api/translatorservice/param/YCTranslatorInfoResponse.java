package com.ai.yc.translator.api.translatorservice.param;

import java.math.BigDecimal;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月3日 下午7:06:04 
 * @version 
 * @since  
 */
public class YCTranslatorInfoResponse extends BaseResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9068009364796285584L;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * LSP id
	 */
    private String lspId;
    /**
     * 昵称
     */
    private String nickname;
	/**
	 * lsp角色
	 */
    private String lspRole;
	/**
	 * 工作年限
	 */
    private Integer workingLife;
	/**
	 * 母语
	 */
    private String motherTongue;
	/**
	 * 翻译类型
	 */
    private String translationType;

    private BigDecimal interpretPrice;

    private String introduction;

    private Integer isLsp;

    private String vipLevel;

    private String legalCertNum;
	
	private String responseCode;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLspId() {
		return lspId;
	}

	public void setLspId(String lspId) {
		this.lspId = lspId;
	}

	public String getLspRole() {
		return lspRole;
	}

	public void setLspRole(String lspRole) {
		this.lspRole = lspRole;
	}

	public Integer getWorkingLife() {
		return workingLife;
	}

	public void setWorkingLife(Integer workingLife) {
		this.workingLife = workingLife;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getTranslationType() {
		return translationType;
	}

	public void setTranslationType(String translationType) {
		this.translationType = translationType;
	}

	public BigDecimal getInterpretPrice() {
		return interpretPrice;
	}

	public void setInterpretPrice(BigDecimal interpretPrice) {
		this.interpretPrice = interpretPrice;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Integer getIsLsp() {
		return isLsp;
	}

	public void setIsLsp(Integer isLsp) {
		this.isLsp = isLsp;
	}

	public String getVipLevel() {
		return vipLevel;
	}

	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel;
	}

	public String getLegalCertNum() {
		return legalCertNum;
	}

	public void setLegalCertNum(String legalCertNum) {
		this.legalCertNum = legalCertNum;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
