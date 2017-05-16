package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;
import java.sql.Timestamp;

public class UsrEducationMessage implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String educationId;

    private String translatorId;

    private String studyStartTime;

    private String studyEndTime;

    private String school;

    private String profession;

    private String eduBackground;

    private String country;

    private String eduAddr;

    private Timestamp createTime;

    public String getEducationId() {
        return educationId;
    }

    public void setEducationId(String educationId) {
        this.educationId = educationId == null ? null : educationId.trim();
    }

    public String getTranslatorId() {
        return translatorId;
    }

    public void setTranslatorId(String translatorId) {
        this.translatorId = translatorId == null ? null : translatorId.trim();
    }

    public String getStudyStartTime() {
        return studyStartTime;
    }

    public void setStudyStartTime(String studyStartTime) {
        this.studyStartTime = studyStartTime == null ? null : studyStartTime.trim();
    }

    public String getStudyEndTime() {
        return studyEndTime;
    }

    public void setStudyEndTime(String studyEndTime) {
        this.studyEndTime = studyEndTime == null ? null : studyEndTime.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(String eduBackground) {
        this.eduBackground = eduBackground == null ? null : eduBackground.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getEduAddr() {
        return eduAddr;
    }

    public void setEduAddr(String eduAddr) {
        this.eduAddr = eduAddr == null ? null : eduAddr.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}