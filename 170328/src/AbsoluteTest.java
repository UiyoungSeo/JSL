import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		JButton b1, b2, b3;
		setTitle("hi");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		b1 = new JButton("one");
		b2 = new JButton("two");
		b3 = new JButton("three");

		panel.add(b1);
		b1.setBounds(20, 5, 95, 30);
		panel.add(b2);
		b2.setBounds(55, 45, 105, 70);
		panel.add(b3);
		b3.setBounds(180, 15, 105, 90);
		add(panel);

		setVisible(true);
	}
}

public class AbsoluteTest {
	public static void main(String[] args) {
		MyFrame2 f2 = new MyFrame2();
	}
}
