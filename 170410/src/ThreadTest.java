class MyThread extends Thread {
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.print(i + " ");
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		// myThread.run(); 	//run()함수 호출. run()이 끝나야 다음줄이 실행된다.
		myThread.start(); 	// thread를 호출. 프로세스를 생성하여 처리하는 동시에 다음줄을 실행한다.
		System.out.println("a");
	}
}
