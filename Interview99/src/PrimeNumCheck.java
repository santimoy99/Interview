

import java.util.Scanner;

public class PrimeNumCheck {

	

    public static void main(String[] args) {
    
    	Scanner sc=	new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		
		String str="";
		
		
			int count=0;
			for(int  j=1;j<=n;j++) {
				if(n%j==0) {
					count=count+1;
				}
			}
			System.out.println(count);
			if(count>2) {
				System.out.println("Prime num");
			}
			else {
				
				System.out.println("Not");
			}
		}
	}
	


