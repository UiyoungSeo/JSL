import java.util.ArrayList;

public class GenericEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		// for문 사용
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}

		System.out.println();

		// foreach 사용
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
