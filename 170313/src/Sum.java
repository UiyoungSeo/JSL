public class Sum {
	int sum;

	public int allSum(int x, int y) {
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}

	public int oddSum(int x, int y) {
		if (x % 2 == 0)
			x++;
		for (int i = x; i <= y; i += 2) {
			sum += i;
		}
		return sum;
	}

	public int evenSum(int x, int y) {
		if (x % 2 == 1)
			x++;
		for (int i = x; i <= y; i += 2) {
			sum += i;
		}
		return sum;
	}
}
