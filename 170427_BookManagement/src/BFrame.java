import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class BFrame extends JFrame {
	public BFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dim2 = this.getSize();
		int x, y;
		x = (int) (dim.getWidth() / 2 - dim2.getWidth());
		y = (int) (dim.getHeight() / 2 - dim2.getHeight());
		setLocation(x, y);

		setVisible(true);
	}
}
