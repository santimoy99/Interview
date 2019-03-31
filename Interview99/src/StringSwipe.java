

public class StringSwipe {

	public static void main(String[] args) {

		String a="hallo";
		String b="world";
		System.out.println("After Swipe a="+a+" b= "+b);
		
		a=a+b;
		//System.out.println(a);

		b=a.substring(0,a.length()-b.length());
		//System.out.println(b);
		a=a.substring(b.length());
		
		System.out.println("Before Swipe a="+a+" b= "+b);
	}

}
