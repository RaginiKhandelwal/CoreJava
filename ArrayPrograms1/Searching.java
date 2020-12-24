package prestigepoint.ArrayPrograms;

import java.util.Scanner;

public class Searching {
	public static void main(String[] args) {

		int[] arr = { 5, 6, 4, 8, 78, 45, 2, 55 };
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to search=");

		int a = sc.nextInt();
		int j;
		for (j = 0; j <= arr.length - 1; j++) {
			if (arr[j] == a) {
				System.out.println("number found=" + arr[j] + " at " + j + " position");
			} else {
				System.out.println("enter valid no from array");
			}

		}
//	 if(j==arr.length)
//	 {System.out.println("no. not found");}
		sc.close();
	}
}
