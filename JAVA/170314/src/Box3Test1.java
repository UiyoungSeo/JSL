class Box3 {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0;

	public Box3(){
		idNum = ++boxID;
	}
}

public class Box3Test1 {
	public static void main(String[] args) {
		Box3[] myBox = new Box3[4];
		for (int i = 0; i < myBox.length; i++) {
			myBox[i] = new Box3(); 
		}
		
		System.out.println("myBox[0]の番号："+myBox[0].idNum);
		System.out.println("myBox[1]の番号："+myBox[1].idNum);
		System.out.println("myBox[2]の番号："+myBox[2].idNum);
		System.out.println("myBox[3]の番号："+myBox[3].idNum);
		System.out.println("最後に作られたボックスの番号は："+Box3.boxID+"番です");
	}
}
