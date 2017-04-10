import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CounterGUI {
	private JFrame frame;
	private JTextField countField;
	private JButton start, pause, reset;
	private boolean stop = false;
	private int count = 0;

	public CounterGUI() {
		frame = new JFrame("Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel countPanel = new JPanel();
		countPanel.add(new JLabel("Counter"));
		countField = new JTextField(5);
		countField.setText(count + "");
		countField.setEditable(false);
		countPanel.add(countField);

		JPanel btnPanel = new JPanel();
		start = new JButton("start");
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stop = false;

				Thread thread = new Thread() {
					public void run() {
						for (int i = 0; i <= 100000; i++) {
							if (stop)
								break;

							try {
								sleep(10);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}

							countField.setText(count + "");
							count++;
						}
					}
				};
				thread.start();
			}
		});

		pause = new JButton("pause");
		pause.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stop = true;
			}
		});

		reset = new JButton("reset");
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				countField.setText(count + "");
			}
		});

		btnPanel.add(start);
		btnPanel.add(pause);
		btnPanel.add(reset);

		frame.add(countPanel, BorderLayout.PAGE_START);
		frame.add(btnPanel, BorderLayout.CENTER);
		frame.setSize(250, 110);
		frame.setVisible(true);
	}
}

public class Counter {
	public static void main(String[] args) {
		new CounterGUI();
	}
}
