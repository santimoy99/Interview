import java.util.Arrays;
import java.util.Scanner;

public class searching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a number");

		int n = sc.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));

		System.out.println("Searching number");
		int s1 = sc.nextInt();
		
		search(array, s1);
		
	}

	private static void search(int[] array, int s1) {
		boolean found = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==s1) {
				found = true;
				break;
			}

		}
		if(found) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
