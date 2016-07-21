package com.hzmc.nbgsyn.pojo;

import java.util.Date;

/**
 * map_base pojo
 * 
 * @author tfche 2016年7月20日10:17:51
 */
public class MapBase {
	
	private Integer id;

	private Integer rowId;

	private Integer valueId;

	private String mdValue;

	private String sourceValue;

	private String sysCode;

	private String mapName;

	private String mdCode;

	private Date createTime;

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
	 * @return the rowId
	 */
	public Integer getRowId() {
		return rowId;
	}

	/**
	 * @param rowId
	 *            the rowId to set
	 */
	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	/**
	 * @return the valueId
	 */
	public Integer getValueId() {
		return valueId;
	}

	/**
	 * @param valueId
	 *            the valueId to set
	 */
	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}

	/**
	 * @return the mdValue
	 */
	public String getMdValue() {
		return mdValue;
	}

	/**
	 * @param mdValue
	 *            the mdValue to set
	 */
	public void setMdValue(String mdValue) {
		this.mdValue = mdValue;
	}

	/**
	 * @return the sourceValue
	 */
	public String getSourceValue() {
		return sourceValue;
	}

	/**
	 * @param sourceValue
	 *            the sourceValue to set
	 */
	public void setSourceValue(String sourceValue) {
		this.sourceValue = sourceValue;
	}

	/**
	 * @return the sysCode
	 */
	public String getSysCode() {
		return sysCode;
	}

	/**
	 * @param sysCode
	 *            the sysCode to set
	 */
	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	/**
	 * @return the mapName
	 */
	public String getMapName() {
		return mapName;
	}

	/**
	 * @param mapName
	 *            the mapName to set
	 */
	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	/**
	 * @return the mdCode
	 */
	public String getMdCode() {
		return mdCode;
	}

	/**
	 * @param mdCode
	 *            the mdCode to set
	 */
	public void setMdCode(String mdCode) {
		this.mdCode = mdCode;
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

}
