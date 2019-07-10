import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_for_while_AdvFor {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(12);
		ar.add(45);
		ar.add(87);

		System.out.println("Using for Loop");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("Using while Loop");
		int i = 0;
		while (ar.size() > i) {
			System.out.println(ar.get(i));
			i++;
		}
		System.out.println("Using Advance for Loop");
		Iterator<Integer> itr=ar.iterator();
		for (Integer it : ar) {
			System.out.println(it);
		}
		
	}

}
