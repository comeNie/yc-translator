package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;
import java.util.List;

/**
 * @author 作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:56:18
 * @version
 * @since
 */
public class YCSearchWorkExprienceResponse implements Serializable {

	private String translatorId;
	private List<UsrWorkMessage> workList;

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

	public List<UsrWorkMessage> getWorkList() {
		return workList;
	}

	public void setWorkList(List<UsrWorkMessage> workList) {
		this.workList = workList;
	}

}
