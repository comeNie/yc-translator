package com.ai.yc.translator.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrContributionValue {
    private String recordId;

    private String userId;

    private Integer contributionValue;

    private String contributionResource;

    private String resourceDetail;

    private Timestamp createTime;

    private Timestamp resourceTime;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getContributionValue() {
        return contributionValue;
    }

    public void setContributionValue(Integer contributionValue) {
        this.contributionValue = contributionValue;
    }

    public String getContributionResource() {
        return contributionResource;
    }

    public void setContributionResource(String contributionResource) {
        this.contributionResource = contributionResource == null ? null : contributionResource.trim();
    }

    public String getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(String resourceDetail) {
        this.resourceDetail = resourceDetail == null ? null : resourceDetail.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getResourceTime() {
        return resourceTime;
    }

    public void setResourceTime(Timestamp resourceTime) {
        this.resourceTime = resourceTime;
    }
}