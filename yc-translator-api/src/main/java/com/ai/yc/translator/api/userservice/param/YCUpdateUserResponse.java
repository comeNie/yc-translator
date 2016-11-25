package com.ai.yc.translator.api.userservice.param;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:33:28 
 * @version 
 * @since  
 */
public class YCUpdateUserResponse extends BaseResponse {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5599793763844076165L;
	private String responseCode;
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

}
