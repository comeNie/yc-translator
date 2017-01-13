package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;
import java.sql.Timestamp;

import org.hibernate.validator.constraints.NotBlank;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:50:50 
 * @version 
 * @since  
 */
public class UpdateYCTranslatorRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6961488699850826575L;
	/**
	 * 译员ID
	 * 必填
	 */
	@NotBlank(message = "译员id不能为空")
	private String translatorId;
	/**
	 * uid／userid
	 */
    private String userId;
    /**
     * 昵称
     */
    private String nickname;
    
    private String lastname;
	
    private String firstname;
    /**
	 * ucenter获取的用户名
	 */
	private String username;
	
    private Integer sex;

    private Timestamp birthday;

    private String telephone;
    /**
     * 
     */
    private String mobilePhone;
    /**
     * 
     */
    private String Email;
    /**
     * 身份证
     */
    private String legalCertNum;
    /**
     * 母语
     */
    private String motherTongue;
    /**
     * 翻译年限
     */
    private Integer workingLife;
    /**
     * 擅长领域
     * 用逗号分割
     * 1,4,6,8,9
     */
    private String areaOfExperise;
    /**
     * 擅长用途
     * 用逗号分割
     * 1,4,6,8,9
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
    /**
     * 个人简介
     */
    private String introduction;

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
    
    
}
