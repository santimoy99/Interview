

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=sc.nextInt();
		System.out.println("Enter a num");
		int n1=sc.nextInt();

		int gcd=1;
		for(int i=1;i<=n && i<=n1;i++) {
			if(n%i==0 && n1%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD IS "+gcd);
		int lcm=(n*n1)/gcd;
		System.out.println("LCM IS "+lcm);
	}

}
