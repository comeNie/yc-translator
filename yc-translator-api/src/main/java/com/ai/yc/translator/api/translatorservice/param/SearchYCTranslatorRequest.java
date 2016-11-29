package com.ai.yc.translator.api.translatorservice.param;


import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月3日 下午7:05:20 
 * @version 
 * @since  
 */
public class SearchYCTranslatorRequest  implements Serializable{
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
	private static final long serialVersionUID = -1445662539360692130L;
	private String userId;
	private String translatorId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}
}
