package com.hzmc.nbgsyn.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author tfche
 *
 */
public class ServiceUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5594884122880293570L;

	private Integer id;

	private String userName;

	private String passWord;

	private String userNameDesc;

	private String type;

	private Date createTime;

	private String activeFlag;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * @param passWord
	 *            the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * @return the userNameDesc
	 */
	public String getUserNameDesc() {
		return userNameDesc;
	}

	/**
	 * @param userNameDesc
	 *            the userNameDesc to set
	 */
	public void setUserNameDesc(String userNameDesc) {
		this.userNameDesc = userNameDesc;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the activeFlag
	 */
	public String getActiveFlag() {
		return activeFlag;
	}

	/**
	 * @param activeFlag
	 *            the activeFlag to set
	 */
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

}
