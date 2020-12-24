package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class SumOfHighLow {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no in array=");
		int[] a = new int[10];
		int tempmin, tempmax;
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);

		tempmin = tempmax = a[0];
		for (int i = 0; i < a.length; i++)
			if (a[i] < tempmin)
				tempmin = a[i];
			else if (a[i] > tempmax)
				tempmax = a[i];
		System.out.println("min val=" + tempmin);
		System.out.println("maxval=" + tempmax);
		System.out.println("sum=" + (tempmin + tempmax));

		s.close();
	}
}
