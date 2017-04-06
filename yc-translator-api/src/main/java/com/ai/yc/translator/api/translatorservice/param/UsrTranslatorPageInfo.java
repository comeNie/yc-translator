package com.ai.yc.translator.api.translatorservice.param;

import java.sql.Timestamp;

public class UsrTranslatorPageInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

   /**
    * 翻译员id
    */
	private String translatorId;
	/**
	 * 用户id
	 */
	private String userId;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 姓名
     */
    private String firstname;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 手机
     */
    private String mobilePhone;
    /**
     * 工作年限
     */
    private Integer workingLife;
    /**
     * 母语
     */
    private String motherTongue;
    /**
     * 级别
     */
    private String vipLevel;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 注册时间
     */
    private Timestamp createTime;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 申请来源
     */    
    private String usersource;
	public String getTranslatorId() {
		return translatorId;
	}
	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
	public String getVipLevel() {
		return vipLevel;
	}
	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	} 
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsersource() {
		return usersource;
	}
	public void setUsersource(String usersource) {
		this.usersource = usersource;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
    
    
}
