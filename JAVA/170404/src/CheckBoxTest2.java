import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxTest2 extends JFrame{
	JButton btn = new JButton("button");

	public CheckBoxTest2() {
		super("button disable and disapear");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		JCheckBox box1 = new JCheckBox("disable button");
		JCheckBox box2 = new JCheckBox("disapear button");
		add(box1);
		add(box2);
		add(btn);
		
		box1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		
		box2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxTest2();
	}
}