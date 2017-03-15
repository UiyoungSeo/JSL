import java.util.Scanner;

/* 다음은 숫자맞추기 게임을 작성한 것이다 1과 100사이의 값을 반복적으로 입력해서 
 * 컴퓨터가 생각한 값을 맞추면 게임이 끝난다 사용자가 값을 입력하면, 컴퓨터는 자신이 
 * 생각한 값과 비교해서 결과를 알려준다 사용자가 컴퓨터가 생각한 숫자를 맞추면 
 * 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.*/

public class Exercise4_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count= 0;
		int answer = (int) (Math.random() * 100 + 1);
		
		while (true) {
			System.out.print("1と100間の数字を入力してください>>");
			int input = sc.nextInt();
			count ++;
			
			if(answer > input)
				System.out.println("もっと高いです。");
			else if(answer < input)
				System.out.println("もっと低いです。");
			else {
				System.out.println((count)+"番目で当たりました。");
				break;
			}
		
		}
	}

}
