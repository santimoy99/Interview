

import java.util.Scanner;

public class removeWhiteSpace {
	
	static String SpaceRemove(String s1) {
		String temp="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) !=' ') {
				temp=temp+s1.charAt(i);
			}
		}
		return temp;
	}
	
	 static String spaceRemove1(String s1) {
		s1=s1.replace(" ", "");
		return s1;
	}
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a string ");
		String s1=sc.nextLine();
		
		//s1=SpaceRemove(s1);
		//System.out.println(s1);
		
		s1=spaceRemove1(s1);
		System.out.println(s1);
	}



	 
}
