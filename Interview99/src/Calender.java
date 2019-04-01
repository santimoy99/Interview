import java.util.Calendar;
import java.util.Scanner;

public class Calender {

	

	//private static final int DAY_OF_WEEK = 0;

	public static void main(String[] args) {


		Scanner sc =new Scanner(System.in);
		int date=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		
		String res=checkdate(date,month,year);
		System.out.println(res);

	}

	private static String checkdate(int date, int month, int year) {
		
		Calendar cal= Calendar.getInstance();
		cal.set(Integer.valueOf(year), Integer.valueOf(month)-1, Integer.valueOf(date));
		String day="";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
			
		case 1:
			day="sunday";
			break;
		
		case 2:
			day="monday";
			break;
		case 3:
			day="tuesday";
			break;
		case 4:
			day="wednesday";
			break;
		case 5:
			day="thrusday";
			break;
		case 6:
			day="friday";
			break;
		case 7:
			day="saturday";
			break;
		}
		return day.toUpperCase();
		// TODO Auto-generated method stub
		
	}

}
