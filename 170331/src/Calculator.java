import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	JTextField textField;
	JButton[] btn;
	String[] btnString = { "1", "2", "3", "*", "4", "5", "6", "/", "7", "8", "9", "+", "C", "0", "=", "-" };

	public Calculator() {
		super("Calculator");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(4, 4, 10, 10));

		textField = new JTextField();

		btn = new JButton[16];

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(btnString[i]);
			btn[i].addActionListener(this);
			btnPanel.add(btn[i]);
		}

		add(textField, BorderLayout.PAGE_START);
		add(btnPanel, BorderLayout.CENTER);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int x = 0, y = 10, temp, result = 0;
		String sign;

		for (int i = 0; i < btn.length; i++) {
			if (e.getSource() == btn[i]) {
				x = Integer.parseInt(btnString[i]);
				System.out.println(x);
			}
		}

		if (e.getSource() == btn[3]) {
			result = x * y;
		} else if (e.getSource() == btn[7]) {
			result = x / y;
		} else if (e.getSource() == btn[11]) {
			result = x + y;
		} else if (e.getSource() == btn[12]) {
			result = 0;
		} else if (e.getSource() == btn[15]) {
			result = x - y;
		}

		textField.setText(result + "");
		// textField.setText(e.getActionCommand());
		// System.out.println(result);
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
