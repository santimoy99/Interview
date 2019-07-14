import java.util.HashMap;
import java.util.Map;

public class DuplicateCharCount {

	public static void main(String[] args) {
		String word="Programming";
		  char[] characters = word.toCharArray();

	        // build HashMap with character and number of times they appear in String
	       HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	        for (Character ch : characters) {
	            if (hm.containsKey(ch)) {
	                hm.put(ch, hm.get(ch) + 1);
	            } else {
	                hm.put(ch, 1);
	            }
	        }

	       
	        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
	            }
	        }

	}

}
