package smoh.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import smoh.jpa.base.BaseService;
import smoh.jpa.domain.UserInfo;

@Service
public class UserInfoService extends BaseService {
	public List<UserInfo> getUserList() {
		List<UserInfo> userInfos = userInfoRepository.findAll();

		for(UserInfo userInfo : userInfos) {
			logger.debug(userInfo.toString());
		}

//		UserInfo test1 = userInfoRepository.findOne("pCertPC1");
//
//		logger.debug(test1);

		return userInfos;
	}
}
