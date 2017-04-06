import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Display {
	private JFrame frame;
	private JButton prevBtn, nextBtn;
	private ImageIcon[] imageIcons = new ImageIcon[4];
	private int currentNum = 0;

	public Display() {
		frame = new JFrame("Image Turn Over");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel imagePanel = new JPanel();
		for (int i = 0; i < imageIcons.length; i++) {
			imageIcons[i] = new ImageIcon("player" + i + ".png");
		}
		JLabel imageLabel = new JLabel();
		imageLabel.setIcon(imageIcons[currentNum]);
		imagePanel.add(imageLabel);

		JPanel btnPanel = new JPanel();
		prevBtn = new JButton("<");
		nextBtn = new JButton(">");

		prevBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentNum--;
				currentNum += imageIcons.length;
				currentNum %= imageIcons.length;
				System.out.println(currentNum);
				imageLabel.setIcon(imageIcons[currentNum]);
			}
		});

		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentNum++;
				currentNum %= imageIcons.length;
				System.out.println(currentNum);
				imageLabel.setIcon(imageIcons[currentNum]);
			}
		});

		btnPanel.add(prevBtn);
		btnPanel.add(nextBtn);
		frame.add(imagePanel, BorderLayout.CENTER);
		frame.add(btnPanel, BorderLayout.PAGE_END);

		frame.setSize(250, 200);
		frame.setVisible(true);
	}
}

public class ImageTurnOver {
	public static void main(String[] args) {
		new Display();
	}
}
