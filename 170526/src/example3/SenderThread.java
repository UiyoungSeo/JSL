package example3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {
	Socket socket;

	public SenderThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			// BufferedReader : 모았다가 한번에 보낸다.
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			while (true) {
				String str = reader.readLine();// readLine() : 엔터를 쳤을때 입력을
												// 받아들인다.
				if (str.equals("bye"))
					break;
				writer.println(str);
				writer.flush();// flush : 공간이 꽉차지 않아도 비워서 넘어갈수 있게 한다.
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
