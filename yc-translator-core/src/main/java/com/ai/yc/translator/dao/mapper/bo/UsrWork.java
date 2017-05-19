package com.ai.yc.translator.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrWork {
    private String workId;

    private String translatorId;

    private String company;

    private String position;

    private String workStartTime;

    private String workEndTime;

    private String workSummaize;

    private Timestamp createTime;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getTranslatorId() {
        return translatorId;
    }

    public void setTranslatorId(String translatorId) {
        this.translatorId = translatorId == null ? null : translatorId.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getWorkStartTime() {
        return workStartTime;
    }

    public void setWorkStartTime(String workStartTime) {
        this.workStartTime = workStartTime == null ? null : workStartTime.trim();
    }

    public String getWorkEndTime() {
        return workEndTime;
    }

    public void setWorkEndTime(String workEndTime) {
        this.workEndTime = workEndTime == null ? null : workEndTime.trim();
    }

    public String getWorkSummaize() {
        return workSummaize;
    }

    public void setWorkSummaize(String workSummaize) {
        this.workSummaize = workSummaize == null ? null : workSummaize.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}