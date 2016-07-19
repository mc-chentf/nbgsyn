package nbgsyn;

import javax.xml.ws.Endpoint;

import com.hzmc.nbgsyn.webservice.impl.MdmOutServiceImpl;


public class Test {
	public static void main(String[] args) {
		System.out.println("Server is starting...");
		MdmOutServiceImpl ediEsbService = new MdmOutServiceImpl();
		Endpoint.publish("http://localhost:8081/EDIESBService", ediEsbService);
		System.out.println("Server is started...");
	}
	
}
