import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamblingGame extends JFrame {
	JLabel resultLabel;
	JLabel[] num = new JLabel[3];
	JPanel numPanel = new JPanel();

	public GamblingGame() {
		super("Gambling Game");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		for (int i = 0; i < num.length; i++) {
			num[i] = new JLabel("0");
			num[i].setFont(new Font("Consolas", Font.ITALIC, 40));
			num[i].setForeground(Color.WHITE);
			num[i].setBackground(Color.DARK_GRAY);
			num[i].setOpaque(true);
			numPanel.add(num[i]);
		}

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int a = (int) (Math.random() * 5);
				int b = (int) (Math.random() * 5);
				int c = (int) (Math.random() * 5);

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					num[0].setText(a + "");
					num[1].setText(b + "");
					num[2].setText(c + "");

					if (a == b && b == c && a == c)
						resultLabel.setText("congrats");
					else
						resultLabel.setText("nope");
				}
			}
		});
		
		resultLabel = new JLabel("start");
		resultLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		add(numPanel, BorderLayout.CENTER);
		add(resultLabel, BorderLayout.PAGE_END);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GamblingGame();
	}
}
