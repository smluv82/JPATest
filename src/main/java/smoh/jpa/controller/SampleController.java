package smoh.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import smoh.jpa.domain.UserInfo;
import smoh.jpa.repository.UserInfoRepository;

@Controller
public class SampleController {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@ResponseBody
	@RequestMapping(value="/")
	String home() {
		return "Hello World";
	}

	@ResponseBody
	@RequestMapping(value="/users")
	public List<UserInfo> getUserList() {
		List<UserInfo> userInfos = userInfoRepository.findAll();

		for(UserInfo userInfo : userInfos) {
			System.out.println(userInfo.toString());
		}

		UserInfo test1 = userInfoRepository.findOne("pCertPC1");

		System.out.println(test1);

		return userInfos;
	}
}
