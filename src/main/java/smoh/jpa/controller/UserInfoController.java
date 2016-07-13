package smoh.jpa.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import smoh.jpa.base.BaseController;
import smoh.jpa.domain.UserInfo;

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

	@ResponseBody
	@RequestMapping(value="/users/querydsl")
	public List<UserInfo> getUserListQueryDsl() {
		UserInfo userInfoParam = new UserInfo();

		return userInfoService.getUserListQueryDsl(userInfoParam);
	}

	@ResponseBody
	@RequestMapping(value="/user/select")
	public UserInfo getUserOneSelect() {
		UserInfo userInfoParam = new UserInfo();
		userInfoParam.setUserNo("10000002");
		userInfoParam.setUserName("smoh");

		return userInfoService.getUserOneSelect(userInfoParam);
	}

	@RequestMapping(value="/hello")
	public void helloView() {
		logger.debug("hello in");
	}
}
