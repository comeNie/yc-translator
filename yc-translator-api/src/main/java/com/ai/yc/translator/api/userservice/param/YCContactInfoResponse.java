package com.ai.yc.translator.api.userservice.param;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月3日 下午7:55:52 
 * @version 
 * @since  
 */
public class YCContactInfoResponse extends BaseResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8328389164342159315L;

	private String responseCode;

    private String userName;

    private String phone;

    private String mobile;

    private String email;

    private String qq;

    private String address;

    private String zipCode;

    private Integer isDefault;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public YCContactInfoResponse() {
		super();
	}

	public YCContactInfoResponse(String userName, String phone, String mobile, String email, String qq, String address,
			String zipCode, Integer isDefault) {
		super();
		this.userName = userName;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.qq = qq;
		this.address = address;
		this.zipCode = zipCode;
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "YCContactInfo [userName=" + userName + ", phone=" + phone + ", mobile=" + mobile + ", email=" + email
				+ ", qq=" + qq + ", address=" + address + ", zipCode=" + zipCode + ", isDefault=" + isDefault + "]";
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

    
    
}
