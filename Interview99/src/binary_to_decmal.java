import java.util.Scanner;

public class binary_to_decmal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		String n="";
		for(int i=0;i<p;i++){
		    n=sc.next();
		    int decimal=Integer.parseInt(n,2);
		    System.out.println(decimal);
		}
	

	}

}
