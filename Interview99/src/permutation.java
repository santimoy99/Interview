

import java.util.Scanner;

public class permutation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		int n=str.length();
		permutation p=new permutation();
		
		p.permut(str,0,n-1);
		
	}

	public void permut(String str, int l, int r) {


		if(l==r) {
			System.out.println(str);
		}
		else {
			for(int i=l;i<=r;i++) {
				str=swap(str,l,i);
				permut(str,l+1,r);
				str=swap(str,l,i);
			}
		}
		
	}

	private String swap(String str, int i, int j) {
		char temp;
		char[] c=str.toCharArray();
		temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		return String.valueOf(c);
	}

}
