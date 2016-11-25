package com.ai.yc.translator.api.userservice.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseInfo;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月7日 下午5:47:37 
 * @version 
 * @since  
 */
public class InsertYCTranslatorRequest  implements Serializable {

	/**
	 * 租户Id，必填
	 */
	private String tenantId;
	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1192887801222567330L;
	
	
	private String userId;

    private String lspId;

    private String lspRole;

    private Integer workingLife;

    private String motherTongue;

    private Integer state;

    private String translationType;

    private BigDecimal interpretPrice;

    private Timestamp createTime;

    private Timestamp lastModifyTime;

    private String introduction;

    private Integer isLsp;

    private String vipLevel;

    private String legalCertNum;

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

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
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

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Timestamp lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
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


}
