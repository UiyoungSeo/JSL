import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageTurnOver2 extends JFrame {
	Container contentPane;
	JLabel imageLabel;
	ImageIcon[] images = new ImageIcon[4];
	int currentNum;
	MenuPanel mp = new MenuPanel();

	public ImageTurnOver2() {
		setTitle("Image Turn Over");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		for (int i = 0; i < images.length; i++) {
			images[i] = new ImageIcon("player" + i + ".png");
		}

		currentNum = 0;
		imageLabel = new JLabel(images[currentNum]);
		contentPane.add(imageLabel, BorderLayout.CENTER);
		add(new MenuPanel(), BorderLayout.PAGE_END);
		setSize(150, 200);
		setVisible(true);
	}

	class MenuPanel extends JPanel {
		public MenuPanel() {
			JButton prevBtn = new JButton("<");
			JButton nextBtn = new JButton(">");

			prevBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					currentNum--;
					currentNum += images.length;
					currentNum %= images.length;
					imageLabel.setIcon(images[currentNum]);
				}
			});

			nextBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					currentNum++;
					currentNum %= images.length;
					imageLabel.setIcon(images[currentNum]);
				}
			});
			add(prevBtn);
			add(nextBtn);
		}
	}

	public static void main(String[] args) {
		new ImageTurnOver2();
	}
}
