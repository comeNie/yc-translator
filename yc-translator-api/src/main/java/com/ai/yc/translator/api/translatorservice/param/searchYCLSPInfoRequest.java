package com.ai.yc.translator.api.translatorservice.param;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseInfo;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月8日 下午5:57:39 
 * @version 
 * @since  
 */
public class searchYCLSPInfoRequest  implements Serializable {
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
	private static final long serialVersionUID = 2505239242530571547L;

	private String lspId;

    private String lspName;

	public String getLspId() {
		return lspId;
	}

	public void setLspId(String lspId) {
		this.lspId = lspId;
	}

	public String getLspName() {
		return lspName;
	}

	public void setLspName(String lspName) {
		this.lspName = lspName;
	}

}
