class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}
}

public class RunnableTest {
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();	
		System.out.println("yo");
	}
}

//스레드를 상속받으면 new MyThread.start() 처럼 실행할수 있지만
//runnable 인터페이스를 구현할때는 thread 객체를 만들고 매개변수로 그 클래스 이름을 넣어서 사용해야 한다.