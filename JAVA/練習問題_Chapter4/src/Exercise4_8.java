// 방정식 2x+4y=10 의 모든 해를 구하시오 단 x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 
public class Exercise4_8 {

	public static void main(String[] args) {
		for (int i = 0; i <=10; i++) {
			for (int j = 0; j <=10; j++) {
				if((i+2*j) == 5)
					System.out.println("i : "+i+", j :" + j);
			}
		}
	}

}
