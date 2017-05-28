import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable {
	public FlickeringLabel(String text) {
		setText(text);
		setOpaque(true); // 배경색 변경이 가능하도록 설정

		// create thread object
		Thread thread = new Thread(this);

		// run thread
		thread.start();
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			if (n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.RED);

			// m을 0과 1로 번갈아 변경
			if (n == 0)
				n = 1;
			else
				n = 0;

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class FlickeringEx {
	JFrame frame;

	public FlickeringEx() {
		frame = new JFrame("Flickering");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = frame.getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("not Flickering");
		FlickeringLabel fLabel1 = new FlickeringLabel("Flickering");
		FlickeringLabel fLabel2 = new FlickeringLabel("Flickering Also");

		c.add(fLabel1);
		c.add(label);
		c.add(fLabel2);

		frame.setSize(300, 500);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FlickeringEx();
	}

}
