import java.util.Arrays;
import java.util.Scanner;

public class Reversesentence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("wite a sentence");
		String s1=scn.nextLine();
		
		int wc=0;
		int sc=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				sc++;
			}
		}
		wc=sc+1;
		String[] arr=new String[wc];
		String temp="";
		int h=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				arr[h]=temp;
				h++;
				temp=" ";
			}
			else {
				temp=temp+s1.charAt(i);
			}
			arr[h]=temp;
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
