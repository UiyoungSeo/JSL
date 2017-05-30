import java.util.HashSet;
import java.util.Iterator;

class AA {
	@Override
	public String toString() {
		return "class AA";
	}
}

class BB {
	@Override
	public String toString() {
		return "class BB";
	}
}

public class SetEx {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		String c = new String("c");

		HashSet hs = new HashSet();
		hs.add(a);
		hs.add(b);
		hs.add(c);
		Iterator it = hs.iterator(); // data 추출

		while (it.hasNext()) {	// hashset은 순서가 없으므로 while 사용
			Object obj = it.next();
			System.out.println("obj:" + obj);
		}
	}
}
