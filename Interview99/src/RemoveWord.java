
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class RemoveWord {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Write a string");//i am a good boy good boy
		String str=sc.nextLine();

		String[] strArray=str.split(" ");
		/*
		 * System.out.println(Arrays.toString(strArray)); String temp=""; for(int
		 * i=0;i<strArray.length;i++){ for(int j=i+1;j<strArray.length;j++){
		 * if(strArray[i]==strArray[j]){ temp=temp+strArray[i]; } } }
		 * System.out.println(temp);
		 */
		Set<String> s1=new LinkedHashSet<String>();
		for(int i=0;i<strArray.length;i++) {
			s1.add(strArray[i]);
			
		}
		String s ="";
		for (String ss : s1) {
			s+=ss+" ";
			
		}
		
		System.out.println(s);//i am a good boy 


	}

}
