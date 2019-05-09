import java.util.Scanner;

public class Word_count {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Write a sentence");
		String s1=sc.nextLine();
		
		int count=1;
		String[] s2=s1.split(" ");
		
		for(int i=0;i<s2.length;i++) {
			for(int j=i+1;j<s2.length;j++) {
				if(s2[i].equals(s2[j])) {
					count=count+1;
					s2[j]="0"; 
				}
			}
			if(s2[i]!="0") {
				System.out.println(s2[i]+" "+count);
			}
			count=1;
		}
	}

}
