

public class MoveAllCharacter {

	public static void main(String[] args) {
		
		int arr[]= {1,9,0,4,8,2,0,7,0};
		int n=arr.length;
		
		moveCharacter(arr,n);
		
		for(int i=0;i<n;i++) 
			System.out.print(arr[i]);
		

	}

	public static void moveCharacter(int[] arr, int n) {

		int count=0;

		for(int i=0;i<n;i++) {
			if( arr[i]!=0) {
				arr[count++]=arr[i];
		}
			}
			while(count<n) {
				arr[count++]=0;
			}
		
		
	}

	

}
