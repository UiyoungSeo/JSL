import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class GamblingFrame {
	JFrame frame;
	JLabel[] numLabel = new JLabel[3];
	JLabel notifyLabel;
	int num = 0;

	public GamblingFrame() {
		frame = new JFrame("Gambling with Thread");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);

		Container c = frame.getContentPane();

		for (int i = 0; i < numLabel.length; i++) {
			numLabel[i] = new JLabel(num + "");
			numLabel[i].setFont(new Font("Consolas", Font.ITALIC, 50));
			numLabel[i].setBackground(Color.DARK_GRAY);
			numLabel[i].setOpaque(true);
			numLabel[i].setForeground(Color.WHITE);
			numLabel[i].setHorizontalAlignment(JLabel.CENTER);
			numLabel[i].setBounds(50 * i + 30, 20, 40, 50);
			c.add(numLabel[i], BorderLayout.CENTER);
		}

		notifyLabel = new JLabel("Click to start gamble");
		notifyLabel.setFont(new Font("Consolas", Font.PLAIN, 12));
		notifyLabel.setOpaque(true);
		notifyLabel.setBounds(30, 70, 150, 50);
		c.add(notifyLabel);

		GamblingThread thread = new GamblingThread();
		thread.start();

		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				thread.startGambling();
			}
		});

		frame.setSize(220, 150);
		frame.setVisible(true);
	}

	class GamblingThread extends Thread {
		boolean gambling = false;

		public synchronized void waitForGamebling() {
			if (!gambling)
				try {
					wait();
				} catch (InterruptedException e) {
					return;
				}
		}

		public synchronized void startGambling() {
			gambling = true;
			notify();

			notifyLabel.setText("rolling...");
			notifyLabel.setFont(new Font("Consolas", Font.ITALIC, 10));
			notifyLabel.setForeground(Color.BLACK);
			notifyLabel.setBounds(70, 70, 150, 50);
			
			for (int j = 0; j < numLabel.length; j++) {
				numLabel[j].setBackground(Color.DARK_GRAY);
			}
		}

		@Override
		public void run() {
			while (true) {
				waitForGamebling();
				int[] randomNums = new int[3];
				try {
					for (int i = 0; i < numLabel.length; i++) {
						randomNums[i] = (int) (Math.random() * 4);
						numLabel[i].setText("0");
						sleep(30);
						numLabel[i].setText("1");
						sleep(30);
						numLabel[i].setText("2");
						sleep(30);
						numLabel[i].setText("3");
						sleep(30);
						numLabel[i].setText("4");
						sleep(30);

						numLabel[i].setText(randomNums[i] + "");
						sleep(200);
					}
				} catch (InterruptedException e) {
					return;
				}

				if (randomNums[0] == randomNums[1] && randomNums[1] == randomNums[2]
						&& randomNums[0] == randomNums[2]) {
					showCongrats();
				} else if (randomNums[0] == randomNums[1]) {
					showOops(0, 1);
				} else if (randomNums[1] == randomNums[2]) {
					showOops(1, 2);
				} else if (randomNums[0] == randomNums[2]) {
					showOops(0, 2);
				} else {
					showNope();
				}

				gambling = false;
			}
		}

		public void showCongrats() {
			notifyLabel.setText("congrats!");
			notifyLabel.setFont(new Font("Consolas", Font.BOLD, 15));
			notifyLabel.setForeground(Color.RED);
			notifyLabel.setBounds(70, 70, 150, 50);
			for (int j = 0; j < numLabel.length; j++) {
				numLabel[j].setBackground(Color.ORANGE);
			}
		}

		public void showOops(int a, int b) {
			numLabel[a].setBackground(Color.GREEN);
			numLabel[b].setBackground(Color.GREEN);

			notifyLabel.setText("oops");
			notifyLabel.setFont(new Font("Consolas", Font.PLAIN, 10));
			notifyLabel.setBounds(90, 70, 150, 50);
		}
		
		public void showNope(){
			notifyLabel.setText("nope");
			notifyLabel.setFont(new Font("Consolas", Font.PLAIN, 10));
			notifyLabel.setBounds(90, 70, 150, 50);
		}
	}
}

public class Gambling {
	public static void main(String[] args) {
		new GamblingFrame();
	}
}
