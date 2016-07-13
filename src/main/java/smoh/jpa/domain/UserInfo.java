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

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userPass=" + userPass + ", deptCode=" + deptCode + "]";
	}
}
