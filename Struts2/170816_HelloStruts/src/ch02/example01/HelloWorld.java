package ch02.example01;

public class HelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}
	
	public String execute() throws Exception{
		this.message = "Hello World!";
		return "success";
	}
}
