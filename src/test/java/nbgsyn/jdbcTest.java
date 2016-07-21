package nbgsyn;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzmc.nbgsyn.business.dao.IServiceRegisterDao;
import com.hzmc.nbgsyn.pojo.ServiceRegister;

public class jdbcTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		IServiceRegisterDao registerDaoImpl = (IServiceRegisterDao) applicationContext.getBean("serviceRegisterDaoImpl");

		for (int i = 0; i < 5; i++) {
			ServiceRegister serviceRegister = new ServiceRegister();
			serviceRegister.setEntityCode("entity");
			serviceRegister.setMdCode("1000");
			Date d = new Date();
			serviceRegister.setModifyTime(d);
			serviceRegister.setRegisterTime(d);
			serviceRegister.setPassword("1");
			serviceRegister.setUsername("chentf");
			serviceRegister.setSysCode("syscode" + i);
			serviceRegister.setServiceName("esbid");
			serviceRegister.setToNode("haha");
//			registerDaoImpl.saveServiceRegister(serviceRegister);
		}

		// ServiceRegister temp = registerDaoImpl.findServiceRegisterByCondition(serviceRegister);
		// System.out.println(temp);
//		 registerDaoImpl.removeById(4);
		List list = registerDaoImpl.findAllServiceRegister();
		System.out.println(list);
	}

}
