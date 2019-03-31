


import java.util.Scanner;

public class Count_Vowel_Con {
	
	public static void main (String args[]) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=sc.nextLine();
	
	int vc=0,cc=0,nc=0,sp=0,s1c=0;
	
	for(int i=0;i<=str.length()-1;i++) {
		if(str.charAt(i)>=65 && str.charAt(i)<=90 ||
				str.charAt(i)>=97&&str.charAt(i)<=122) {
			
			if(str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
					str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vc++;
			}
			else {
				cc++;
			}
		}
		else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
			nc++;
		}
		else if(str.charAt(i)==' ') {
			sp++;
		}
		else {
			s1c++;
		}
	}
	
	System.out.println(vc);
	System.out.println(cc);
	System.out.println(nc);
	System.out.println(s1c);
	System.out.println(sp);
	}
	
}
