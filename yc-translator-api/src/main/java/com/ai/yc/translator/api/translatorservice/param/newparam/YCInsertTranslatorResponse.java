package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:48:51 
 * @version 
 * @since  
 */
public class YCInsertTranslatorResponse extends BaseResponse {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7685959226138400510L;

	private String translatorId;

    private String userId;

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
