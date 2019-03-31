

public class MaxMin {

	public static void main(String[] args) {
		
		int arr[]= {1,9,6,3,7};
		
		
		int max=maxnum(arr);
		System.out.println(max);
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

	public static int maxnum(int[] arr) {
		int maxvalue=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxvalue) {
				maxvalue=arr[i];
			}
		}
		return maxvalue;
		
		
		
	}

	
}
