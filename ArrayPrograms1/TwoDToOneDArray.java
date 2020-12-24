package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class TwoDToOneDArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows for m1 and m2");
		int row = s.nextInt();
		System.out.println("enter no of cols for m1 and m2");
		int col = s.nextInt();

		int[][] m1 = new int[row][col];
		int i, j = 0, a[] = new int[row * col];

		System.out.println("enter elements in m1");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				m1[i][j] = s.nextInt();
			}
		}
		int l = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++, l++) {
				a[l] = m1[i][j];

			}
		}
		for (l = 0; l < row * col; l++) {

			System.out.print(a[l] + "  ");

		}
		s.close();
	}
}
