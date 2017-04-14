package com.ai.yc.translator.api.parentlanguage.param;

public class UsrParentLanguageInfo {
	/**
	 * 主键
	 */
    private String pkDicTable;
    /**
     * 语言
     */
    private String language;
    /**
     * int值
     */
    private Integer intValue;
    /**
     * string 值
     */
    private String stringValue;
    /**
     * 名称中文
     */
    private String nameZH;
    /**
     * 名称英文
     */
    private String nameEN;
    /**
     * 类型
     */
    private Integer type;

    public String getPkDicTable() {
        return pkDicTable;
    }

    public void setPkDicTable(String pkDicTable) {
        this.pkDicTable = pkDicTable == null ? null : pkDicTable.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue == null ? null : stringValue.trim();
    }

    public String getNameZH() {
		return nameZH;
	}

	public void setNameZH(String nameZH) {
		this.nameZH = nameZH;
	}

	public String getNameEN() {
		return nameEN;
	}

	public void setNameEN(String nameEN) {
		this.nameEN = nameEN;
	}

	public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}