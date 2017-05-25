import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample1 {
	public static void main(String[] args) {
		Socket socket = null;// client는 socket만 필요하다.
		try{
			socket = new Socket("127.0.0.1", 9000);
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			String str = "반갑습니다. Hello, Server!";
			out.write(str.getBytes());
			byte[] arr = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
		} catch(Exception e){
			try {
				socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
