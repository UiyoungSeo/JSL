import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	private JTextField textField;
	private JButton[] btnNumber = new JButton[16];
	private String[] btnString = { "7", "8", "9", "÷", "4", "5", "6", "×", "1", "2", "3", "-", "C", "0", "=", "+" };
	private String tempValue = "", xValue = "", yValue = "";
	private String operator;
	private int result;
	private boolean isFirstProcess = true;

	public Calculator() {
		// GUI
		super("Calculator");
		setSize(300, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel numPanel = new JPanel();
		numPanel.setBackground(Color.DARK_GRAY);
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Consolas", Font.ITALIC, 55));
		textField.setHorizontalAlignment(JTextField.RIGHT); // 오른쪽 정렬
		textField.setBackground(Color.DARK_GRAY);
		textField.setOpaque(true);
		textField.setForeground(Color.white);
		numPanel.setLayout(new GridLayout(4, 4, 3, 3));

		for (int i = 0; i < btnNumber.length; i++) {
			btnNumber[i] = new JButton(btnString[i]);
			btnNumber[i].setFont(new Font("Consolas", Font.BOLD, 25));
			btnNumber[i].setBackground(Color.DARK_GRAY);
			btnNumber[i].setForeground(Color.white);
			btnNumber[i].addActionListener(this);
			numPanel.add(btnNumber[i]);
		}

		btnNumber[3].setBackground(Color.GRAY);
		btnNumber[7].setBackground(Color.GRAY);
		btnNumber[11].setBackground(Color.GRAY);
		btnNumber[12].setBackground(Color.GRAY);
		btnNumber[14].setBackground(Color.GRAY);
		btnNumber[15].setBackground(Color.GRAY);

		add(textField, BorderLayout.PAGE_START);
		add(numPanel, BorderLayout.CENTER);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		case "C": // clear 버튼: x값, y값, temp값, operator, boolean값을 초기화 시킨다.
			xValue = "";
			yValue = "";
			tempValue = "";
			operator = null;
			isFirstProcess = true;
			textField.setText(xValue);
			break;

		case "+":
			operator = "+";
			display();
			break;

		case "-":
			operator = "-";
			display();
			break;

		case "÷":
			operator = "÷";
			display();
			break;

		case "×":
			operator = "×";
			display();
			break;

		// = 버튼을 누르면 temp값을 y값에 담고 연산자에 맞는 계산을 한다. 계산 후 x값에 결과값을 담아 다음 계산을 이어 할수있도록 한다.
		case "=":
			if (xValue == null || xValue == "" || tempValue == "" || operator == null)
				return;

			yValue = tempValue;
			tempValue = "";
			viewLog();

			if (operator == "+")
				result = Integer.parseInt(xValue) + Integer.parseInt(yValue);
			if (operator == "-")
				result = Integer.parseInt(xValue) - Integer.parseInt(yValue);
			if (operator == "×")
				result = Integer.parseInt(xValue) * Integer.parseInt(yValue);
			if (operator == "÷")
				result = Integer.parseInt(xValue) / Integer.parseInt(yValue);

			System.out.println("result: " + xValue + operator + yValue + "=" + result);
			xValue = Integer.toString(result);
			textField.setText(xValue);

			// 계산 후에 y값, 연산자 초기화, 첫번째 계산인가 확인하는 boolean값 false로 변경
			yValue = "";
			operator = null;
			isFirstProcess = false;
			break;

		// 숫자버튼 : 숫자버튼을 누르면 그 값이 temp값에 더해지고 textField에 표시된다.
		default:
			tempValue += e.getActionCommand();
			// 한번 계산 후에 숫자버튼을 누르면 새로운 계산을 시작할 수 있게 초기화시킨다.
			if (!isFirstProcess && operator == null) {
				xValue = tempValue;
				yValue = "";
				operator = null;
				isFirstProcess = true;
				textField.setText(tempValue);
				break;
			}
			// 한번 계산 후에 연산버튼을 누르면 이어서 계산을 한다.
			if (isFirstProcess && operator == null) {
				textField.setText(tempValue);
			} else {
				textField.setText(xValue + operator + tempValue);
			}
		}
		viewLog();
	}

	private void viewLog() {
		System.out.println("tempValue:" + tempValue + ", xValue:" + xValue + ", yValue:" + yValue + ", operator:"
				+ operator + ", isFirstProcess:" + isFirstProcess);
	}

	private void display() {
		// 첫번째 계산일 때는 temp값을 x에 담는다.
		if (isFirstProcess)
			xValue = tempValue;

		textField.setText(xValue + operator);
		tempValue = "";
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
