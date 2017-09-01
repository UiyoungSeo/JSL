package action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
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
	
	//getter
	public String getUserId() {
		return userId;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String execute() throws Exception {
		if (message == null)
			message = "";
		else
			message = message;

		message += userId + "로 로그인하셨습니다.";
		return SUCCESS;
	}
}
