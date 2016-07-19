package com.hzmc.nbgsyn.business;

import java.util.List;

import com.hzmc.nbgsyn.exception.UserInfoException;
import com.hzmc.nbgsyn.persistence.UserInfoBean;

/**
 * 用来管理服务注册接口总线的一些服务
 * 
 * @author tfchen 2016年6月29日16:57:35
 */
public interface IUserManager {
	/**
	 * 验证用户
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public Boolean validateUser(String username, String userPassword);

	/**
	 * 获取所有注册信息
	 * 
	 * @return
	 */
	public List<UserInfoBean> findAllUserInfo();

	/**
	 * 保存注册用户
	 * 
	 * @param userInfoBean
	 * @exception 用户自定义异常
	 */
	public Integer saveRegisterUserInfo(UserInfoBean userInfoBean) throws UserInfoException;

	/**
	 * 删除用户
	 * 
	 * @param userInfoBean
	 * @throws UserInfoException
	 */
	public void removeUserInfo(UserInfoBean userInfoBean) throws UserInfoException;

	/**
	 * 更新用户
	 * 
	 * @param userInfoBean
	 */
	public void modifyUserInfo(UserInfoBean userInfoBean) throws UserInfoException;
}
