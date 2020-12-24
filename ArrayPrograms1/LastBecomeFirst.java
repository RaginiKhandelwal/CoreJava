package prestigepoint.ArrayPrograms;

public class LastBecomeFirst {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int temp = a[a.length - 1];
		for (int j = a.length - 1; j > 0; j--) {
			a[j] = a[j - 1];
		}
		a[0] = temp;
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}

}
