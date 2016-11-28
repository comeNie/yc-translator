package com.ai.yc.translator.api.userservice.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月3日 下午7:55:52 
 * @version 
 * @since  
 */
public class YCContactInfoResponse extends BaseResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8328389164342159315L;

	private String responseCode;
    private List<UsrContactMessage> usrContactList;

	public List<UsrContactMessage> getUsrContactList() {
		return usrContactList;
	}

	public void setUsrContactList(List<UsrContactMessage> usrContactList) {
		this.usrContactList = usrContactList;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

    
    
}
