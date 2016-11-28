package com.ai.yc.translator.api.userservice.param;

import java.sql.Timestamp;

public class UsrContactMessage {
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
    
    private CountryVo countryVo;

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId == null ? null : contactId.trim();
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
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
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

	public CountryVo getCountryVo() {
		return countryVo;
	}

	public void setCountryVo(CountryVo countryVo) {
		this.countryVo = countryVo;
	}
}