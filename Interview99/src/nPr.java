import java.util.Scanner;

public class nPr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		for(int j=0;j<x;j++) {
			
			Long num1 = (long) sc.nextLong();
			Long num2 = (long) sc.nextLong();
			Long sum = (long) 1;
			for (Long i = (long) 1; i <= num1; i++) {
				sum = sum * i;
			}
			System.out.println(sum);
			
			Long sum2 = num1 - num2;
			Long sum3 = (long) 1;
			for (Long i = (long) 1; i <= sum2; i++) {
				sum3 = sum3 * i;
			}
			System.out.println(sum3);
			System.out.println(sum / (sum3));
		}

	}

}
