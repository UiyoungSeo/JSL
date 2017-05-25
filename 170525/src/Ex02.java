import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex02 {
	public static void main(String[] args){
		InetAddress ia = null;
		InetAddress ib = null;
		InetAddress[] ic = null;
		try{
			ia = InetAddress.getLocalHost();
			ib = InetAddress.getByName("www.daum.net");
			ic = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("ia.hostAddr = " + ia.getHostAddress());
			System.out.println("ia.hostName = " + ia.getHostName());
			System.out.println();
			
			System.out.println("ib.hostAddr = " + ib.getHostAddress());
			System.out.println("ib.hostName = " + ib.getHostName());
			System.out.println();
			
			for (int i = 0; i < ic.length; i++) {
				System.out.println("ic.hostAddr = " + ic[i].getHostAddress());
				System.out.println("ib.hostName = " + ic[i].getHostName());
			}
		} catch(UnknownHostException e){
			e.printStackTrace();
		}
	}
}
