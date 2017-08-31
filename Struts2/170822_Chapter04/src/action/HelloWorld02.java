package action;

import com.opensymphony.xwork2.Action;

public class HelloWorld02 implements Action {
	private String message;
	private String name = "suy";

	public String getMessage() {
		return message;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String execute() throws Exception {
		this.message = "Hello, " + name + "!";
		return SUCCESS;
	}
}
