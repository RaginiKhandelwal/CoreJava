package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class TwoDMatrixTranspose {
	public static void main(String[] args) {
		int i, j;
		System.out.println("rows and cols");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		System.out.println("enter matrix=");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
			System.out.println(" ");
		}

		System.out.println();
		System.out.println("our matrix=");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("transpose==");
		for (i = 0; i < col; i++) {
			for (j = 0; j < row; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
