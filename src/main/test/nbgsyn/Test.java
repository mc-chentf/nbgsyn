package nbgsyn;

import javax.xml.ws.Endpoint;

import com.hzmc.nbgsyn.webservice.impl.EdiEsbServiceImpl;

public class Test {
	public static void main(String[] args) {
		System.out.println("Server is starting...");
		EdiEsbServiceImpl ediEsbService = new EdiEsbServiceImpl();
		Endpoint.publish("http://localhost:8081/readerService", ediEsbService);
		System.out.println("Server is started...");
	}
}
