import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class RaceGameGUI {
	private JFrame frame;
	private JLabel[] labels = new JLabel[3];
	private ImageIcon[] images = new ImageIcon[3];
	private int x1 = 10, x2 = 10, x3 = 10;

	class RaceGameThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 120; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				x1 += (int) (Math.random() * 10);
				labels[0].setBounds(x1, 0, 100, 100);
				x2 += (int) (Math.random() * 10);
				labels[1].setBounds(x2, 70, 100, 100);
				x3 += (int) (Math.random() * 10);
				labels[2].setBounds(x3, 140, 100, 100);
			}
		}
	}

	public RaceGameGUI() {
		frame = new JFrame("Car Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		for (int i = 0; i < images.length; i++) {
			labels[i] = new JLabel();
			images[i] = new ImageIcon("player" + i + ".png");
			labels[i].setIcon(images[i]);
			labels[i].setBounds(10, 70 * i, 100, 100);
			frame.add(labels[i]);
		}

		new RaceGameThread().start();

		frame.setSize(600, 280);
		frame.setVisible(true);
	}
}

public class RaceGame {
	public static void main(String[] args) {
		new RaceGameGUI();
	}
}
