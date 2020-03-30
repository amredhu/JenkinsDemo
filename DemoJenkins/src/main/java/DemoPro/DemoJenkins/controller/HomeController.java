package DemoPro.DemoJenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DemoPro.DemoJenkins.Service.HomeService;
import DemoPro.DemoJenkins.ServiceImpl.HomeServiceImpl;

@RestController
//@Api(value="jenkins")
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@Autowired
	HomeServiceImpl homeServiceImpl;
	
	@RequestMapping("/helloJenkins")
	public String Hello() {
		return homeService.HelloWorld();
	}
	
	@RequestMapping("/testJenkins")
	public String Jenkin() {
		return homeService.getJenkin();
	}
}
