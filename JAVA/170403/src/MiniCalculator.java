import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame2 extends JFrame {
	private JButton plusBtn, minusBtn, multiplyBtn, divideBtn;
	private JTextField numText1, numText2, resultText;
	TextFi tf = new TextFi();

	public MyFrame2() {
		super("mini calc");
		setSize(200, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));

		numText1 = new JTextField(3);
		numText1.addActionListener(tf);
		numText2 = new JTextField(3);

		JPanel numPanel = new JPanel();
		numPanel.add(new JLabel("num1"));
		numPanel.add(numText1);
		numPanel.add(new JLabel("num2"));
		numPanel.add(numText2);
		panel.add(numPanel);

		plusBtn = new JButton("+");
		minusBtn = new JButton("-");
		multiplyBtn = new JButton("*");
		divideBtn = new JButton("/");
		plusBtn.addActionListener(tf);
		minusBtn.addActionListener(tf);
		multiplyBtn.addActionListener(tf);
		divideBtn.addActionListener(tf);

		JPanel btnPanel = new JPanel();
		btnPanel.add(plusBtn);
		btnPanel.add(minusBtn);
		btnPanel.add(multiplyBtn);
		btnPanel.add(divideBtn);
		panel.add(btnPanel);

		resultText = new JTextField(10);
		resultText.setEditable(false);
		JPanel resultPanel = new JPanel();
		resultPanel.add(new JLabel("result"));
		resultPanel.add(resultText);
		panel.add(resultPanel);

		add(panel);
		setVisible(true);
	}

	private class TextFi implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());

			try {
				int result = 0;
				String x = numText1.getText();
				String y = numText2.getText();

				switch (e.getActionCommand()) {
				case "+":
					result = Integer.parseInt(x) + Integer.parseInt(y);
					break;

				case "-":
					result = Integer.parseInt(x) - Integer.parseInt(y);
					break;

				case "*":
					result = Integer.parseInt(x) * Integer.parseInt(y);
					break;

				case "/":
					result = Integer.parseInt(x) / Integer.parseInt(y);
					break;
				}
				resultText.setText(result + "");
				numText1.requestFocus();
			} catch (NumberFormatException e2) {
				System.out.println("숫자를 입력해주세요");
			}
		}
	}
}

public class MiniCalculator {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
