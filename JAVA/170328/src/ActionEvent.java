import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyListener implements ActionListener{
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("yikes!");
	}
}

class MyFrame3 extends JFrame {
	private JButton button;
	
	public MyFrame3() {
		setTitle("Event Program");
		setSize(300, 200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("press button");
		button.addActionListener(new MyListener());	//버튼에 액션리스너를 add함. 
		
		add(button);
		setVisible(true);
	}
}

public class ActionEvent {
	public static void main(String[] args) {
		MyFrame3 myFrame3 = new MyFrame3();
	}
}
