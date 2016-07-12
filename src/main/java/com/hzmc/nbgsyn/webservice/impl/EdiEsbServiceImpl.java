package com.hzmc.nbgsyn.webservice.impl;

import javax.jws.WebService;

import com.hzmc.nbgsyn.test.TalendWs;
import com.hzmc.nbgsyn.webservice.IEdiEsbService;

/**
 * webservice
 * 
 * @author tfchen 2016年6月28日15:55:51
 *
 */
@WebService(serviceName = "EdiEsbService", endpointInterface = "com.hzmc.nbgsyn.webservice.IEdiEsbService")
public class EdiEsbServiceImpl implements IEdiEsbService {

	@Override
	public String callEDIESBPub(String fromNode, String toNode, String esbID, String applyData, String userID,
			String password) {
		// TODO Auto-generated method stub
		System.out.println("now in webservice");
		TalendWs.method1();
		return "Hello World";
	}

}
