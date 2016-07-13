package com.hzmc.nbgsyn.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * webservice
 * 
 * @author tfchen 2016年6月28日15:55:51
 *
 */
@WebService
public interface IEdiEsbService {

	/**
	 * 
	 * @param fromNode
	 *            调用方
	 * @param toNode
	 *            调用目标方
	 * @param esbID
	 *            调用的服务ID，详见esbID定义
	 * @param applyData
	 *            请求的数据项定义，详见具体接口定义
	 * @param userID
	 *            用户ID，EDI统一管理
	 * @param password
	 *            用户密码，EDI统一管理
	 * @return
	 */
	public String outService(@WebParam(name = "applyData") String applyData);

	
	public String registerService(@WebParam(name = "applyData") String applyData);
	
}
