


import java.util.Scanner;

public class PrintDuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String str = sc.nextLine();
		
		char[] carray=str.toCharArray();

		//int count = 0;
		for (int i = 0; i <= str.length()-1; i++) {
			for (int j = i + 1; j <=  str.length()-1; j++) {
				if (carray[i] == carray[j]) {
					
					System.out.println(carray[j]);
					//count++;
				}
			}
		}
	}
}