package com.ai.yc.translator.api.translatorservice.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月8日 上午11:33:09 
 * @version 
 * @since  
 */
public class SearchYCTranslatorSkillListRequest  implements Serializable{
	/**
	 * 租户Id，必填
	 */
	private String tenantId;
	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -8529021939899100513L;

	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
