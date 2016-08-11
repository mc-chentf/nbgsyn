package com.hzmc.nbgsyn.persistence;

import java.io.Serializable;

public class ResultInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7223769237094085272L;

	private String success;

	private String msg;

	public ResultInfo() {
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

}
