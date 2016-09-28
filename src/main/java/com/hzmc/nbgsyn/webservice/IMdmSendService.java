package com.hzmc.nbgsyn.webservice;

public interface IMdmSendService {

	public String sendDataDownGet(String startDate, String endDate);

	public String sendDataDownPost(String startDate, String endDate);
	
	public String findSendDateCountPost(String startDate, String endDate);
	
	public String findSendDateCountGet(String startDate, String endDate);
	
	
}
