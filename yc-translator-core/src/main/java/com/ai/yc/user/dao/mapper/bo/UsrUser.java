package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrUser {
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

    private Integer occupation;

    private Integer title;

    private String safetyLevel;

    private Timestamp registTime;

    private Timestamp lastModifyTime;

    private String usersource;

    private Integer state;

    private String personsign;

    private String zipCode;

    private String portraitId;

    private String isChange;

    private Integer isTranslator;

    private Long accountId;

    private String griwthLevel;

    private Integer griwthValue;

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

    public Integer getOccupation() {
        return occupation;
    }

    public void setOccupation(Integer occupation) {
        this.occupation = occupation;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public String getSafetyLevel() {
        return safetyLevel;
    }

    public void setSafetyLevel(String safetyLevel) {
        this.safetyLevel = safetyLevel == null ? null : safetyLevel.trim();
    }

    public Timestamp getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Timestamp registTime) {
        this.registTime = registTime;
    }

    public Timestamp getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Timestamp lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getUsersource() {
        return usersource;
    }

    public void setUsersource(String usersource) {
        this.usersource = usersource == null ? null : usersource.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPersonsign() {
        return personsign;
    }

    public void setPersonsign(String personsign) {
        this.personsign = personsign == null ? null : personsign.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getPortraitId() {
        return portraitId;
    }

    public void setPortraitId(String portraitId) {
        this.portraitId = portraitId == null ? null : portraitId.trim();
    }

    public String getIsChange() {
        return isChange;
    }

    public void setIsChange(String isChange) {
        this.isChange = isChange == null ? null : isChange.trim();
    }

    public Integer getIsTranslator() {
        return isTranslator;
    }

    public void setIsTranslator(Integer isTranslator) {
        this.isTranslator = isTranslator;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getGriwthLevel() {
        return griwthLevel;
    }

    public void setGriwthLevel(String griwthLevel) {
        this.griwthLevel = griwthLevel == null ? null : griwthLevel.trim();
    }

    public Integer getGriwthValue() {
        return griwthValue;
    }

    public void setGriwthValue(Integer griwthValue) {
        this.griwthValue = griwthValue;
    }
}