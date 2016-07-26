package com.hzmc.nbgsyn.persistence;

import java.io.Serializable;
import java.util.HashMap;

public class ResultInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7223769237094085272L;
	
	private String success;
	
	private String msg;
	
	private HashMap<String, Object> reqInfo = new HashMap<String, Object>();

	public ResultInfo() {
		// TODO Auto-generated constructor stub
	}

	public ResultInfo(String success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the reqInfo
	 */
	public HashMap<String, Object> getReqInfo() {
		return reqInfo;
	}

	/**
	 * @param reqInfo
	 *            the reqInfo to set
	 */
	public void setReqInfo(HashMap<String, Object> reqInfo) {
		this.reqInfo = reqInfo;
	}

}
