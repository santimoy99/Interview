

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		Scanner sc=	new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		
		String str="";
		
		for(int  i=1;i<=n;i++) {
			int count=0;
			for(int  j=i;j>=1;j--) {
				if(i%j==0) {
					count=count+1;
				}
			}
			
			if(count==2) {
				str=str+i+" ";
			}
		}
		System.out.println(str);

	}

}
