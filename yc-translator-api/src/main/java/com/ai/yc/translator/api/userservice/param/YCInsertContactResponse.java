package com.ai.yc.translator.api.userservice.param;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月26日 下午4:16:16 
 * @version 
 * @since  
 */
public class YCInsertContactResponse extends BaseResponse  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1828802854271974605L;

	private String contactId;

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
}
