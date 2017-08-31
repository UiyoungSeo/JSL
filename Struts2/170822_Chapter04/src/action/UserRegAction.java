package action;

import com.opensymphony.xwork2.ActionSupport;

public class UserRegAction extends ActionSupport {
	private String userId;
	private String userPW;
	private String userName;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String execute() throws Exception{
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		if(userId == null || "".equals(userId))
			addFieldError("userId", "ȸ�� ���̵� �Է��� �ּ���");
		if(userPW == null || "".equals(userPW))
			addFieldError("userPW", "��й�ȣ�� �Է��� �ּ���");
		if(userName == null || "".equals(userName))
			addFieldError("userName", "�̸��� �Է��� �ּ���");
	}
}
