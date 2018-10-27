import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MouseEx extends JFrame {
	JButton btn;
	MyMouseListener ml = new MyMouseListener();

	public MouseEx() {
		btn = new JButton("Mouse Event");

		setTitle("Mouse Event");
		setSize(200, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		btn.setBackground(Color.RED);
		btn.addMouseListener(ml);

		add(btn);
		setVisible(true);
	}

	private class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
		}

		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {
		}

		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {
		}

		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {
			btn.setBackground(Color.BLUE);
		}

		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			btn.setBackground(Color.RED);
		}
	}
}

public class MouseEvent {
	public static void main(String[] args) {
		new MouseEx();
	}
}
