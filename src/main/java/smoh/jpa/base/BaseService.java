package smoh.jpa.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import smoh.jpa.constants.CommonConstants;
import smoh.jpa.repository.UserInfoRepository;

public class BaseService {
	protected static Logger logger = LoggerFactory.getLogger(CommonConstants.LOG_JPA);

	@Autowired
	protected UserInfoRepository userInfoRepository;
}
