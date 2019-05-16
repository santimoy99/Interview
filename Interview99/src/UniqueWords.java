import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		str=str.replaceAll(" ", "").toLowerCase();
		System.out.println(str);
		
		int temp=0;
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					temp=temp+1;
				}
			}
			
		}
		if(temp>0) {
			System.out.println("The String is not unique");
		}
		else {
			System.out.println("The String is  unique");
		}
	}

}
