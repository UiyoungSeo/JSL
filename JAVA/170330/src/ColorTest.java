import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel1 extends JPanel implements ActionListener {
	JButton btn;
	Color color = new Color(0, 0, 0);

	public MyPanel1() {
		setLayout(new BorderLayout());
		btn = new JButton("change color");
		btn.addActionListener(this); // 이 클래스에 ActionListener가 있으므로 this, 밑의 actionPerformed에서 처리함
		add(btn, BorderLayout.PAGE_END);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
	}

	@Override
	public void paintComponent(Graphics g) { // JPanel에서 오버라이딩. JPanel이 만들어질떄 paintComponent가 자동으로 실행된다
		g.setColor(color);
		g.fillRect(10, 10, 210, 220);
		repaint(); // paintComponent() 메서드를 다시 호출하여 그린다. 이게 없으면 버튼을 눌러도 색이 바뀌지 않는다.
	}
}

public class ColorTest extends JFrame {
	public ColorTest() {
		super("Color Test");
		setSize(240, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new MyPanel1();
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ColorTest();
	}
}
