

import java.util.Scanner;

public class DuplicateCharacterRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a string ");
		String s1=sc.nextLine();
		
		String temp="";
		
		s1=s1.replace(" ", "");
		System.out.println(s1);//remove Space
		
		char[] source=s1.toCharArray();
		for(char c1:source) {
			if(temp.indexOf(c1)==-1) {
				temp=temp+c1;
				
			}
		}
		System.out.println(temp);
		
		
	}

}
