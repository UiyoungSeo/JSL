import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		// build a snow man
		g.setColor(Color.white);
		g.drawString("Mr.SnowMan", 100, 20);
		g.fillOval(60, 30, 150, 150);
		g.fillOval(35, 150, 200, 200);
		g.setColor(Color.black);
		g.drawArc(70, 80, 50, 50, 180, -180);
		g.drawArc(150, 80, 50, 50, 180, -180);
		g.drawArc(100, 100, 70, 50, 180, 180);
	}
}

public class MyFrame extends JFrame {
	public MyFrame() {
		super("hi");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		MyPanel panel = new MyPanel(); // 객체를 만들면 자동으로 paintComponenet()메서드가 실행된다.
		add(panel);
		setBackground(Color.darkGray);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
