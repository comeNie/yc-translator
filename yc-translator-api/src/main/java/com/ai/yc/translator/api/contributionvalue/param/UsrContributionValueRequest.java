package com.ai.yc.translator.api.contributionvalue.param;

import java.sql.Timestamp;

public class UsrContributionValueRequest {
	/**
	 * 主键Id
	 */
    private String recordId;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 贡献值
     */
    private int contributionValue;
    /**
     * 贡献值来源
     */
    private String contributionResource;
    /**
     * 贡献值详情
     */
    private String resourceDetail;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 来源时间
     */
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
		this.userId = userId;
	}

	public int getContributionValue() {
		return contributionValue;
	}

	public void setContributionValue(int contributionValue) {
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