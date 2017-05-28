import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseWheelFrame extends JFrame {
	public MouseWheelFrame() {
		super("Font Size by Mouse Wheel");
		setLayout(new FlowLayout());
		setSize(300,150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Consolas", Font.PLAIN, 10));

		label.addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if (n < 0) {
					JLabel la = (JLabel) e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					
					if (f.getSize() <= 5)
						return;
					la.setFont(new Font("Consolas", Font.PLAIN, size - 5));
				}
				else {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					
					la.setFont(new Font("TimesRoman", Font.PLAIN, size+5));
				}
			}
		});
		add(label);
		setVisible(true);
	}
}

public class MouseWheelPractice {
	public static void main(String[] args) {
		new MouseWheelFrame();
	}
}
