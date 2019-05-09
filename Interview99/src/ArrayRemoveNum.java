
public class ArrayRemoveNum {

	public static void main(String[] args) {
		int[] n = { 6, 8, 34, 98 };
		int p =34;
		for (int i = 0; i < n.length - 1; i++) {
			if (n[i] == p) {
				for (int j = i; j < n.length - 1; j++) {
					n[j] = n[j + 1];
				}
				//break;
			}

		}
		for(int x=0;x<n.length-1;x++) {
			System.out.print(n[x]+" ");
		}

	}

}
