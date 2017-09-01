package action;

import com.opensymphony.xwork2.ActionSupport;

public class UserRegAction extends ActionSupport {
	private String userId;
	private String userPW;
	private String userName;
	private String message;

	//setter
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String execute() throws Exception {
		message = userId + "님 정보가 성공적으로 등록되었습니다.";
		return SUCCESS;
	}
}
