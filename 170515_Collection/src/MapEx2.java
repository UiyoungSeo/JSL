import java.util.Date;
import java.util.Hashtable;

public class MapEx2 {
	public static void main(String[] args) {
		Hashtable hs = new Hashtable();
		hs.put("title", "Java Programing");
		hs.put("name", "Uiyoung Seo");
		hs.put("publisher", "suysoft");
		hs.put("date", new Date());

		System.out.println("Title:" + hs.get("title"));
		System.out.println("Name:" + hs.get("name"));
		System.out.println("Publisher:" + hs.get("publisher"));
		System.out.println("Date:" + hs.get("date"));
	}
}
