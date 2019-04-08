

public class MaxMin {

	public static void main(String[] args) {
		
		int arr[]= {1,9,6,3,7};
		
		
		
		int maxvalue=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxvalue) {
				maxvalue=arr[i];
			}
		}
		
		System.out.println(maxvalue);
		int min=minnum(arr);
		System.out.println(min);

	}

	public  static int minnum(int[] arr) {

		int minvalue=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minvalue) {
				minvalue=arr[i];
			}
		}

		return minvalue;
	}


		
	

	
}
