package com.ai.yc.user.api.userservice.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:17:36 
 * @version 
 * @since  
 */
public class InsertYCUserRequest implements Serializable{
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
	private static final long serialVersionUID = -6684903649163120222L;
	/**
	 * 手机注册时userId需要有值
	 */
	private String userId;
	
	/**
	 * 手机激活码
	 * 手机+密码方式有值
	 */
	private String operationcode;
	/**
	 * 必填
	 * 注册方式
	 * 1：邮箱密码
	 * 2：手机密码
	 * 3：手机动态密码
	 * 4：用户名密码
	 */
	private String loginway;
	/**
	 * 必填
	 * 注册ip
	 */
	private String regip;
	/**
	 * 用户名 默认手机号或者是邮箱地址 +随机数
	 * 必填
	 */
	private String userName;
	/**
	 * 座机电话
	 */
	private String telephone; 
	/**
	 * 邮箱地址
	 */
	private String email; 
	/**
	 * 密码
	 */
	private String password; 
	
	/**
	 * 昵称 注册默认译粉+随机数
	 * 必填
	 */
	private String nickname; 
	
    private String lastname;

    private String firstname;
    /**
     * 性别 0、女， 1、男
     */
    private Integer sex;
    /**
     * 手机号
     */
    private String mobilePhone;
    /**
     * QQ
     */
    private String qq;
    /**
     * 地址
     */
    private String address;
    
    /**
     * 国家
     */
    private String country;
    /**
     * 城市
     */
    private String cnCity;
    /**
     * 省份
     */
    private String province;
    /**
     * 姓名
     */
    private String fullName;
    
    /**
     * 个人头像id
     */
    private String portraitId;
    
	public InsertYCUserRequest() {
		super();
	}

	public InsertYCUserRequest(String userId, String operationcode, String loginway, String regip, String userName,
			String telephone, String email, String password, String nickname, String lastname, String firstname,
			Integer sex, String mobilePhone, String qq, String address, String country, String cnCity, String province,
			String fullName, String portraitId) {
		super();
		this.userId = userId;
		this.operationcode = operationcode;
		this.loginway = loginway;
		this.regip = regip;
		this.userName = userName;
		this.telephone = telephone;
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.lastname = lastname;
		this.firstname = firstname;
		this.sex = sex;
		this.mobilePhone = mobilePhone;
		this.qq = qq;
		this.address = address;
		this.country = country;
		this.cnCity = cnCity;
		this.province = province;
		this.fullName = fullName;
		this.portraitId = portraitId;
	}

	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getNickname() {
		return nickname;
	}



	public void setNickname(String nickname) {
		this.nickname = nickname;
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



	public Integer getSex() {
		return sex;
	}



	public void setSex(Integer sex) {
		this.sex = sex;
	}



	public String getMobilePhone() {
		return mobilePhone;
	}



	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
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


	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
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



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getRegip() {
		return regip;
	}



	public void setRegip(String regip) {
		this.regip = regip;
	}



	public String getLoginway() {
		return loginway;
	}



	public void setLoginway(String loginway) {
		this.loginway = loginway;
	}



	public String getOperationcode() {
		return operationcode;
	}



	public void setOperationcode(String operationcode) {
		this.operationcode = operationcode;
	}

	public String getPortraitId() {
		return portraitId;
	}

	public void setPortraitId(String portraitId) {
		this.portraitId = portraitId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
