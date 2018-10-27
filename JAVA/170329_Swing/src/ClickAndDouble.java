import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class DoubleClick extends JFrame {
	JPanel contentPane = new JPanel();
	JButton btn;

	public DoubleClick() {
		setTitle("click and double click");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.addMouseListener(new MyMouse());

		setVisible(true);
	}

	class MyMouse extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);

				JPanel p = (JPanel) e.getSource();
				p.setBackground(new Color(r, g, b));
			}
		}
	}
}

public class ClickAndDouble {
	public static void main(String[] args) {
		new DoubleClick();
	}
}
