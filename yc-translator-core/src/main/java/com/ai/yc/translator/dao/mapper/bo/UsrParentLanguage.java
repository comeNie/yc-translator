package com.ai.yc.translator.dao.mapper.bo;

public class UsrParentLanguage {
    private String pkDicTable;

    private String language;

    private Integer intValue;

    private String stringValue;

    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}