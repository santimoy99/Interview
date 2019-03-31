

public class NumSwap {

	public static void main(String[] args) {
		
		int a=20;int b=30;
		System.out.println("a= "+a+" b= "+b);
		/*
		int temp;
		temp=b;
		b=a;
		a=temp;
		System.out.println("a= "+a+" b= "+b);
		*/
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a= "+a+" b= "+b);
		
	}

}
