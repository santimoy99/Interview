import java.util.Scanner;

public class findoddNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("starting ");
		int n=sc.nextInt();
		System.out.println("Ending ");
		int x=sc.nextInt();
		
		
		for(int i=n;i<=x;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			
			}
			
			
		}

	}

}
