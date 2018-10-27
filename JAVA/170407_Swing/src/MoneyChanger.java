import java.awt.BorderLayout;
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

class Display {
	JFrame frame;
	JTextField moneyTextField = new JTextField(10);
	JTextField[] changes = new JTextField[8];
	int moneyUnit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
	int moneyCount[] = new int[8];
	String[] moneyStrings = { "5만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };
	JCheckBox[] checks = new JCheckBox[8];
	Boolean[] isChecked = new Boolean[8];
	int x = 0;

	public Display() {
		frame = new JFrame("Money Changer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel moneyPanel = new JPanel();
		JButton btn = new JButton("계산");
		moneyPanel.add(new JLabel("금액"));
		moneyPanel.add(moneyTextField);
		moneyPanel.add(btn);

		JPanel changePanel = new JPanel(new GridLayout(0, 3));

		for (int i = 0; i < changes.length; i++) {
			isChecked[i] = true;
			changes[i] = new JTextField(5);
			checks[i] = new JCheckBox();
			checks[i].addItemListener(new MyItemListener());

			changePanel.add(new JLabel(moneyStrings[i]));
			changePanel.add(changes[i]);
			changePanel.add(checks[i]);
		}
		checks[7].setVisible(false);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btn)) {
				int money = Integer.parseInt(moneyTextField.getText());
				
				moneyCount = sortMoney(money);
				for (int i = 0; i < moneyCount.length; i++)
					changes[i].setText(moneyCount[i]+"");

//				changes[0].setText((money / 50000) + "");
//				changes[1].setText((money % 50000) / 10000 + "");
//				changes[2].setText((money % 50000) % 10000 / 1000 + "");
//				changes[3].setText((money % 50000) % 10000 % 1000 / 500 + "");
//				changes[4].setText((money % 50000) % 10000 % 1000 % 500 / 100 + "");
//				changes[5].setText((money % 50000) % 10000 % 1000 % 500 % 100 / 50 + "");
//				changes[6].setText((money % 50000) % 10000 % 1000 % 500 % 100 % 50 / 10 + "");
//				changes[7].setText((money % 50000) % 10000 % 1000 % 500 % 100 % 50 % 10 + "");
			}
			}
		});

		frame.add(moneyPanel, BorderLayout.PAGE_START);
		frame.add(changePanel, BorderLayout.CENTER);
		// frame.add(new JLabel("only checked amount will be calculated "),
		// BorderLayout.PAGE_END);
		frame.setSize(250, 300);
		frame.setVisible(true);
	}

	class MyItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			int selected = 1;

			for (int i = 0; i < changes.length; i++) {
				if (e.getItem() == checks[i] && e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println(i + " selected");
				}

				else if (e.getItem() == checks[i] && e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println(i + " deselected");
				}
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
}

public class MoneyChanger {
	public static void main(String[] args) {
		new Display();
	}
}

