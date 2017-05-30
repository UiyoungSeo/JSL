import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyChanger2 extends JFrame {
	int moneyUnit[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
	int moneyCount[] = new int[9];
	boolean isChecked[] = new boolean[9];
	String[] moneyStrings = { "오만원", "만원", "오천원", "천원", "500원", "100원", "50원", "10원", "1원" };
	JTextField moneyTextField;
	JTextField[] changes = new JTextField[9];
	JCheckBox[] checkBoxes = new JCheckBox[9];
	JButton btn;

	public MoneyChanger2() {
		setTitle("Money Changer with checkbox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("금액"));
		moneyTextField = new JTextField(10);
		inputPanel.add(moneyTextField);
		btn = new JButton("계산");
		btn.addActionListener(new BtnListener());
		inputPanel.add(btn);

		JPanel changePanel = new JPanel(new GridLayout(0, 3));

		for (int i = 0; i < 9; i++) {
			isChecked[i] = true;
			moneyCount[i] = 0;
			changes[i] = new JTextField(5);
			checkBoxes[i] = new JCheckBox();
			checkBoxes[i].addItemListener(new CheckBoxListener());

			changePanel.add(new JLabel(moneyStrings[i]));
			changePanel.add(changes[i]);
			changePanel.add(checkBoxes[i]);
		}

		add(inputPanel, BorderLayout.PAGE_START);
		add(changePanel, BorderLayout.CENTER);
		setSize(250, 300);
		setVisible(true);
	}

	class CheckBoxListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			for (int i = 0; i < checkBoxes.length; i++)
				if (e.getSource().equals(checkBoxes[i]))
					if (e.getStateChange() == ItemEvent.SELECTED)
						isChecked[i] = true;
					else
						isChecked[i] = false;
		}
	}

	class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(btn)) {
				String moneyString = moneyTextField.getText();
				int money = Integer.parseInt(moneyString);
				moneyCount = sortMoney(money);
				for (int i = 0; i < moneyCount.length; i++)
					changes[i].setText(moneyCount[i] + "");
			}
		}
	}

	public int[] sortMoney(int money) {
		for (int i = 0; i < moneyUnit.length; i++)
			if (isChecked[i]) {
				moneyCount[i] = money / moneyUnit[i];
				money = money % moneyUnit[i];
			}
		return moneyCount;
	}

	public static void main(String[] args) {
		new MoneyChanger2();
	}
}