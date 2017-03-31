import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	private BufferedImage image = null;
	private int x = 0, y = 0;

	public MyPanel() {
		try {
			image = ImageIO.read(new File("link2.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("there's no image");
			System.exit(1);
		}

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				System.out.println(x+","+y);
				
				repaint();
			}
		});
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, x, y, null);
	}
}

public class MovePlayerByMouse extends JFrame {
	public MovePlayerByMouse() {
		super("Car Game");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new MyPanel());

		setVisible(true);
	}

	public static void main(String[] args) {
		new MovePlayerByMouse();
	}
}
