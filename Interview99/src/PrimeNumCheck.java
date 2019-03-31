

import java.util.Scanner;

public class PrimeNumCheck {

	

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
       System.out.println("enter num");
       int n =sc.nextInt();
       if(n==0) {
    	   System.out.println("not prime num");
       }
       else if(n==1 || n==2) {
    	   System.out.println("prime num");
       }
       else {
    	   isprime(n);
       }
    }

	private static void isprime(int n) {
		// TODO Auto-generated method stub
		boolean isp=true;
		int count=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isp=false;
				 
				break;
			}
		}
			if(isp) {
				System.out.println("prime num");
			}
			else {
				System.out.println("not prime num");
			
		}
		
	}
	

}
