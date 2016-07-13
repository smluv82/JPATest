package smoh.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import smoh.jpa.base.BaseController;
import smoh.jpa.domain.UserInfo;
import smoh.jpa.repository.UserInfoRepository;
import smoh.jpa.service.UserInfoService;

@Controller
public class UserInfoController extends BaseController {

	@ResponseBody
	@RequestMapping(value="/")
	String home() {
		return "Hello World";
	}

	@ResponseBody
	@RequestMapping(value="/users")
	public List<UserInfo> getUserList() {
		return userInfoService.getUserList();
	}

	@RequestMapping(value="/hello")
	public void helloView() {
		logger.debug("hello in");
	}
}
