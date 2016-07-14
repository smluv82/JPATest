package smoh.jpa.repository.custom.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import com.mysema.query.BooleanBuilder;
import com.mysema.query.jpa.impl.JPAQuery;

import smoh.jpa.domain.QUserInfo;
import smoh.jpa.domain.UserInfo;
import smoh.jpa.repository.custom.UserInfoRepositoryCustom;

public class UserInfoRepositoryImpl extends QueryDslRepositorySupport implements UserInfoRepositoryCustom {
	@PersistenceContext
	private EntityManager entityManager;

	public UserInfoRepositoryImpl() {
		super(UserInfo.class);
	}

	@Override
	public List<UserInfo> getUserList(UserInfo userInfo) {
		QUserInfo qUserInfo = QUserInfo.userInfo;
		JPAQuery query = new JPAQuery(entityManager);

		BooleanBuilder builder = new BooleanBuilder();
		if(userInfo.getUserId() != null) {
			builder.and(qUserInfo.userId.like("%" + userInfo.getUserId() + "%"));
		}
		if(userInfo.getUserName() != null) {
			builder.and(qUserInfo.userName.like("%" + userInfo.getUserName() + "%"));
		}
		if(userInfo.getUserType() != null) {
			builder.and(qUserInfo.userType.eq(userInfo.getUserType()));
		}
		if(userInfo.getUseYn() != null) {
			builder.and(qUserInfo.useYn.eq(userInfo.getUseYn()));
		}
		if(userInfo.getStartDate() != null && userInfo.getEndDate() != null) {
			builder.and(qUserInfo.regDate.between(userInfo.getStartDate(), userInfo.getEndDate()));
		}

//		return query.from(qUserInfo).list(qUserInfo);
//		return query.from(qUserInfo).offset(1).limit(2).list(qUserInfo);	//페이징
		int page = 1;
		int limit = 3;
		int offset = (page-1)*limit;
		List<UserInfo> userInfos =
				query.from(qUserInfo)
				.where(builder)
				.orderBy(qUserInfo.regDate.desc(), qUserInfo.userId.asc())
				.offset(offset)
				.limit(limit)
				.list(qUserInfo);

		return userInfos;
	}
}
