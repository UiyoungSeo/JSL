import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class CountDownGUI {
	private JFrame frame;
	private JLabel label;

	class CountDownThread extends Thread { // inner class
		@Override
		public void run() {
			for (int i = 10; i > 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i + "");
			}
		}
	}

	public CountDownGUI() {
		frame = new JFrame("CountDown");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel("start");
		label.setFont(new Font("Consolas", Font.BOLD, 100));
		frame.add(label);

		(new CountDownThread()).start();

		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}

public class CountDown {
	public static void main(String[] args) {
		new CountDownGUI();
	}
}
