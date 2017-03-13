import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 >>");
		int dan = sc.nextInt();
		int count = 2;
		
		while(count<=9){
			System.out.println(dan+"*"+count+"="+dan*count);
			count++;
		}
	}

}
