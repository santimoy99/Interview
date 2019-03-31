


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssendingDecending {

	public static void main(String[] args) {
		
		Integer[] s1= {7,8,34,19,0,6};
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
		
		Arrays.sort(s1, Collections.reverseOrder()); 
		System.out.println( Arrays.toString(s1)); 
		
		 Integer[] num = {7,34,45,23,38,56,21};
 	    /*First we convert an Array to List using
 	      Arrays.asList(), then pass the list as an
 	      argument to the constructor of TreeSet */
 	    List<Integer> list = Arrays.asList(num);
 	   
 	    Collections.sort(list);
 	    System.out.println("The Set elements are :"+list);
 	    Collections.reverse(list);
 	    System.out.println("The Set elements are :"+list);

	 }

}
   