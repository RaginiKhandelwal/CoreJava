package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no in array=");
		int[] a = new int[10];
		int sumofeven = 0;
		int sumofodd = 1;
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		for (int i = 0; i < a.length; i++)
			if (a[i] % 2 == 0)
				sumofeven += a[i];
			else
				sumofodd *= a[i];
		System.out.println();
		System.out.println("sumofeven=" + sumofeven);
		System.out.println("product of odd=" + sumofodd);
		s.close();
	}
}
