//사용중인 포트 확인
import java.net.ServerSocket;

public class Ex03 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		for (int i = 1; i <= 65535; i++) {
			try	 {
				ss = new ServerSocket(i);
				ss.close();
			} catch (Exception e) {
				System.out.println(i+"번 포트가 현재 사용중입니다.");
			}
		}
	}
}
