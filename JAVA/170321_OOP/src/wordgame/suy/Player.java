package wordgame.suy;

import java.util.Scanner;

public class Player {
	private String name;
	private String word;

	Scanner sc = new Scanner(System.in);

	public Player(String _name) {
		name = _name;
	}

	public void sayWord() {
		word = sc.next();
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public String getWord() {
		return word;
	}
}
