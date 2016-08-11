package com.hzmc.nbgsyn.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author chentf 2016年8月2日10:20:13
 */
public class IncMdDataList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2479709577329805654L;

	public IncMdDataList() {
	}

	private Integer id;

	private String tableName;

	private String pkValue;

	private String createTime;

	private Date sendTime;

	private String sendFlag;

	private String sendSessionId;

	private String type;

	private Date modifyTime;

	private String xfrom;

	private String sendThread;

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
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * @param tableName
	 *            the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * @return the pkValue
	 */
	public String getPkValue() {
		return pkValue;
	}

	/**
	 * @param pkValue
	 *            the pkValue to set
	 */
	public void setPkValue(String pkValue) {
		this.pkValue = pkValue;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the sendTime
	 */
	public Date getSendTime() {
		return sendTime;
	}

	/**
	 * @param sendTime
	 *            the sendTime to set
	 */
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	/**
	 * @return the sendFlag
	 */
	public String getSendFlag() {
		return sendFlag;
	}

	/**
	 * @param sendFlag
	 *            the sendFlag to set
	 */
	public void setSendFlag(String sendFlag) {
		this.sendFlag = sendFlag;
	}

	/**
	 * @return the sendSessionId
	 */
	public String getSendSessionId() {
		return sendSessionId;
	}

	/**
	 * @param sendSessionId
	 *            the sendSessionId to set
	 */
	public void setSendSessionId(String sendSessionId) {
		this.sendSessionId = sendSessionId;
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
	 * @return the modifyTime
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * @param modifyTime
	 *            the modifyTime to set
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * @return the xfrom
	 */
	public String getXfrom() {
		return xfrom;
	}

	/**
	 * @param xfrom
	 *            the xfrom to set
	 */
	public void setXfrom(String xfrom) {
		this.xfrom = xfrom;
	}

	/**
	 * @return the sendThread
	 */
	public String getSendThread() {
		return sendThread;
	}

	/**
	 * @param sendThread
	 *            the sendThread to set
	 */
	public void setSendThread(String sendThread) {
		this.sendThread = sendThread;
	}

}
