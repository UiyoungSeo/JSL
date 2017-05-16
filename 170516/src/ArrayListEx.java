import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
//		문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> list = new ArrayList<>();
		
		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			list.add(sc.next());
		}
		
		//ArrayList에 들어있는 모든 이름 출력
		for (String name : list) {
			System.out.println(name + "");
		}
		
		// 가장 긴 이름 출력
		int longestIndex = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(longestIndex).length()< list.get(i).length())
				longestIndex = i;
		}
		System.out.println("가장 긴 이름은 : " + list.get(longestIndex));
	}
}
