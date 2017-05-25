import java.net.InetAddress;

public class Ex01 {
	public static void main(String[] args) throws Exception{
		InetAddress ia = InetAddress.getByName("www.google.com");
		System.out.println(ia.getHostAddress());
	}
}