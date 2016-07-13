package com.hzmc.nbgsyn.persistence;

import java.io.Serializable;

import net.sf.json.JSONArray;

/**
 * bean of applyDate
 * 
 * @author tfche 2016年6月29日16:32:32
 */
public class ApplyDate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8587581076502496701L;

	/**
	 * 
	 */

	// 动作 register 和 transt
	private String action;
	// 模块
	private String model;
	// 类型 R U D C
	private String type;
	// 验证用户名
	private String username;
	// 密码
	private String password;
	// Data model的entity名称
	private String entity;
	// 数据块
	private JSONArray data;

	// 用于查找
	// 从第几条开始查找
	private Integer page;
	// 查找记录数
	private Integer pagesize;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public JSONArray getData() {
		return data;
	}

	public void setData(JSONArray data) {
		this.data = data;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

}
