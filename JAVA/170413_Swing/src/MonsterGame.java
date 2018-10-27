import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MonsterGame extends JFrame {
	// 아바타는 @, 몬스터는 M, 종료키는q, 몬스는 200ms 주기로 움직인다.
	JPanel gamePanel = new GamePanel("@", "M", 'q', 200);

	public MonsterGame() {
		setTitle("Monster Following Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(gamePanel); // gamePanel을 contentPane으로 사용한다.

		setSize(400, 300);
		setVisible(true);
		gamePanel.requestFocus();
	}

	// inner class
	class GamePanel extends JPanel {
		String avatarChar;
		String monsterChar;
		char quitChar;
		long monsterDelay;

		JLabel avatar;
		JLabel monster, monster1;
		final int AVATAR_MOVE = 10; // avatar가 한번에 움직이는 픽셀 수

		public GamePanel(String _avatarChar, String _monsterChar, char _quitChar, int _monsterDelay) {
			avatarChar = _avatarChar;
			monsterChar = _monsterChar;
			quitChar = _quitChar;
			monsterDelay = _monsterDelay;

			avatar = new JLabel(avatarChar);
			monster = new JLabel(monsterChar);

			setLayout(null);
			addKeyListener(new MyKeyListener());

			avatar.setLocation(50, 50);
			avatar.setSize(15, 15);
			avatar.setForeground(Color.DARK_GRAY);
			add(avatar);

			monster.setLocation(200, 5);
			monster.setSize(15, 15);
			monster.setForeground(Color.RED);
			add(monster);

			// 괴물을 움직이는 스레드 생성 및 시작
			MonsterThread thread = new MonsterThread(monster, avatar, monsterDelay);
			thread.start();
		}

		// GamePanel에 등록된 KeyListener. 상하좌우 키와 q키
		class MyKeyListener extends KeyAdapter {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == quitChar)
					System.exit(0);

				int keyCode = e.getKeyCode();

				switch (keyCode) {
				case KeyEvent.VK_W:
					avatar.setLocation(avatar.getX(), avatar.getY() - AVATAR_MOVE);
					break;
				case KeyEvent.VK_S:
					avatar.setLocation(avatar.getX(), avatar.getY() + AVATAR_MOVE);
					break;
				case KeyEvent.VK_A:
					avatar.setLocation(avatar.getX() - AVATAR_MOVE, avatar.getY());
					break;
				case KeyEvent.VK_D:
					avatar.setLocation(avatar.getX() + AVATAR_MOVE, avatar.getY());
					break;

				default:
					break;
				}

				avatar.getParent().repaint();
				// avatar의 위치가 변경되었으므로 다시 그리기
				// avatar가 있는 패널에는 이전의 위치에 있었던 아바타를 지워야 하기 때문에
				// avatar의 부모 패널에게 다시 그리기를 지시함
			}

		}

		// 괴물을 움직이는 200ms당 5픽셀을 이동하여 끊임없이 아바타를 추적하는 스레드
		// 생성자는 두개의 라벨 컴포넌트를 전달받는다.
		class MonsterThread extends Thread {
			JLabel from; // 쫓아가는 라벨. monster라벨
			JLabel to; // 도망가는 라벨. avatar 라벨
			long monsterDelay;
			final int MONSTER_MOVE = 5; // from 라벨이 한번에 이동하는 픽셀

			public MonsterThread(JLabel _from, JLabel _to, long _monsterDelay) {
				from = _from;
				to = _to;
				monsterDelay = _monsterDelay;
			}

			public void run() {
				int x = from.getX(), y = from.getY(); // 현재 monster의 위치
				while (true) {
					if (to.getX() < from.getX()) // avatar가 monster의 왼쪽에 있다면
						x = from.getX() - MONSTER_MOVE;
					else // avatar가 monster의 오른쪽에 있는 경우
						x = from.getX() + MONSTER_MOVE;

					if (to.getY() < from.getY()) // avatar가 monster의 위쪽에 있다면
						y = from.getY() - MONSTER_MOVE;
					else
						y = from.getY() + MONSTER_MOVE;

					// monster의 위치 수정
					from.setLocation(x, y);

					// monster의 위치가 변경되었기 때문에 monster를 포함하는 패널을 다시 그리도록 함
					from.getParent().repaint();

					try {
						Thread.sleep(monsterDelay);
					} catch (InterruptedException e) {
						return;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		new MonsterGame();
	}
}

// TODO : 괴물 여러개 만들기, 초시계붙여서 몇분까지 버텼는지, 난이도 올라갈수록 몬스터속도 빨라지기
