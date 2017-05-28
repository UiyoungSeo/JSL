public class ThreadMain {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();

		Thread.State state = Thread.currentThread().getState();

		System.out.println("Name of Current Thread :" + name);
		System.out.println("ID of Current Thread:" + id);
		System.out.println("Priority of Current Thread:" + priority);
		System.out.println("State of Current Thread:" + state);
		
	}
}
