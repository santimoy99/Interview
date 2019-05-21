
public class Fibonacci_recursion {
	static int a = 0, b = 1, c = 0;

	public static void recur(int n) {

		if (n > 0) {

			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
			n = n - 1;
			recur(n);

		}
	}

	public static void main(String[] args) {

		Fibonacci_recursion f = new Fibonacci_recursion();
		f.recur(6);

	}

}
