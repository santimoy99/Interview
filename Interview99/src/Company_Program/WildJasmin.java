package Company_Program;


import java.util.Scanner;

public class WildJasmin {

	public static void main(String[] args) {
		
	
		//String str="West[@123]bengal";
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		int startIndex = str.indexOf('[');
		int endIndex = str.indexOf(']');
		System.out.println("Result is "+ str.substring(startIndex+1, endIndex));
		
		/*
		 * int n=0,k=0; for(int i=0;i<=str.length()-1;i++) { if(str.charAt(i)=='[') {
		 * n=n+i; System.out.println(n); } else if(str.charAt(i)==']') { k=k+i;
		 * System.out.println(k); }
		 * 
		 * } for(int j=n+1;j<k;j++) { System.out.print(str.charAt(j)); }
		 */

	}

}
