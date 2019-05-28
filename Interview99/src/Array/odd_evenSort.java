package Array;

import java.util.Arrays;

public class odd_evenSort {

	public static void main(String[] args) {
		
		int []a= {2,7,3,4,9,11,211,6};
		Arrays.sort(a);
		String s1="",s2="";
	
		System.out.println(Arrays.toString(a));
		int[] array1=new int[a.length];
		int[] array2=new int[a.length];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				array1[i]=i;
				}
			else {
				array2[i]=i;
			}
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		//String s3=s2+s1;
		//System.out.println(s3);
			

	}

}
