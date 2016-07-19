package com.hzmc.nbgsyn.enums;
/**
 * 
 * @author chentf
 *
 * 2016年7月12日
 */
public enum MsgEnum {
	SUCCESS("000", "成功"), 
	USER_PWD_ERROR("200", "用户名密码错误"), 
	FORMART_ERROR("201", "数据格式错误"), 
	USER_REGISTER_ERROR("202","用户注册错误"), 
	USER_DELETE_ERROR("203","用户删除错误"), 
	USER_UPDATE_ERROR("204","用户更新错误"), 
	PARAM_ERROR("101","参数错误"), 
	PART_SUCCESS("001","部分成功"),
	FAIL("999","失败"), 
	ACTION_NO_EXIST("205","action不存在"), 
	READDAT_FAIL("206", "读取错误异常，请检查"), 
	ENTITYKEY_NOTFOUND("207","无法在配置文件找到entity的主键"), 
	METHOD_NO_EXIST("208","方法不存在");

	private String msgId;
	private String msgDesc;

	private MsgEnum(String msgId, String msgDesc) {
		// TODO Auto-generated constructor stub
		this.msgId = msgId;
		this.msgDesc = msgDesc;
	}

	public String getMsgId() {
		return msgId;
	}

	public String getMsgDesc() {
		return msgDesc;
	}

}
