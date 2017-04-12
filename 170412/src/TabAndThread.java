import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.function.Consumer;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel {
	int barSize = 0;
	int maxBarSize;

	public MyLabel(int _maxBarSize) {
		maxBarSize = _maxBarSize;
	}

	public synchronized void fill() {
		if (barSize == maxBarSize) {
			try {
				wait(100);
				// bar의 크기가 최대이면 ConsumerThread에 의해 bar의 크기가 줄어들 때 까지 기다린다.
			} catch (InterruptedException e) {
				return;
			}
		}
		barSize++;
		repaint(); // paintComponent가 다시 실행된다. paintComponent()로 가서 바를 다시 그린다.
		notify(); // 기다리는 ConsumerThread를 깨운다.
	}

	public synchronized void consume() {
		if (barSize == 0) {
			try {
				wait(); // barSize가 0이면 bar의 크기가 0보다 커질 때 까지 대기한다.
			} catch (InterruptedException e) {
				return;
			}
		}

		barSize--;
		repaint();
		notify(); // 기다리고있는 이벤트 스레드를 깨운다.
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int) ((double) (this.getWidth()) / maxBarSize * barSize);

		if (width == 0)
			return;

		g.fillRect(0, 0, width, this.getHeight());
	}
}

class ConsumerThread extends Thread {
	MyLabel bar;

	public ConsumerThread(MyLabel _bar) {
		bar = _bar;
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep(200);	// 0.2 sec
				bar.consume();
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class TabAndThread extends JFrame {
	MyLabel bar = new MyLabel(100);

	public TabAndThread(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setBounds(20, 50, 300, 20);
		c.add(bar);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill();
			}
		});
		
		setSize(350, 200);
		setVisible(true);
		
		c.requestFocus();	//contentPane에 키 처리권 부여
		ConsumerThread thread = new ConsumerThread(bar);
		thread.start();
	}

	public static void main(String[] args) {
		new TabAndThread("Tab and Thread Example");
	}
}
