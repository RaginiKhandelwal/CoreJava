package prestigepoint.ArrayPrograms;

public class BubbleSortArray {
	public static void main(String[] args) {
		int a[] = { 6, 45, 7, 28, 8, 37, 9, 19 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
