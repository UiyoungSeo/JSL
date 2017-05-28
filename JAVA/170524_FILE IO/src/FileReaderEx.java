import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("c:\\windows\\System.ini");
			int c;
			while((c = in.read()) != -1){	
				System.out.print((char)c);
			}
			in.close();	//stream을 닫는다. 
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
