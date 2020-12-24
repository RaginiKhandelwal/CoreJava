package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class SumOfDiagonalOfMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows ");
		int row = s.nextInt();
		System.out.println("enter no of cols ");
		int col = s.nextInt();
		int i, j, sum = 0;
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

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				if (i == j)
					sum += m1[i][j];
			}
		}
		System.out.println("sum of  primary diagonal=" + sum);
		sum = 0;
		for (j = m1.length - 1, i = 0; j > 0 && i < m1.length; j--, i++) {
			sum = sum + m1[i][j];
		}

		System.out.println("sum of secondary diagonal=" + sum);

	}
}
