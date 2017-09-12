package action;
import com.opensymphony.xwork2.ActionSupport;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Login extends ActionSupport {
	private String userid;
	private String userpw;
	private String username = "";
	private String message = "로그인하세요";

	public static final String my_userid = "suy";
	public static final String my_userpw = "1234";
	public static final String my_username = "UiyoungSeo";

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUsername() {
		return username;
	}

	public String getMessage() {
		return message;
	}

	public static String getMyUserid() {
		return my_userid;
	}

	public static String getMyUserpw() {
		return my_userpw;
	}

	public static String getMyUsername() {
		return my_username;
	}

	private boolean isInvalid(String value) {
		return (value == null || value.length() == 0);
	}

	@Override
	public String execute() throws Exception {
		if (isInvalid(getUserid()))
			return INPUT;
		if (isInvalid(getUserpw()))
			return INPUT;
		if (userid.equals(my_userid) && userpw.equals(my_userpw)) {
			username = my_userid;
			message = "님 환영합니다.";
			return SUCCESS;
		} else {
			message = "아이디 또는 비밀번호가 잘못되었습니다.";
			return INPUT;
		}
	}
}
