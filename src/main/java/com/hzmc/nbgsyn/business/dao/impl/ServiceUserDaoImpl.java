package com.hzmc.nbgsyn.business.dao.impl;

import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IServiceUserDao;
import com.hzmc.nbgsyn.pojo.ServiceUser;

@Service
public class ServiceUserDaoImpl extends BaseDao implements IServiceUserDao {

	@Override
	public ServiceUser findServiceUserByCondition(ServiceUser serviceUser) {
		// TODO Auto-generated method stub
		return (ServiceUser) this.getSqlMapClientTemplate().queryForObject("findServiceUserByCondition", serviceUser);
	}

}
