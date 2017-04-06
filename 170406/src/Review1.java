import java.util.Scanner;

public class Review1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*9);
		System.out.println(answer);
		
		while(true){
			System.out.print("guess 0~9>>");
			int a = sc.nextInt();
			if(a!=answer)
				System.out.println("nope");
			else
				System.out.println("yay");
		}
	}
}