import java.util.Arrays;
import java.util.Collections;


public class practice {
	public static void main(String args[]) {

		Integer[] arr= {4,5,9,67,45,88,44};
		twowaySorting(arr,arr.length);
		System.out.print(Arrays.toString(arr));
	}

	private static void twowaySorting(Integer[] arr, int length) {
		
		int l=0,r=length-1;
		int k=0;
		
		while(l<r) {
			while(arr[l]%2 != 0) {
				l++;
				k++;
			}
			while(arr[r]%2 == 0 && l<r ) 
				r--;
			
			if(l<r) {
				int temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
			}
		}
		
		Arrays.sort(arr, 0, k, Collections.reverseOrder());
		Arrays.sort(arr,k,length);
	}

	
	
}
