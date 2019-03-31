

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("write a num1");
        String n=sc.nextLine();
        
        n=n.replaceAll(" ","");
       String temp="";
       for(int i=0;i<=n.length()-1;i++) {
    	   for(int j=i+1;j<=n.length()-1;j++) {
    		   if(n.charAt(i)==n.charAt(j)) {
    			  temp=temp+n.charAt(j);
    		   }
    	   }
       }
       System.out.println(temp);
		
		
		

	}

	
}
