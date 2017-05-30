import java.util.ArrayList;
import java.util.Vector;

class II {
	@Override
	public String toString() {
		return "class II";
	}
}

class KK {
	@Override
	public String toString() {
		return "class KK";
	}
}

public class ListEx {
	public static void main(String[] args) {
		II a = new II();
		KK b = new KK();
		String c = new String("C");

		Vector vc = new Vector();
		vc.add(a);
		vc.add(b);
		vc.add(c);

		ArrayList al = new ArrayList();
		al.add(a);
		al.add(b);
		al.add(c);

		for (int i = 0; i < vc.size(); i++) {
			Object obj = vc.elementAt(i);
			System.out.println(i+"->"+obj);
		}
		
		System.out.println();
		
		for (int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);
			System.out.println(i+"->"+obj);
		}
	}
}