package tutorial;

public class HelloWorld01 {
	private String message;

	public String getMessage() {
		return message;
	}
	
	public String execute() throws Exception {
		this.message = "Hello World 01!";
		return "success";
	}
}
