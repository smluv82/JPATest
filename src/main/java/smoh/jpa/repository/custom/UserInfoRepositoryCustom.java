package smoh.jpa.repository.custom;

import java.util.List;

import smoh.jpa.domain.UserInfo;

public interface UserInfoRepositoryCustom {
	List<UserInfo> getUserList(UserInfo userInfo);
}
