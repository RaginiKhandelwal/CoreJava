package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class TwoDMatrixAddition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows for m1 and m2");
		int row = s.nextInt();
		System.out.println("enter no of cols for m1 and m2");
		int col = s.nextInt();
		int i, j, k, l;
		int[][] m1 = new int[row][col];
		int[][] m2 = new int[row][col];
		int[][] m3 = new int[row][col];
		System.out.println("enter elements in m1");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				m1[i][j] = s.nextInt();
			}
		}
		System.out.println("matrix 1=");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("enter elements in m2");
		for (k = 0; k < row; k++) {
			for (l = 0; l < col; l++) {
				m1[k][l] = s.nextInt();
			}
		}
		System.out.println("matrix 2=");
		for (k = 0; k < row; k++) {
			for (l = 0; l < col; l++) {
				System.out.print(m1[k][l] + " ");
			}
			System.out.println(" ");
		}
		// addition----------------
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		System.out.println("after addition matrix 3=");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(m3[i][j] + " ");
			}
			System.out.println(" ");
		}

		s.close();

	}
}
