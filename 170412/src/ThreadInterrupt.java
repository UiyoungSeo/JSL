import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	JLabel timerLabel;

	public TimerRunnable(JLabel _timerLabel) {
		timerLabel = _timerLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				return; // 예외가 발생하면 thread 종료
			}
		}
	}
}

public class ThreadInterrupt extends JFrame {
	Thread thread;

	public ThreadInterrupt() {
		setTitle("Interrupt Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// JLabel which shows timer value
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Consolas", Font.ITALIC, 80));
		c.add(timerLabel);

		// Runnable object for Timer Thread, 타이머 값을 출력할 레이블 컴포넌트를 생성자에 전달
		TimerRunnable timerRunnable = new TimerRunnable(timerLabel);
		thread = new Thread(timerRunnable);

		// JButton
		JButton button = new JButton("Kill Timer");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				thread.interrupt(); // Timer thread 강제종료
				JButton button = (JButton) e.getSource();
				button.setEnabled(false);
			}
		});

		c.add(button);
		thread.start();

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ThreadInterrupt();
	}
}
