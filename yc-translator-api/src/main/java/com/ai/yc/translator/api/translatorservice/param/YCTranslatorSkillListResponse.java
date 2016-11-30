package com.ai.yc.translator.api.translatorservice.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月8日 上午11:33:44 
 * @version 
 * @since  
 */
public class YCTranslatorSkillListResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7569526264506446701L;

    private String userId;
    
    private String lspId; // lsp ID

    private String lspRole; // lsp 角色 
    /**
     * 译员级别
     */
    private String vipLevel;
    
    private List<UsrLanguageMessage> usrLanguageList;
    /**
     * 0代表审核不通过 1代表审核通过
     */
    private String approveState;
    
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLspId() {
		return lspId;
	}

	public void setLspId(String lspId) {
		this.lspId = lspId;
	}

	public String getLspRole() {
		return lspRole;
	}

	public void setLspRole(String lspRole) {
		this.lspRole = lspRole;
	}

	public String getVipLevel() {
		return vipLevel;
	}

	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel;
	}

	public List<UsrLanguageMessage> getUsrLanguageList() {
		return usrLanguageList;
	}

	public void setUsrLanguageList(List<UsrLanguageMessage> usrLanguageList) {
		this.usrLanguageList = usrLanguageList;
	}

	public String getApproveState() {
		return approveState;
	}

	public void setApproveState(String approveState) {
		this.approveState = approveState;
	}


    
}
