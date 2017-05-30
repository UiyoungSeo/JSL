public class ArrayParameter {
	public static void main(String[] args) {
		char[] ch = { 'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U' };

		printCharacterArray(ch);
		replaceSpace(ch);
		printCharacterArray(ch);
		toLowerCase(ch);
		printCharacterArray(ch);
	}

	static void printCharacterArray(char[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	static void replaceSpace(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ')
				a[i] = ',';
		}
	}

	static void toLowerCase(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != ' ' && a[i] != ',' )
				a[i] += 32;
		}
	}
}
