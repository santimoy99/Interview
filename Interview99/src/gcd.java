

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int n1=sc.nextInt();
		System.out.println("Enter a num");
		int n2=sc.nextInt();
		
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}  
		System.out.println(gcd);
	}

}
