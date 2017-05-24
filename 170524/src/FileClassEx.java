import java.io.File;

public class FileClassEx {
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		File f2 = new File("c:\\tmp\\java_sample");
		File f3 = new File("c:\\tmp");

		String res;
		if (f1.isFile())	//파일 타입이면
			res = "파일";
		else	//디렉토리 타입이면
			res = "디렉토리";
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		if(!f2.exists()){	//f2가 나타내는 파일이 존재하는지 검사
			if(!f2.mkdir())	//존재하지 않으면 디렉토리 생성
				System.out.println("디렉토리 생성 실패");
		}
		if(f2.isFile())
			res = "파일";
		else
			res = "디렉토리";
		System.out.println(f2.getPath()+"은 "+res+"입니다.");
		dir(f3);	//c:\temp에 있는 파일과 디렉토리 화면에 출력
		f2.renameTo(new File("c:\\tmp\\javaSample"));
		dir(f3);
	}
	
	// 디렉토리에 포함된 파일과 서브디렉토리의 이름, 크기, 수정시간을 출력
	public static void dir(File fd){
		String[] fileNames = fd.list();
		for(String s : fileNames){
			File f = new File(fd,s);
			long t = f.lastModified();
			System.out.println(s);
			System.out.print("\t파일 크기 : "+ f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t,t,t,t);
		}
	}
}
