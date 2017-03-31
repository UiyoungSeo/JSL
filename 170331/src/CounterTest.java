import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter extends JFrame implements ActionListener {
	private JLabel label1, label2;
	private JButton btnUp, btnDown, btnInitialize, btnExit;
	private int count = 0;

	public MyCounter() {
		super("Up and Down");
		setSize(400, 200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		label1 = new JLabel("Counter");
		label2 = new JLabel("" + count);
		btnUp = new JButton("▲");
		btnDown = new JButton("▼");
		btnInitialize = new JButton("Initialize");
		btnExit = new JButton("Exit");

		label2.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 50));

		btnUp.addActionListener(this); // because event of ActionListner is in this class
		btnDown.addActionListener(this);
		btnInitialize.addActionListener(this);
		btnExit.addActionListener(this);

		panel.add(label1);
		panel.add(label2);
		panel.add(btnUp);
		panel.add(btnDown);
		panel.add(btnInitialize);
		panel.add(btnExit);

		add(panel);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnUp) {
			count++;
		} else if (e.getSource() == btnDown) {
			count--;
		} else if (e.getSource() == btnInitialize) {
			count = 0;
		} else if (e.getSource() == btnExit) {
			System.exit(1);
		}
		label2.setText(count + "");
		System.out.println(e.getActionCommand());
	}
}

public class CounterTest extends JFrame {
	public static void main(String[] args) {
		new MyCounter();
	}
}
