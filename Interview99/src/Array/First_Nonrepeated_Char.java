package Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class First_Nonrepeated_Char {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Write a string ");
		String str=sc.nextLine();
		
		str=str.replace(" ", "");
		char[] array=str.toCharArray();
		
		LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character, Integer>();
		for(char c1:array) {
			if(hm.containsKey(c1)) {
				hm.put(c1, hm.get(c1)+1);
			}
			else {
				hm.put(c1, 1);
			}  
		}
		
		for(Map.Entry  entry:hm.entrySet()) {
			
				//System.out.println(entry.getKey()+" "+entry.getValue());
			    if(Integer.parseInt(entry.getValue().toString())==1) {
			    	System.out.println("**********"+entry.getKey());
			    	break;
			    }else {
			    	//System.err.println(entry.getKey());
			    }
		}

	}

}
