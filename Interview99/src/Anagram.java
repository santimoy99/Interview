

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {


		Scanner sc=new Scanner (System.in);
		System.out.println("write a string ");
		String s=sc.nextLine();
		System.out.println("write a another string ");
		String s1=sc.nextLine();
		
		s1=s1.replace(" ", "");
		s=s.replace(" ", "");
		//System.out.println(s1);
		//System.out.println(s);
		if(s1.length()==s.length()) {
			s1=convertUpperCase(s1);
			s=convertUpperCase(s);
			
			s1=sort(s1);
			s=sort(s);
			
			if(s1.equals(s)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("not anagram");
			}
		}
		else {
			System.out.println("Not Anagram");
		}

	}

	private static String sort(String s1) {
		char[] c=s1.toCharArray();
		String temp="";
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					char c1=c[i];
					c[i]=c[j];
					c[j]=c1;
				}
				
			}
			for(int k=0;k<c.length;k++) {
				temp=temp+c[k];
			}
		}
		return temp;
	}

	private static String convertUpperCase(String s1) {
		String temp="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>=65 && s1.charAt(i)<=97) {
				temp=temp+(char)(s1.charAt(i)+32);
			}
		}
		return temp;
	}

	public static String removeSpace(String s1) {
		
		String temp="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				temp=temp+s1.charAt(i);
			}
		}
		return temp;
	}

}
