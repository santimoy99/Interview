import java.util.Scanner;

public class Thirdlargest {

	public static void main(String[] args) {
		

		int[] arr = { 13, 56, 78, 5, 98, 150, 46 };
		int third = thirdlar(arr);
		System.out.println(third);

	}

	private static int thirdlar(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return arr[arr.length-3];
	}

}
