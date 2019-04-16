import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Write a num");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(n==sum) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not perfect");
		}

	}

}
