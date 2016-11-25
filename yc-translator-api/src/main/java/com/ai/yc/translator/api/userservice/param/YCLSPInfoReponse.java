package com.ai.yc.translator.api.userservice.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * @author 作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月8日 下午5:57:58
 * @version
 * @since
 */
public class YCLSPInfoReponse extends BaseResponse {
	/**
	* 
	*/
	private static final long serialVersionUID = 1187052744373828027L;

	private String lspId;

    private String lspName;
    
	private List<UsrLspMessage> usrLspList;

	public List<UsrLspMessage> getUsrLspList() {
		return usrLspList;
	}

	public void setUsrLspList(List<UsrLspMessage> usrLspList) {
		this.usrLspList = usrLspList;
	}

	public String getLspId() {
		return lspId;
	}

	public void setLspId(String lspId) {
		this.lspId = lspId;
	}

	public String getLspName() {
		return lspName;
	}

	public void setLspName(String lspName) {
		this.lspName = lspName;
	}

}
