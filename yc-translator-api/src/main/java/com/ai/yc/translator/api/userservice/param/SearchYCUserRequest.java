package com.ai.yc.translator.api.userservice.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:19:33 
 * @version 
 * @since  
 */
public class SearchYCUserRequest  implements Serializable{
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
	private static final long serialVersionUID = 4314651793756447401L;
	/**
	 * 用户uid／userid
	 */
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
