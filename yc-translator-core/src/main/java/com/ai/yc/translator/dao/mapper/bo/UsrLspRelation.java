package com.ai.yc.translator.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrLspRelation {
    private String lspTranslatorId;

    private String lspId;

    private String translatorId;

    private String translatorRole;

    private Timestamp joinTime;

    public String getLspTranslatorId() {
        return lspTranslatorId;
    }

    public void setLspTranslatorId(String lspTranslatorId) {
        this.lspTranslatorId = lspTranslatorId == null ? null : lspTranslatorId.trim();
    }

    public String getLspId() {
        return lspId;
    }

    public void setLspId(String lspId) {
        this.lspId = lspId == null ? null : lspId.trim();
    }

    public String getTranslatorId() {
        return translatorId;
    }

    public void setTranslatorId(String translatorId) {
        this.translatorId = translatorId == null ? null : translatorId.trim();
    }

    public String getTranslatorRole() {
        return translatorRole;
    }

    public void setTranslatorRole(String translatorRole) {
        this.translatorRole = translatorRole == null ? null : translatorRole.trim();
    }

    public Timestamp getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Timestamp joinTime) {
        this.joinTime = joinTime;
    }
}