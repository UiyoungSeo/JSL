import java.text.StringCharacterIterator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

class EE {
	@Override
	public String toString() {
		return "class EE";
	}
}

class FF {
	@Override
	public String toString() {
		return "class FF";
	}
}

public class MapEx1 {
	public static void main(String[] args) {
		EE a = new EE();
		FF b = new FF();
		String c = new String("c");

		Hashtable ht = new Hashtable();
		ht.put("EE", a); // 키값은 보통 문자열 (키, 값)
		ht.put("FF", b);
		ht.put("ST", c);
		ht.put("E1", a); // 중복 허용

		Enumeration enu = ht.elements();// Iterator의 이전버전
		while (enu.hasMoreElements()) {
			Object obj = enu.nextElement();
			System.out.println("obj:" + obj);
		}
	}
}
