import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorFrame extends JFrame {
	public ColorFrame() {
		super("4x4 Color Frame");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 4));

		JPanel[] panel = new JPanel[16];
		JLabel[] lbl = new JLabel[16];

		for (int i = 0; i < panel.length; i++) {
			panel[i] = new JPanel();
			panel[i].setLayout(new BorderLayout());
			lbl[i] = new JLabel(Integer.toString(i + 1));
			panel[i].add(lbl[i], BorderLayout.LINE_START);

			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);

			panel[i].setBackground(new Color(r, g, b));
			add(panel[i]);
		}

		setVisible(true);
	}

	public static void main(String[] args) {
		new ColorFrame();
	}
}
