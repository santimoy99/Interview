import java.util.Scanner;

public class charactercount {
	
	static int max=256;
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("write a string");
		 String str=sc.nextLine();
		 
		 countingchar(str);

	}

	private static void countingchar(String str) {
		// TODO Auto-generated method stub
		
		int[] count=new int[max];
		
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		char[] carr=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			carr[i]=str.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++) {
				if(str.charAt(i)==carr[j]) {
					find++;
				}
			}
			if(find==1) {
				System.out.println("character "+str.charAt(i)+ " "+count[str.charAt(i)]);
			}
		}
		
	}

}


