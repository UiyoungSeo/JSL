import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest extends JPanel implements ItemListener {
	JCheckBox[] button = new JCheckBox[3];
	String[] name = { "warrior", "fighter", "wizzard" };
	JLabel[] picLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];

	public CheckBoxTest() {
		super(new GridLayout(0, 4)); // 4열의 grid layout

		// create checkbox
		for (int i = 0; i < button.length; i++) {
			button[i] = new JCheckBox(name[i]);
			button[i].addItemListener(this);
			picLabel[i] = new JLabel(name[i]);
			icon[i] = new ImageIcon(name[i] + ".png");
		}

		JPanel checkPanel = new JPanel(new GridLayout(0, 1));
		for (int i = 0; i < button.length; i++) {
			checkPanel.add(button[i]);
		}
		add(checkPanel);
		add(picLabel[0]);
		add(picLabel[1]);
		add(picLabel[2]);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		ImageIcon imageIcon = null;
		Object source = e.getItemSelectable();

		for (int i = 0; i < button.length; i++) {
			if (source == button[i]) {
				if (e.getStateChange() == ItemEvent.DESELECTED)
					picLabel[i].setIcon(null);
				else{
					picLabel[i].setIcon(icon[i]);
					picLabel[i].setText("");
				}
			}
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("select class");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		JComponent newContenPane = new CheckBoxTest();
		frame.setContentPane(newContenPane);

		frame.setVisible(true);
	}
}
