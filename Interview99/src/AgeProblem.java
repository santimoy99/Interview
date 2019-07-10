
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;



public class AgeProblem {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		System.out.println("Enter the Month");
		int month=sc.nextInt();
		System.out.println("Enter the Date");
		int date=sc.nextInt();
		
		
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(year, month, date);
		int p=Period.between(today, birthday).getYears();
		
		System.out.println(birthday);
		System.out.println(today);
		System.out.println(p);

	}

}
