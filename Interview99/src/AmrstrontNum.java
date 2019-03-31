

import java.util.Scanner;

public class AmrstrontNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		

		int temp = n, sum = 0;
		while (n > 0) {

			int r = n % 10;
			n = n / 10;
			sum = sum + (r * r * r);
		}

		if (temp == sum) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not Amstrong");
		}
	}

}
