package tutorial;

public class HelloWorld02 {
	private String message;

	public String getMessage() {
		return message;
	}
	
	public String execute() throws Exception {
		this.message = "Hello World 02!";
		return "success";
	}
}
