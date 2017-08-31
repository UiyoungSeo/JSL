package tutorial;

public class HelloWorld05 {
	private String message;

	public String getMessage() {
		return message;
	}
	
	public String execute() throws Exception {
		this.message = "Hello World 05!";
		return "success";
	}
}
