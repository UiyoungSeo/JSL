import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScore {
	public static void main(String[] args) {
		// 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> score = new HashMap<>();

		// 5개의 점수 저장
		score.put("kudo", 100);
		score.put("satomi", 99);
		score.put("mori", 75);
		score.put("ayumi", 78);
		score.put("kenta", 40);

		System.out.println("HashMap의 요소 개수:" + score.size());

		// 모든 사람의 점수 출력. score에 들어있는 모든 (key, value)
		Set<String> keys = score.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name + ":" + score.get(name));
		}
	}
}
