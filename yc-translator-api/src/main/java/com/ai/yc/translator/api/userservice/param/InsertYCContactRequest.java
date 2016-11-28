package com.ai.yc.translator.api.userservice.param;

import java.io.Serializable;
import java.sql.Timestamp;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月26日 下午4:22:09 
 * @version 
 * @since  
 */
public class InsertYCContactRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3164455299594844731L;

	/**
	 * 如果有传id的话就是修改
	 */
	private String contactId;

    private Integer gnCountryId;

    private String userId;

    private String userName;

    private String phone;

    private String mobilePhone;

    private String email;

    private String qq;

    private String address;

    private String zipCode;

    private Integer isDefault;

    private Timestamp createTime;

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public Integer getGnCountryId() {
		return gnCountryId;
	}

	public void setGnCountryId(Integer gnCountryId) {
		this.gnCountryId = gnCountryId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
    
}
