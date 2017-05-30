import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame4 extends JFrame {
	private JButton btn1, btn2;
	private JPanel panel;
	MyListener2 m2 = new MyListener2();
	
	public MyFrame4() {
		setTitle("Action Event");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		btn1 = new JButton("yellow");
		btn2 = new JButton("random");
		btn1.setBackground(Color.YELLOW);

		btn1.addActionListener(m2);
		btn2.addActionListener(m2);
		
		panel.add(btn1);
		panel.add(btn2);
		add(panel);
		setVisible(true);
	}
	
	//btn1, btn2 panel을 쓰기 위해 클래스 안에 내부 클래스 MyListener2를 만들었다. 
	private class MyListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn1)
				panel.setBackground(Color.YELLOW);
			else if(e.getSource() == btn2)
				panel.setBackground(new Color((int)(Math.random() * 255) + 1,(int) (Math.random() * 255) + 1,(int) (Math.random() * 255) + 1));
		}
	}
}

public class ActionEvent1 {
	public static void main(String[] args) {
		new MyFrame4();
	}
}
