import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//event, thread start를 누르면 0.7초에 한번씩 번호를 증가시킨다.
//3일때 안누르면 fail, 3,6,9 아닐때 눌러도 fail

class Display {
	JFrame frame;
	JButton startBtn;
	Thread thread = null;
	
	public Display() {
		frame = new JFrame("Single 369 Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		startBtn = new JButton("start");
		startBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				thread.start();
			}
		});
		
		frame.add(new NumberLabel(), BorderLayout.CENTER);
		frame.add(startBtn, BorderLayout.PAGE_END);
		frame.setSize(250, 200);
		frame.setVisible(true);
	}

	class NumberLabel extends JLabel implements Runnable {
		int number;

		public NumberLabel() {
			setText(number + "");
			setOpaque(true);
			setFont(new Font("Consolas", Font.PLAIN, 70));
			setHorizontalAlignment(JLabel.CENTER);
			setBackground(Color.ORANGE);
			thread = new Thread(this);
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int clickNumber = Integer.parseInt(getText());
					
					if(clickNumber == 3|| clickNumber == 6||clickNumber == 9)
						System.out.println("yeah!");
					
				}
				
				@Override
				public void mousePressed(MouseEvent e){
					setBackground(Color.GREEN);
				}
				@Override
				public void mouseReleased(MouseEvent e){
					setBackground(Color.ORANGE);
				}
				
			});
		}

		@Override
		public void run() {
			while (true) {
				number++;
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				setText(number + "");
			}
		}
	}
}

public class Game369 {
	public static void main(String[] args) {
		new Display();
	}
}
