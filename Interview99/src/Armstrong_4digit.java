import java.util.Scanner;

public class Armstrong_4digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int sum = 0, count = 0;

		int temp = n;
		while (temp >0) {
			count = count + 1;
			temp = temp/ 10;
		}
		temp = n;
		while (temp > 0) {
			int rem =temp % 10;
			//int x=	pow(rem, count);
			sum = sum + pow(rem, count);
			//System.out.println(rem +" "+x);
			temp =temp / 10;
		}
		if (n == sum) {
			System.out.println("Amstrong");
		} else {
			System.out.println("not Amstrong");
		}
	}

	private static int pow(int rem, int count) {
			int y =1;
		for (int i = 1; i <= count; i++) {
			y = y * rem;
		}
		return y;
	}

}
