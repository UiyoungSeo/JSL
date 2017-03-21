package wordgame.suy;

import java.util.Scanner;

public class WordGameApp {
	public static void main(String[] args) {
		Player[] p;
		String word = "아버지";
		boolean succeed = true;

		Scanner sc = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까 >> ");
		p = new Player[sc.nextInt()];

		for (int i = 0; i < p.length; i++) {
			System.out.print((i + 1) + "번째 참가자의 이름을 입력하세요 >>");
			p[i] = new Player(sc.next());
		}

		System.out.println("시작하는 단어는 " + word + "입니다.");

		while (succeed) {
			for (int i = 0; i < p.length; i++) {
				System.out.print(p[i].getName() + ">>");
				p[i].sayWord();

				int lastIndex = word.length() - 1;
				char lastChar = word.charAt(lastIndex);

				if (p[i].getWord().charAt(0) == lastChar) {
					word = p[i].getWord();

				} else {
					System.out.println(p[i].getName() + "님이 졌습니다.");
					succeed = false;
					break;
				}
			}
		}
	}
}
