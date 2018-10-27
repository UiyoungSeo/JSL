import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEvent extends JFrame {
	private Container contentPane;
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] name = { "apple", "pear", "cherry" };
	private JLabel sumLabel;
	private int sum = 0;

	public CheckBoxItemEvent() {
		super("checkbox event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(200, 150);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JLabel("apple:$3, pear:$2, cherry:$4"));

		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(name[i]);
			fruits[i].setBorderPainted(true);
			contentPane.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		sumLabel = new JLabel("select fruits");
		contentPane.add(sumLabel);

		setVisible(true);
	}

	class MyItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			int selected = 1;
			// 선택 상태인지 판별
			if (e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else
				selected = -1;

			// 어느 체크박스인지를 판별
			if (e.getItem() == fruits[0])
				sum += 3 * selected;
			if (e.getItem() == fruits[1])
				sum += 2 * selected;
			if (e.getItem() == fruits[2])
				sum += 4 * selected;

			sumLabel.setText("price: $" + sum);
		}
	}

	public static void main(String[] args) {
		new CheckBoxItemEvent();
	}
}
