import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class paymentFormat {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("write amount");
		int payment=sc.nextInt();
		
		NumberFormat nf;
		nf=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("USA "+nf.format(payment));
		
		nf=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("FRANCE "+nf.format(payment));
		
		nf=NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("CHINA "+nf.format(payment));
		
		nf=NumberFormat.getCurrencyInstance(new Locale("en","in"));
		System.out.println("India "+nf.format(payment));
		
	}

}
