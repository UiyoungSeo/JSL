import java.util.Vector;

public class GenericEx1 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "100";
		
		Vector<String> v = new Vector<String>();	//Vector에 String값만 집어넣겠다는 뜻
		v.addElement(s1);
		v.addElement(s2);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i).toUpperCase());
		}
	}
}
