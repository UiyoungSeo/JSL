// Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value 에 저장하는
public class Exercise4_7 {

	public static void main(String[] args) {
		int value = (int) (Math.random() * 6 + 1);
		System.out.println(value);
	}

}
