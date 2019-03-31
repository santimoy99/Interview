

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String str = sc.nextLine();
		
		String[]  array=str.split(" ");
		String temp=" ";
		
		for(int i=array.length-1;i>=0;i--) {
			temp=temp+array[i]+" ";
		}
		System.out.println(temp.trim());

	}

}
