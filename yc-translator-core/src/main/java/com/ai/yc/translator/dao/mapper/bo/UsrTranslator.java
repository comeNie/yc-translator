package com.ai.yc.translator.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrTranslator {
    private String translatorId;

    private String userId;

    private String nickname;

    private String lastname;

    private String firstname;

    private Integer sex;

    private Timestamp birthday;

    private String telephone;

    private String mobilePhone;

    private String fixPhone;

    private String qq;

    private String address;

    private String cnCity;

    private String province;

    private String country;

    private String tZone;

    private Integer workingLife;

    private String legalCertNum;

    private String motherTongue;

    private Timestamp lastModifyTime;

    private String introduction;

    private String vipLevel;

    private Integer state;

    private Timestamp createTime;

    private Integer billingCycle;

    private Timestamp statementDate;

    private String infoState;

    private String approveState;

    private String singleLock;

    private Integer contributionValue;

    public String getTranslatorId() {
        return translatorId;
    }

    public void setTranslatorId(String translatorId) {
        this.translatorId = translatorId == null ? null : translatorId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getFixPhone() {
        return fixPhone;
    }

    public void setFixPhone(String fixPhone) {
        this.fixPhone = fixPhone == null ? null : fixPhone.trim();
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

    public String getCnCity() {
        return cnCity;
    }

    public void setCnCity(String cnCity) {
        this.cnCity = cnCity == null ? null : cnCity.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String gettZone() {
        return tZone;
    }

    public void settZone(String tZone) {
        this.tZone = tZone == null ? null : tZone.trim();
    }

    public Integer getWorkingLife() {
        return workingLife;
    }

    public void setWorkingLife(Integer workingLife) {
        this.workingLife = workingLife;
    }

    public String getLegalCertNum() {
        return legalCertNum;
    }

    public void setLegalCertNum(String legalCertNum) {
        this.legalCertNum = legalCertNum == null ? null : legalCertNum.trim();
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue == null ? null : motherTongue.trim();
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
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel == null ? null : vipLevel.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(Integer billingCycle) {
        this.billingCycle = billingCycle;
    }

    public Timestamp getStatementDate() {
        return statementDate;
    }

    public void setStatementDate(Timestamp statementDate) {
        this.statementDate = statementDate;
    }

    public String getInfoState() {
        return infoState;
    }

    public void setInfoState(String infoState) {
        this.infoState = infoState == null ? null : infoState.trim();
    }

    public String getApproveState() {
        return approveState;
    }

    public void setApproveState(String approveState) {
        this.approveState = approveState == null ? null : approveState.trim();
    }

    public String getSingleLock() {
        return singleLock;
    }

    public void setSingleLock(String singleLock) {
        this.singleLock = singleLock == null ? null : singleLock.trim();
    }

    public Integer getContributionValue() {
        return contributionValue;
    }

    public void setContributionValue(Integer contributionValue) {
        this.contributionValue = contributionValue;
    }
}