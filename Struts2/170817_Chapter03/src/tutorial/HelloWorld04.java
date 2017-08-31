package tutorial;

public class HelloWorld04 {
	private String message;

	public String getMessage() {
		return message;
	}
	
	public String execute() throws Exception {
		this.message = "Hello World 04!";
		return "success";
	}
}
