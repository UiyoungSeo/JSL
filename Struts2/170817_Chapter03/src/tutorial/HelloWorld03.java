package tutorial;

public class HelloWorld03 {
	private String message;

	public String getMessage() {
		return message;
	}
	
	public String execute() throws Exception {
		this.message = "Hello World 03!";
		return "success";
	}
}
