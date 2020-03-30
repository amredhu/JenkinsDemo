package DemoPro.DemoJenkins.ServiceImpl;

import org.springframework.stereotype.Component;

import DemoPro.DemoJenkins.Service.HomeService;

@Component
public class HomeServiceImpl implements HomeService {
	
	public String HelloWorld() {
		return "Hello World!!";
	}
	
	public String getJenkin() {
		return "Hello Jenkins";
	}

}
