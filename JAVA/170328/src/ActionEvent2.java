import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame5 extends JFrame {
	private JButton btn;
	private JLabel label;
	
	public MyFrame5() {
		setTitle("Event");
		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		btn = new JButton("press this button");
		label = new JLabel("???");
		
		btn.addActionListener(new MyListener5());
		panel.add(btn);
		panel.add(label);
		add(panel);
		setVisible(true);
	}
	
	private class MyListener5 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("pressed");
		}
	}
}

public class ActionEvent2 {
	public static void main(String[] args) {
		new MyFrame5();
	}
}
