import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorFrameAnswer extends JFrame{
	public ColorFrameAnswer(){
		super("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
	
		JLabel[] label = new JLabel[16];
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,Color.CYAN, Color.BLUE, Color.BLUE, Color.magenta, Color.gray, Color.pink, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE, Color.RED};
		
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel(Integer.toString(i+1));
			label[i].setOpaque(true);
			label[i].setBackground(color[i]);
			c.add(label[i]);
		}
		
		setSize(500,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColorFrameAnswer();
	}
}
