

import java.util.HashMap;
import java.util.Map;

public class CharacterCount1 {

	public static void main(String[] args) {
		
		String s1="hallo";
		CharCount(s1);

	}

	 public static void CharCount(String s1) {
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		char strarray[]=s1.toCharArray();
		
		for(char c1:strarray) {
			if(hm.containsKey(c1)) {
				hm.put(c1, hm.get(c1)+1);
					
				
			}
			else {
				hm.put(c1, 1);
			}
		}
		for(Map.Entry entry:hm.entrySet()) {
			System.out.println(entry.getValue()+" " +entry.getKey());
		}
		
	}

}
