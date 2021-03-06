package com.hzmc.nbgsyn.business.dao;

import java.util.List;

import com.hzmc.nbgsyn.pojo.ServiceRegister;

/**
 * 
 * @author chentf
 *
 *         2016年7月14日
 */
public interface IServiceRegisterDao {

	/**
	 * 
	 * @param serviceRegister
	 * @return
	 */
	public Integer saveServiceRegister(ServiceRegister serviceRegister);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Boolean removeById(Integer id);

	/**
	 * 
	 * @param serviceRegister
	 * @return
	 */
	public Integer modifyServiceRegister(ServiceRegister serviceRegister);

	/**
	 * 
	 * @param serviceRegister
	 * @return
	 */
	public ServiceRegister findServiceRegisterByCondition(ServiceRegister serviceRegister);

	/**
	 * 
	 * @return
	 */
	public List<ServiceRegister> findAllServiceRegister();

	/**
	 * 
	 * @param serviceRegister
	 * @return
	 */
	public List<ServiceRegister> findServiceRegistersByCondition(ServiceRegister serviceRegister);

}
