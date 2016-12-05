package com.ai.yc.translator.api.translatorservice.param;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * 为了兼容我们的系统和译云的系统定制类
 * BaseResponse为原有框架继承类
 * attribute:
 * result = success/fail
 * message = 返回消息
 * data = 数据对象
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月1日 下午8:09:53 
 * @version 
 * @since  
 */
public class HBBaseResponse<T extends Object> extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2667718641012023747L;

	private String result;
	private String message;
	private T data;
	private String exceptionMessage;
	
	public HBBaseResponse(boolean result,String message,T data){
		if(result){
			setResult(APIConstants.RESULTSUCCESS);
		} else{
			setResult(APIConstants.RESULTFAIL);
		}
		setMessage(message);
		setData(data);
	}
	public HBBaseResponse(boolean result,String message,String e){
		if(result){
			setResult(APIConstants.RESULTSUCCESS);
		} else{
			setResult(APIConstants.RESULTFAIL);
		}
		setMessage(message);
		setExceptionMessage(e);
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
		if(result.equals(APIConstants.RESULTSUCCESS)){
			this.getResponseHeader().setIsSuccess(true);
			this.getResponseHeader().setResultCode(APIConstants.SUCCESS);
		}else{
			this.getResponseHeader().setIsSuccess(false);
			this.getResponseHeader().setResultCode(APIConstants.FAILD);
		}
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		this.getResponseHeader().setResultMessage(message);
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
}
