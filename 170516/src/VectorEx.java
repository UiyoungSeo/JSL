import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(5);
		vector.add(4);
		vector.add(-1);

		// 벡터 중간에 삽입하기
		vector.add(2, 100);

		System.out.println("vector 내의 요소 객체 수 : " + vector.size());
		System.out.println("vector의 현재 용량 : " + vector.capacity());// 벡터의 기본용량은 10

		// 모든 요소 정수 출력하기
		for (Integer integer : vector) {
			System.out.println(integer);
		}
		
		//vector 속의 모든 정수 더하기
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += vector.elementAt(i);
		}
		System.out.println(sum);
	}
}
