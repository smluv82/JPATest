package smoh.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import smoh.jpa.domain.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String>{

}
