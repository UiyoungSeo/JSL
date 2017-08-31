package tutorial;

public class DefaultAction {
	private String message;

	public String getMessage() {
		return message;
	}
	
	public String execute() throws Exception{
		this.message = "Hello, default Action!";
		return "success";
	}
}
