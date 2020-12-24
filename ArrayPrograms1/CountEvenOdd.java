
package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class CountEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		// int sum=0;
		int counteven = 0;
		int countodd = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] % 2 == 0)
				counteven++;
			else
				countodd++;
		}
		System.out.println("even numbers=" + counteven);
		System.out.println("odd numbers=" + countodd);
		sc.close();

	}
}
