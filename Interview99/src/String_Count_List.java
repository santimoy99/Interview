import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class String_Count_List {
	public static void main(String[] args) {

		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Santimoy");
		ar.add("Rohit");
		ar.add("Santimoy");
		ar.add("Ratul");
		ar.add("Subham");
		System.out.println(ar);
		
		countFrequency(ar);
			
		}

		private static void countFrequency(ArrayList<String> ar) {
			
			Set<String> st = new HashSet<String>(ar); 
	        for (String s : st) 
	            System.out.println(s + ": " + Collections.frequency(ar, s)); 
	  }
}
