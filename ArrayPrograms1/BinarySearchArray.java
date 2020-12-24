package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class BinarySearchArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] a = { 2, 3, 5, 45, 65, 67, 78, 87, 90 };
		int left = 0;
		int right = a.length - 1;
		int mid = 0;
		System.out.println("enter the number=");
		int x = s.nextInt();

		while (left <= right) {
			mid = (left + right) / 2;
			if (a[mid] == x) {
				System.out.println("number found at" + mid);
				break;
			} else if (x < a[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		s.close();
	}
}
