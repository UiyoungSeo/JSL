import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.stream.util.EventReaderDelegate;

class MyFrame1 extends JFrame {
	private JButton btn;
	private JTextField text1, text2;
	TextFi tf = new TextFi();

	public MyFrame1() {
		super("Square Calculator");
		setSize(300, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		text1 = new JTextField(15);
		text1.addActionListener(tf);
		text2 = new JTextField(15);
		text2.setEditable(false);
		
		btn = new JButton("square");
		btn.addActionListener(tf);

		panel.add(new JLabel("enter number"));
		panel.add(text1);
		panel.add(new JLabel("squared value"));
		panel.add(text2);
		panel.add(btn);
		add(panel);
		setVisible(true);
	}

	private class TextFi implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn ||e.getSource() == text1 ) {
				String a = text1.getText();
				int value = Integer.parseInt(a);
				text2.setText(value * value + "");
				text1.requestFocus();
			}
		}
	}
}

public class ButtonListener {
	public static void main(String[] args) {
		new MyFrame1();
	}
}
