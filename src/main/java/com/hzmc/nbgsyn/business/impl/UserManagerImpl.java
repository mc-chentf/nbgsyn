package com.hzmc.nbgsyn.business.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hzmc.nbgsyn.business.IServiceRegisterDao;
import com.hzmc.nbgsyn.business.IUserManager;
import com.hzmc.nbgsyn.exception.UserInfoException;
import com.hzmc.nbgsyn.persistence.ServiceRegister;
import com.hzmc.nbgsyn.persistence.UserInfoBean;
import com.hzmc.nbgsyn.resource.UserProperties;

/**
 * 
 * @author tfche 2016年7月19日11:16:35
 */
@Service
@Transactional
public class UserManagerImpl implements IUserManager {

	@SuppressWarnings("unused")
	private Logger log = Logger.getLogger(UserManagerImpl.class);

	@Autowired
	private IServiceRegisterDao serviceRegisterDao;

	@Override
	public Boolean validateUser(String userName, String userPassword) {
		Boolean res = false;
		// 验证用户 未完成 在缓存中验证 这个是接口认证用户 和其他不同
		// 模拟通过
		String pUserName = UserProperties.getInstacne().getProperty("username").trim();
		String pPwd = UserProperties.getInstacne().getProperty("pwd").trim();

		if (StringUtils.equals(pUserName, userName) && StringUtils.equals(userPassword, pPwd)) {
			res = true;
		}
		return res;
	}

	/**
	 * 查找用户信息
	 * 
	 * @param userInfoBean
	 * @return
	 */
	public List<UserInfoBean> findAllUserInfo() {
		List<ServiceRegister> serviceRegisters = serviceRegisterDao.findAllServiceRegister();
		List<UserInfoBean> userInfoBeans = new ArrayList<UserInfoBean>();
		if (serviceRegisters == null || serviceRegisters.size() == 0)
			return userInfoBeans;
		for (ServiceRegister serviceRegister : serviceRegisters) {
			serviceRegister.setPassword("******");
			userInfoBeans.add(this.convertServiceRegisterToUserInfoBean(serviceRegister));
		}
		return userInfoBeans;
	}

	@Override
	public Integer saveRegisterUserInfo(UserInfoBean userInfoBean) throws UserInfoException {
		// 把userinfo 转换为serviceRegister
		ServiceRegister serviceRegister = this.convertUserInfoBeanToServiceRegister(userInfoBean);
		// 是否已注册
		if (serviceRegisterDao.findServiceRegisterByCondition(serviceRegister) != null) {
			throw new UserInfoException("SYS_CODE:" + serviceRegister.getSysCode() + ",SERVICE_NAME:" + serviceRegister.getServiceName() + ",TO_NODE:"
					+ serviceRegister.getToNode() + ",ENTITY_CODE:" + serviceRegister.getEntityCode() + " 已注册！");
		}
		// 添加用户
		Integer id = serviceRegisterDao.saveServiceRegister(serviceRegister);
		return id;
	}

	@Override
	public void removeUserInfo(UserInfoBean userInfoBean) throws UserInfoException {
		ServiceRegister serviceRegister = this.convertUserInfoBeanToServiceRegister(userInfoBean);
		ServiceRegister temp = serviceRegisterDao.findServiceRegisterByCondition(serviceRegister);
		if (temp == null) {
			throw new UserInfoException("SYS_CODE:" + serviceRegister.getSysCode() + ",SERVICE_NAME:" + serviceRegister.getServiceName() + ",TO_NODE:"
					+ serviceRegister.getToNode() + ",ENTITY_CODE:" + serviceRegister.getEntityCode() + " 不存在！");
		} else {
			serviceRegisterDao.removeById(temp.getId());
		}
	}

	/**
	 * 查找用户信息
	 * 
	 * @param userInfoBean
	 * @return
	 */
	@SuppressWarnings("unused")
	private UserInfoBean findUserInfo(UserInfoBean userInfoBean) {
		// 查找用户
		ServiceRegister serviceRegister = this.convertUserInfoBeanToServiceRegister(userInfoBean);
		ServiceRegister temp = serviceRegisterDao.findServiceRegisterByCondition(serviceRegister);
		return convertServiceRegisterToUserInfoBean(temp);
	}

	@Override
	public void modifyUserInfo(UserInfoBean userInfoBean) throws UserInfoException {
		ServiceRegister serviceRegister = this.convertUserInfoBeanToServiceRegister(userInfoBean);
		ServiceRegister temp = serviceRegisterDao.findServiceRegisterByCondition(serviceRegister);
		// 更新
		// 是否已注册
		if (temp == null) {
			throw new UserInfoException("SYS_CODE:" + serviceRegister.getSysCode() + ",SERVICE_NAME" + serviceRegister.getServiceName() + ",TO_NODE"
					+ serviceRegister.getToNode() + ",ENTITY_CODE:" + serviceRegister.getEntityCode() + " 不存在！");
		} else {
			serviceRegisterDao.modifyServiceRegister(serviceRegister);
		}
	}

	private ServiceRegister convertUserInfoBeanToServiceRegister(UserInfoBean userInfoBean) {
		// TODO Auto-generated method stub
		if (userInfoBean == null)
			return null;
		Date now = new Date();
		ServiceRegister serviceRegister = new ServiceRegister();
		serviceRegister.setMdCode(userInfoBean.getMD_CODE());
		serviceRegister.setEntityCode(userInfoBean.getENTITY_CODE());
		serviceRegister.setModifyTime(now);
		serviceRegister.setPassword(userInfoBean.getPassword());
		serviceRegister.setUsername(userInfoBean.getUsername());
		serviceRegister.setToNode(userInfoBean.getTO_NODE());
		serviceRegister.setRegisterTime(now);
		serviceRegister.setSysCode(userInfoBean.getSYS_CODE());
		serviceRegister.setServiceName(userInfoBean.getSERVICE_NAME());
		return serviceRegister;
	}

	private UserInfoBean convertServiceRegisterToUserInfoBean(ServiceRegister serviceRegister) {
		if (serviceRegister == null)
			return null;
		UserInfoBean userInfoBean = new UserInfoBean();
		userInfoBean.setMD_CODE(serviceRegister.getMdCode());
		userInfoBean.setENTITY_CODE(serviceRegister.getEntityCode());
		userInfoBean.setPassword(serviceRegister.getPassword());
		userInfoBean.setUsername(serviceRegister.getUsername());
		userInfoBean.setTO_NODE(serviceRegister.getToNode());
		userInfoBean.setSYS_CODE(serviceRegister.getSysCode());
		userInfoBean.setSERVICE_NAME(serviceRegister.getServiceName());
		return userInfoBean;
	}
}
