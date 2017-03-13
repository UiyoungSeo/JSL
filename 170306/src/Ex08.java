import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		String season="";
		
		do {
			System.out.println("월을 입력하세요(끝내기:0)");
			month = sc.nextInt();
			
			if(month >= 3 && month <= 5)
				season = "spring";
			else if (month >=6 && month <=8)
				season = "summer";
			else if (month >=9 && month <= 11)
				season = "autmn";
			else if (month == 12 || month == 1 || month == 2)
				season = "winter";
			else if (month != 0)
				season ="잘못된 입력 : 해당되는 계절이 없습니다.";
			else if (month == 0)
				break;
			
			System.out.println(season);
		}while(month != 0);
		System.out.println("thanks");
		
	}

}
