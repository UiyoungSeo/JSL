import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ColectionsEx {
	// list의 요소를 프린트하는 메서드
	private static void printList(LinkedList<String> list) {
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String seperator;
			if (iterator.hasNext())
				seperator = "->"; // 마지막 요소가 아니면
			else
				seperator = "\n"; // 마지막 요소이면 줄바꾸기
			System.out.print(e + seperator);
		}
	}

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		myList.add("Die Hard");
		myList.add("Star Wars");
		myList.add("Matrix");
		myList.add(0, "Terminator");
		myList.add(2, "Avatar");

		Collections.sort(myList); // 오름차순 정렬
		printList(myList); // 정렬된 요소 출력

//		Collections.reverse(myList); // 요소의 순서를 반대로
//		printList(myList);

		int index = Collections.binarySearch(myList, "Avatar");
		System.out.println("Avatar는 " + index + "번째 요소 입니다.");
		
		
	}
}
