package com.ai.yc.translator.api.translatorservice.param;

import java.io.Serializable;

public class AlloTranslatorRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	private String lspId;
	private String duadId;

	public String getLspId() {
		return lspId;
	}

	public void setLspId(String lspId) {
		this.lspId = lspId;
	}

	public String getDuadId() {
		return duadId;
	}

	public void setDuadId(String duadId) {
		this.duadId = duadId;
	}

}
