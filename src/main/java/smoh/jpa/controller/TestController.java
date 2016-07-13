package smoh.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/test")
	String body() {
		System.out.println("testdsfsdfsdfsdf");
		return "test/test";
	}
}
