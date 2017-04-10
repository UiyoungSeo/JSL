class MyRunnable implements Runnable {
	String myName;

	public MyRunnable(String _myName) {
		myName = _myName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(myName+":"+i+" ");
		}
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable("A"));
		Thread t2 = new Thread(new MyRunnable("B"));
		t1.start();	//thread 호출
		t2.start();	
	}
}
