import java.util.Arrays;
import java.util.Scanner;

public class Each_word_char_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a string");
		String str = sc.nextLine();//i am a good boy
		String[] str1 = str.split(" ");
		System.out.println(Arrays.toString(str1));//[i, am, a, good, boy]
		System.out.println("No of word = " + str1.length);//No of word = 5
		int count = 0;
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length(); j++) {
				count++;
			}
			System.out.println(str1[i] + " " + count);//i=1 am=2 a=1 good=4 boy=3
			count = 0;
		}

	}

}
