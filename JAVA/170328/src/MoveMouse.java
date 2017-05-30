import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MoveMouseEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel label;
	public MoveMouseEx(){
		setTitle("Move Mouse");
		setSize(200,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane.setLayout(null);	//움직이기 위해 수동 레이아웃을 사용한다.
		setContentPane(contentPane);	//frame의 contentPane을 JPanel의 contentpane의 속성으로 바꾼다.
		label = new JLabel("ho!");
		label.setSize(50, 20);
		label.setLocation(30, 30);
		add(label);
		addMouseListener(new MyMouse3());
		
		setVisible(true);
	}
	private class MyMouse3 implements MouseListener {
		
		@Override
		public void mouseClicked(MouseEvent e) {
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x, y);
		
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			
		}
		
	}
}

public class MoveMouse {
	public static void main(String[] args) {
		new MoveMouseEx();
	}
}
