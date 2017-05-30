import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel4 extends JPanel {
	BufferedImage img = null;
	int x = 100, y = 100;

	public MyPanel4() {
		try {
			img = ImageIO.read(new File("link2.png"));
		} catch (IOException e) {
			System.out.println("there's no image");
			System.exit(1);
		}
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP:
					y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					y += 10;
					break;
				case KeyEvent.VK_LEFT:
					x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					x += 10;
					break;

				default:
					break;
				}
				repaint();

			}
		});
		requestFocus();
		setFocusable(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(img, x, y, null);
	}
}

public class MovePlayer extends JFrame {
	public MovePlayer() {
		super("move zelda");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new MyPanel4());
		setVisible(true);
	}

	public static void main(String[] args) {
		new MovePlayer();
	}
}
