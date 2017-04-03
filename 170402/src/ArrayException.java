
public class ArrayException {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.print(array[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bounds");
		}

	}
}
