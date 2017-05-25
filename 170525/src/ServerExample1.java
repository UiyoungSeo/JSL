import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample1 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null; // server는 ServerSocket과
		Socket socket = null; // Socket이 필요하다.
		try {
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept();
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			byte[] arr = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			String str = "안녕하세요. Hello, Client!";
			out.write(str.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
