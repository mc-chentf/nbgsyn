package com.hzmc.nbgsyn.pojo;

import java.util.List;

/**
 * map_entity_view pojo
 * 
 * @author tfche 用于保存 view的一些 信息包含 viewName view中的一个字段 主键 view是否包含localcode view中localcode的一级名称 view中localcode的二级名称 view中localcode的对应字段
 */
public class EntityView {

	// view 名字
	private String entityName;

	// view中包含的key
	private String entityKey;

	// 是否含LocalCode
	private String hasLocalCode;

	// 映射表一级
	private String mdCode;

	// 映射表二级
	private String mapName;

	// 映射表字段
	private String mappingCloumn;

	private String isRalate;

	private String entityFk;

	private String foreignEntityName;

	private String foreignEntityKey;

	// 用于查找的参数
	private List<String> mdValues;

	/**
	 * @return the entityName
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * @param entityName
	 *            the entityName to set
	 */
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	/**
	 * @return the entityKey
	 */
	public String getEntityKey() {
		return entityKey;
	}

	/**
	 * @param entityKey
	 *            the entityKey to set
	 */
	public void setEntityKey(String entityKey) {
		this.entityKey = entityKey;
	}

	/**
	 * @return the hasLocalCode
	 */
	public String getHasLocalCode() {
		return hasLocalCode;
	}

	/**
	 * @param hasLocalCode
	 *            the hasLocalCode to set
	 */
	public void setHasLocalCode(String hasLocalCode) {
		this.hasLocalCode = hasLocalCode;
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
	 * @return the mappingCloumn
	 */
	public String getMappingCloumn() {
		return mappingCloumn;
	}

	/**
	 * @param mappingCloumn
	 *            the mappingCloumn to set
	 */
	public void setMappingCloumn(String mappingCloumn) {
		this.mappingCloumn = mappingCloumn;
	}

	/**
	 * @return the mdValues
	 */
	public List<String> getMdValues() {
		return mdValues;
	}

	/**
	 * @param mdValues
	 *            the mdValues to set
	 */
	public void setMdValues(List<String> mdValues) {
		this.mdValues = mdValues;
	}

	/**
	 * @return the isRalate
	 */
	public String getIsRalate() {
		return isRalate;
	}

	/**
	 * @param isRalate
	 *            the isRalate to set
	 */
	public void setIsRalate(String isRalate) {
		this.isRalate = isRalate;
	}

	/**
	 * @return the entityFk
	 */
	public String getEntityFk() {
		return entityFk;
	}

	/**
	 * @param entityFk
	 *            the entityFk to set
	 */
	public void setEntityFk(String entityFk) {
		this.entityFk = entityFk;
	}

	/**
	 * @return the foreignEntityName
	 */
	public String getForeignEntityName() {
		return foreignEntityName;
	}

	/**
	 * @param foreignEntityName
	 *            the foreignEntityName to set
	 */
	public void setForeignEntityName(String foreignEntityName) {
		this.foreignEntityName = foreignEntityName;
	}

	/**
	 * @return the foreignEntityKey
	 */
	public String getForeignEntityKey() {
		return foreignEntityKey;
	}

	/**
	 * @param foreignEntityKey
	 *            the foreignEntityKey to set
	 */
	public void setForeignEntityKey(String foreignEntityKey) {
		this.foreignEntityKey = foreignEntityKey;
	}

}
