package wordgame.answer;

import java.util.Scanner;

public class Player {
	private Scanner scanner;
	private String name;
	private String word;
	
	public Player(String _name) {
		name =_name;
		scanner = new Scanner(System.in);
	}
	
	public String sayWord(){
		System.out.print(name+">>");
		word = scanner.next();
		return word;
	}
	
	public boolean succeed(String lastWord){
		int lastIndex = lastWord.length()-1;
		
		if(lastWord.charAt(lastIndex) == word.charAt(0))
			return true;
		else
			return false;
	}
	
	
	//getters and setters
	public String getName(){ return name;}
	
	
}
