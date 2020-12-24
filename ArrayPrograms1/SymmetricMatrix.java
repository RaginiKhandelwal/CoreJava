package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class SymmetricMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows ");
		int row = s.nextInt();
		System.out.println("enter no of cols ");
		int col = s.nextInt();
		int i, j, f = 0;
		int m1[][] = new int[row][col];
		System.out.println("enter elements in m1");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++)
				m1[i][j] = s.nextInt();

		}
		System.out.println("our matrix=");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("transpose ");
		for (i = 0; i < col; i++) {
			for (j = 0; j < row; j++) {
				System.out.print(m1[j][i] + " ");
			}
			System.out.println(" ");
		}
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				if (m1[i][j] != m1[j][i]) {
					f = 1;
					// break;
				}
			}
		}
		if (f == 1)
			System.out.println("Asymetric");
		else
			System.out.println("symetric matrices");
		s.close();
	}
}