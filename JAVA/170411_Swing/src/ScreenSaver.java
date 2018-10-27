import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false;
	// thread 종료를 명령으로 표시하며, true면 작업 종료

	public RandomThread(Container _contentPane) {
		contentPane = _contentPane;
	}

	public void finish() {
		flag = true;
	}

	@Override
	public void run() {
		while (true) {
			int x = (int) ((Math.random() * contentPane.getWidth()));
			int y = (int) ((Math.random() * contentPane.getHeight()));
			int temp = (int) (Math.random() * 3);
			String[] strings = { "★", "♣", "♪" };

			JLabel label = new JLabel(strings[temp]);

			label.setForeground(
					new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
			label.setFont(new Font("Gulim", temp, (int) (Math.random() * 50 + 5)));
			label.setBounds(x, y, 80, 80);
			contentPane.add(label);
			contentPane.repaint();

			try {
				Thread.sleep(500);
				if (flag) {
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setBounds(contentPane.getWidth() / 2, contentPane.getHeight() / 2, 80, 30);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
					return; // thread 종료
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class FinishFlagGUI {
	JFrame frame;
	RandomThread thread;

	public FinishFlagGUI() {
		frame = new JFrame("Screen Saver");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = frame.getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				thread.finish();
			}

		});
		thread = new RandomThread(c);
		thread.start();

		frame.setSize(800, 700);
		frame.setVisible(true);
	}
}

public class ScreenSaver {
	public static void main(String[] args) {
		new FinishFlagGUI();
	}
}
