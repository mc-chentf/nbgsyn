package com.hzmc.nbgsyn.persistence;

import java.io.Serializable;

/**
 * 用户的bean
 * 
 * @author tfche
 *
 */
public class UserInfoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2115115551742580408L;
	// primary key
	private String MD_CODE;
	// primary key
	private String SYS_CODE;
	// primary key
	private String ENTITY_CODE;
	private String SERVICE_NAME;
	private String TO_NODE;
	private String username;
	private String password;

	public String getMD_CODE() {
		return MD_CODE;
	}

	public void setMD_CODE(String mD_CODE) {
		MD_CODE = mD_CODE;
	}

	public String getSYS_CODE() {
		return SYS_CODE;
	}

	public void setSYS_CODE(String sYS_CODE) {
		SYS_CODE = sYS_CODE;
	}

	public String getENTITY_CODE() {
		return ENTITY_CODE;
	}

	public void setENTITY_CODE(String eNTITY_CODE) {
		ENTITY_CODE = eNTITY_CODE;
	}

	public String getSERVICE_NAME() {
		return SERVICE_NAME;
	}

	public void setSERVICE_NAME(String sERVICE_NAME) {
		SERVICE_NAME = sERVICE_NAME;
	}

	public String getTO_NODE() {
		return TO_NODE;
	}

	public void setTO_NODE(String tO_NODE) {
		TO_NODE = tO_NODE;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
