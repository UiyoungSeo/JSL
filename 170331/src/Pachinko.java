import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.midi.ControllerEventListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pachinko extends JFrame implements ActionListener {
	private JLabel[] label;
	private JButton btnSpin, btnExit;
	private int[] number;

	public Pachinko() {
		super("Lucky Pachinko");
		setSize(400, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		label = new JLabel[3];
		number = new int[3];

		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel("" + number[i]);
			label[i].setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 100));
			label[i].setSize(100, 100);
			label[i].setLocation(70 + 100 * i, 20);
			panel.add(label[i]);
		}

		btnSpin = new JButton("spin");
		btnSpin.setSize(250, 50);
		btnSpin.setLocation(70, 150);
		btnSpin.addActionListener(this);

		panel.add(btnSpin);
		add(panel);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		for (int i = 0; i < label.length; i++) {
			number[i] = (int) (Math.random() * 9 + 1);
			label[i].setText(number[i] + "");
		}
	}

	public static void main(String[] args) {
		new Pachinko();
	}
}
