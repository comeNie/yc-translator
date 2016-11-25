package com.ai.yc.translator.dao.mapper.bo;

public class UsrCustFileExt {
    private String infoExtId;

    private String userId;

    private String userType;

    private String infoName;

    private String infoType;

    private String infoItem;

    private String attrId;

    private String attrValue;

    private String editState;

    private String state;

    public String getInfoExtId() {
        return infoExtId;
    }

    public void setInfoExtId(String infoExtId) {
        this.infoExtId = infoExtId == null ? null : infoExtId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName == null ? null : infoName.trim();
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType == null ? null : infoType.trim();
    }

    public String getInfoItem() {
        return infoItem;
    }

    public void setInfoItem(String infoItem) {
        this.infoItem = infoItem == null ? null : infoItem.trim();
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId == null ? null : attrId.trim();
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue == null ? null : attrValue.trim();
    }

    public String getEditState() {
        return editState;
    }

    public void setEditState(String editState) {
        this.editState = editState == null ? null : editState.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}