package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author 作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午4:00:43
 * @version
 * @since
 */
public class InsertYCCertificationsRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4807128951244054863L;
	/**
	 * 译员ID 必填
	 */
	private String translatorId;
	
	private List<UsrCertificateMessage> certificateList;

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

	public List<UsrCertificateMessage> getCertificateList() {
		return certificateList;
	}

	public void setCertificateList(List<UsrCertificateMessage> certificateList) {
		this.certificateList = certificateList;
	}

}
