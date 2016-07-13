package smoh.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import smoh.jpa.domain.UserInfo;
import smoh.jpa.repository.custom.UserInfoRepositoryCustom;

public interface UserInfoRepository extends JpaRepository<UserInfo, String>, JpaSpecificationExecutor<UserInfo>, UserInfoRepositoryCustom {
	UserInfo findByUserNoAndUserName(String userNo, String userName);
}
