package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;
import java.sql.Timestamp;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:49:31 
 * @version 
 * @since  
 */
public class InsertYCTranslatorRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4076022900230531357L;

	/**
	 * 必填 
	 * uid／userid
	 */
    private String userId;
    
    private String firstName;
    
    private String lastName;
    /**
     * 昵称
     * 必填
     */
    private String nickname;
    
    
    /**
	 * ucenter获取的用户名
	 * 必填
	 */
	private String username;
	
    private Integer sex;

    private Timestamp birthday;
    
    private String tmpBirthday;

    /**
     * 必填
     */
    private String mobilePhone;
    /**
     * 必填
     */
    private String Email;
    /**
     * 身份证
     */
    private String legalCertNum;
    /**
     * 母语
     * 必填
     */
    private String motherTongue;
    /**
     * 翻译年限
     * 必填
     */
    private Integer workingLife;
    /**
     * 擅长领域
     * 用逗号分割
     * 1,4,6,8,9
     * 必填
     */
    private String areaOfExperise;
    /**
     * 擅长用途
     * 用逗号分割
     * 1,4,6,8,9
     * 必填
     */
    private String areaOfUse;
    /**
     * 座机
     */
    private String fixPhone;
    
    private String qq;
    
    private String address;

    private String cnCity;

    private String province;

    private String country;
    
    private String introduction;

    private String portraitId;
    
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getTmpBirthday() {
		return tmpBirthday;
	}

	public void setTmpBirthday(String tmpBirthday) {
		this.tmpBirthday = tmpBirthday;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getLegalCertNum() {
		return legalCertNum;
	}

	public void setLegalCertNum(String legalCertNum) {
		this.legalCertNum = legalCertNum;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public Integer getWorkingLife() {
		return workingLife;
	}

	public void setWorkingLife(Integer workingLife) {
		this.workingLife = workingLife;
	}

	public String getAreaOfExperise() {
		return areaOfExperise;
	}

	public void setAreaOfExperise(String areaOfExperise) {
		this.areaOfExperise = areaOfExperise;
	}

	public String getAreaOfUse() {
		return areaOfUse;
	}

	public void setAreaOfUse(String areaOfUse) {
		this.areaOfUse = areaOfUse;
	}

	public String getFixPhone() {
		return fixPhone;
	}

	public void setFixPhone(String fixPhone) {
		this.fixPhone = fixPhone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCnCity() {
		return cnCity;
	}

	public void setCnCity(String cnCity) {
		this.cnCity = cnCity;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPortraitId() {
		return portraitId;
	}

	public void setPortraitId(String portraitId) {
		this.portraitId = portraitId;
	}
}
