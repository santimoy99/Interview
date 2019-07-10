package Company_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Maventic_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 6) {
int[] str = new int[n];

			for (int i = 0; i < n; i++) {
				str[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(str));

			System.out.println("Enter stock which you want to buy");
			int buy = sc.nextInt();

			for (int k = 0; k < str.length; k++) {
				
				if (str[k]==buy) {

					System.out.println("Stock buy is " + (k+1));
				}
				
				
				/*
				 * else { System.out.println("Enter the correct stock"); }
				 */
			}
			int []str2=str;
			Arrays.sort(str2);
			System.out.println(Arrays.toString(str2));
			int max=str2[str2.length-1];
			System.out.println(max);
			for(int j=0;j<str.length;j++) {
				if(str[j]>=max) {
					System.out.println("maximum selling date "+(j));
				}
			}
			
		} else {
			System.out.println("Please enter maximum 6 num");
		}
	}

}
