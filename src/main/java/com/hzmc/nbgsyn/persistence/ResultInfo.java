package com.hzmc.nbgsyn.persistence;

import java.io.Serializable;

public class ResultInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7223769237094085272L;

	private String success;

	private String msg;

	private String pk;

	private String fk;

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

	/**
	 * @return the pk
	 */
	public String getPk() {
		return pk;
	}

	/**
	 * @param pk
	 *            the pk to set
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}

	/**
	 * @return the fk
	 */
	public String getFk() {
		return fk;
	}

	/**
	 * @param fk
	 *            the fk to set
	 */
	public void setFk(String fk) {
		this.fk = fk;
	}

}
