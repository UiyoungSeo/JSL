import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ClickPracticeFrame extends JFrame {
	public ClickPracticeFrame() {
		super("Click Practice App");
		setSize(500, 500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("rat");
		label.setLocation(100, 100);
		label.setSize(50, 20);
		label.addMouseListener(new MouseAdapter() { // anonymous class
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel) e.getSource();
				Container c = la.getParent();
				int xBound = c.getWidth() - la.getWidth();
				int yBound = c.getHeight() - la.getHeight();

				int x = (int) (Math.random() * xBound);
				int y = (int) (Math.random() * yBound);
				la.setLocation(x, y);
			}
		});

		add(label);
		setVisible(true);
	}
}

public class ClickPractice {
	public static void main(String[] args) {
		new ClickPracticeFrame();
	}
}
