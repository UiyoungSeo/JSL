//selection sort

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 >> ");
		int[] num = new int[sc.nextInt()];

		System.out.print("숫자를 입력하세요 >>");

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		int temp, min;
		for (int i = 0; i < num.length - 1; i++) {
			min = i;
			for (int j = i + i; j < num.length; j++) {
				if (num[j] < num[min])
					min = j;
			}
			temp = num[i];
			num[i] = num[min];
			num[min] = temp;
		}

		System.out.println(Arrays.toString(num));
	}
}
