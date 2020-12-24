package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class CountNumberMatrix {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows for m1 and m2");
		int row = s.nextInt();
		System.out.println("enter no of cols for m1 and m2");
		int col = s.nextInt();
		int i, j, count = 0;
		int[][] m1 = new int[row][col];
		System.out.println("enter elements in m1");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				m1[i][j] = s.nextInt();
			}
		}
		System.out.println("enter the num");
		int n = s.nextInt();
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				if (m1[i][j] == n) {
					count++;
				}
			}
		}
		System.out.println("num of " + n + "in matrix is=" + count);
		s.close();
	}
}