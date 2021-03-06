package com.hzmc.nbgsyn.business.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IServiceRegisterDao;
import com.hzmc.nbgsyn.pojo.ServiceRegister;

/**
 * 
 * @author chentf
 *
 *         2016年7月14日
 */
@Service
public class ServiceRegisterDaoImpl extends BaseDao implements IServiceRegisterDao {

	@Override
	public Integer saveServiceRegister(ServiceRegister serviceRegister) {
		return (Integer) this.getSqlMapClientTemplate().insert("insertServiceRegister", serviceRegister);
	}

	@Override
	public Boolean removeById(Integer id) {
		return this.getSqlMapClientTemplate().delete("deleteServiceRegister", id) > 0 ? true : false;
	}

	@Override
	public Integer modifyServiceRegister(ServiceRegister serviceRegister) {
		return this.getSqlMapClientTemplate().update("updateServiceRegister", serviceRegister);
	}

	@Override
	public ServiceRegister findServiceRegisterByCondition(ServiceRegister serviceRegister) {
		return (ServiceRegister) this.getSqlMapClientTemplate().queryForObject("findServiceRegisterByCondition", serviceRegister);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceRegister> findAllServiceRegister() {
		return (List<ServiceRegister>) this.getSqlMapClientTemplate().queryForList("findAllServiceRegister");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceRegister> findServiceRegistersByCondition(ServiceRegister serviceRegister) {
		return (List<ServiceRegister>) this.getSqlMapClientTemplate().queryForList("findServiceRegistersByCondition",serviceRegister);
	}

}
