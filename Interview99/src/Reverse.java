

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String str = sc.nextLine();
		
		// reverse() method only use when we create object of StringBuffer class
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());

		
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
		temp=temp+str.charAt(i);
		}
		System.out.println(temp);
	}

}
