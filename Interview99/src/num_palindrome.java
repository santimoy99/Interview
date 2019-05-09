

import java.util.Scanner;

public class num_palindrome {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       System.out.println("enter num");
	       int num =sc.nextInt();
	     
	       int temp=num;
	       int rev=0,rim;
	       while(num!=0) {
	    	   rim=num%10;
	    	    rev=rev*10+rim;
	    	    num=num/10;
	    	    
	    	   
	       }
	       System.out.println(rev);
	       if(temp==rev) {
	    	   System.out.println("palindrome");
	       }else {
	    	   
	    	   System.out.println("Not palindrome");
	       }
	       
	}

}
