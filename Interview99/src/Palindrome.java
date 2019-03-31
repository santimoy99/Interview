

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String");
		String s1=sc.nextLine();
		String temp="";
		for(int i=s1.length()-1;i>=0;i--) {
			temp=temp+s1.charAt(i);
		}
		//System.out.println(temp);

		if(temp.equals(s1)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
