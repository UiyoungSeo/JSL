class Counter {
	private int value = 0;

	public synchronized void increment() {
		value++;
	}

	public synchronized void decrement() {
		value--;
	}

	public synchronized void printValue() {
		System.out.println(value);
	}
}

class MyThread extends Thread {
	Counter sharedCounter;

	public MyThread(Counter c) {
		sharedCounter = c;
	}

	@Override
	public void run() {
		int i = 0;
		while (i < 20000) {
			sharedCounter.increment();
			sharedCounter.decrement();

			if (i % 40 == 0)
				sharedCounter.printValue();

			try {
				sleep((int) (Math.random() * 2));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}

public class CounterTest2 {
	public static void main(String[] args) {
		Counter c = new Counter();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
	}
}
