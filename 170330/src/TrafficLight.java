import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel2 extends JPanel implements ActionListener {
	private int lightNumber = 0;

	public MyPanel2() {
		setLayout(new BorderLayout());
		JButton button = new JButton("change Traffic Light");
		button.addActionListener(this);
		add(button, BorderLayout.PAGE_END);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (++lightNumber >= 3)
			lightNumber = 0;
		repaint(); // paintComponent() 메서드를 호출한다.
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // if문을 나갔을때 다시 그릴 수 있게 해준다. 이게 없으면 전의 신호등색이 남아있다.
		g.setColor(Color.BLACK);
		g.drawOval(50, 100, 100, 100);
		g.drawOval(50, 200, 100, 100);
		g.drawOval(50, 300, 100, 100);

		if (lightNumber == 0) {
			g.setColor(Color.RED);
			g.fillOval(50, 100, 100, 100);
		} else if (lightNumber == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(50, 200, 100, 100);
		} else {
			g.setColor(Color.YELLOW);
			g.fillOval(50, 300, 100, 100);
		}
	}
}

public class TrafficLight extends JFrame {
	public TrafficLight() {
		super("Traffic Light");
		setSize(200, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel2());
		setVisible(true);
	}

	public static void main(String[] args) {
		new TrafficLight();
	}
}
