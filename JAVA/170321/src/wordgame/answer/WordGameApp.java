package wordgame.answer;

import java.util.Scanner;

public class WordGameApp {
	private Scanner scanner;
	private String startWord = "아버지";
	private Player[] players;

	public WordGameApp() {
		scanner = new Scanner(System.in);
	}

	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까? >> ");
		int nPlayers = scanner.nextInt();
		players = new Player[nPlayers];

		for (int i = 0; i < players.length; i++) {
			System.out.print("참가자의 이름을 입력하세요 >>");
			String name = scanner.next();
			players[i] = new Player(name);
		}
	}

	public void run() {
		createPlayers();
		String lastWord = startWord;

		System.out.println("시작하는 단어는 " + lastWord + "입니다.");
		int next = 0;

		while (true) {
			String newWord = players[next].sayWord();
			if (!players[next].succeed(lastWord)) {
				System.out.println(players[next].getName() + "님이 졌습니다.");
				break;
			}
			next++;
			next %= players.length; // next가 참가자의 개수보다 많게 증가하는 것을 막는다.
			lastWord = newWord;
		}
	}

	public static void main(String[] args) {
		new WordGameApp().run();
	}
}
