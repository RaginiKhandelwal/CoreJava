
package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class AddArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("sum of array=" + sum);
		sc.close();
	}
}
