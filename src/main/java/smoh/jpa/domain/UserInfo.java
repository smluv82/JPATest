package smoh.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_INFO")
public class UserInfo {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID", nullable=false)
	private String userId;

	@Column(name="USER_PASS", nullable=false)
	private String userPass;

	@Column(name="DEPT_CODE")
	private String deptCode;

	@Column(name="DEPT_NAME")
	private String deptName;

	@Column(name="USER_NO")
	private String userNo;

	@Column(name="USER_NAME")
	private String userName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userPass=" + userPass + ", deptCode=" + deptCode + ", deptName="
				+ deptName + ", userNo=" + userNo + ", userName=" + userName + "]";
	}

}