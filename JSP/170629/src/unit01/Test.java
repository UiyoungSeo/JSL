package unit01;

public class Test {
	public static void main(String[] args) {
		int i1 = -5;
		int i3 = -i1;

		int i4 = ++i3;
		int i5 = i3++;

		System.out.println(i4);
		System.out.println(i5++);
		System.out.println(i5);

		for (int i = 0; i < args.length; ++i) {

		}
	}
}
