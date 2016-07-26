package com.hzmc.nbgsyn.service;

import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;

/**
 * 下发服务
 * 
 * @author tfche 2016年7月25日16:45:59
 */
public interface ISendService {
	public ResultBean sendSevice(ApplyDate applyDate);
}
