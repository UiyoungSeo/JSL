package tutorial;

public class TestWorld {
	private String message;

	public String getMessage() {
		return message;
	}
	
	public String execute() throws Exception{
		this.message = "Hello, execute Method!";
		return "success";
	}
	public String test() throws Exception{
		this.message = "Hello, test Method!";
		return "success";
	}
}
