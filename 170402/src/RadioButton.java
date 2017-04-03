import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

class MyFrame extends JFrame implements ActionListener {
	private JRadioButton tall, grande, venti;
	private JLabel resultLabel;
	private JPanel topPanel, sizePanel, resultPanel;

	public MyFrame() {
		super("Radio Button Test");
		setSize(300, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		topPanel = new JPanel();
		JLabel label = new JLabel("what size of coffe would you like to order?");
		topPanel.add(label);
		
		sizePanel = new JPanel();
		tall = new JRadioButton("tall");
		grande = new JRadioButton("grande");
		venti = new JRadioButton("venti");
		
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(tall);
		sizeGroup.add(grande);
		sizeGroup.add(venti);
		
		tall.addActionListener(this);
		grande.addActionListener(this);
		venti.addActionListener(this);
		
		sizePanel.add(tall);
		sizePanel.add(grande);
		sizePanel.add(venti);
		
		Border border = BorderFactory.createTitledBorder("size");
		sizePanel.setBorder(border);
		
		resultPanel = new JPanel();
		resultLabel = new JLabel("select coffee size");
		resultLabel.setForeground(Color.RED);
		resultPanel.add(resultLabel);
		add(resultPanel, BorderLayout.PAGE_END);
		
		add(topPanel, BorderLayout.PAGE_START);
		add(sizePanel, BorderLayout.CENTER);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		if(e.getSource() == tall)
			resultLabel.setText("tall");
		if(e.getSource() == grande)
			resultLabel.setText("grande");
		if(e.getSource() == venti)
			resultLabel.setText("venti");
	}
}

public class RadioButton extends JFrame {
	public static void main(String[] args) {
		new MyFrame();
	}
}
