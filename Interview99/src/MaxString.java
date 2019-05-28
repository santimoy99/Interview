import java.util.Scanner;

public class MaxString {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Write a String");
		String s1=sc.nextLine();
		
		String s2[]=s1.split(" ");
		String max=max(s2);
		System.out.println(max);
	}

	private static String max(String[] s2) {
		int maxLength=0;
		String largest=null;
		for(String str:s2) {
			if(str.length() > maxLength) {
				maxLength=str.length();
				largest=str;
			}
		}
		return largest;
	}

}
