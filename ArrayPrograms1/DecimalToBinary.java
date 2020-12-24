package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("enter a valid no");
		}
		int arr[] = new int[20];// taking an array for storing remainder value which will be our binary number

		int i = 0;
		while (num > 0) {
			arr[i] = num % 2;
			num = num / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}

		sc.close();
	}
}
