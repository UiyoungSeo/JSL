import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LottoGenerator extends JFrame implements ActionListener {
	private JLabel lblTitle, lblBonus, lblPlus;
	private JLabel[] label;
	private JButton btnGenerate;
	private int[] number;

	public LottoGenerator() {
		super("Lucky Lotto Generator");
		setSize(480, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		label = new JLabel[7];
		number = new int[7];

		lblTitle = new JLabel("당첨번호");
		lblTitle.setSize(100, 100);
		lblTitle.setLocation(50, -10);
		panel.add(lblTitle);

		lblBonus = new JLabel("보너스");
		lblBonus.setSize(100, 100);
		lblBonus.setLocation(410, -10);
		panel.add(lblBonus);

		lblPlus = new JLabel("+");
		lblPlus.setSize(100, 100);
		lblPlus.setFont(new Font("Consolas", Font.PLAIN, 30));
		lblPlus.setLocation(386, 20);
		panel.add(lblPlus);

		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel("" + number[i]);
			label[i].setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 30));
			label[i].setSize(100, 100);
			label[i].setLocation(50 + 60 * i, 20);
			panel.add(label[i]);
		}

		btnGenerate = new JButton("generate");
		btnGenerate.setSize(250, 50);
		btnGenerate.setLocation(80, 150);
		btnGenerate.addActionListener(this);

		panel.add(btnGenerate);
		add(panel);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());

		for (int i = 0; i < label.length; i++) {
			number[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					i--;
					break;
				}
			}
			label[i].setText(number[i] + "");
		}

	}

	public static void main(String[] args) {
		new LottoGenerator();
	}
}
