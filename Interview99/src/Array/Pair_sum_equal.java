package Array;

public class Pair_sum_equal {

	public static void main(String[] args) {

/*Given array : [2, 4, 3, 5, 6, -2, 4, 7, 8, 9] Given sum : 7 Integer numbers,
 *  whose sum is equal to value : 7 (2, 5) (4, 3) (3, 4) (-2, 9) 
 */
		int[] array= {3,5,4,2,8,1,6,9,7,-2};
		int sum=7;
		
		for(int i=0;i<array.length;i++) {
			int first=array[i];
			for(int j=i+1;j<array.length;j++) {
				int secand=array[j];
				if(first+secand==sum) {
					System.out.println(first+" "+secand);
				}
			}
		}



	}

}
