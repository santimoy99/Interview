import java.util.Arrays;

public class MeanMedianMode {

	public static void main(String[] args) {
		
		int[] arra= {5,4,3,2,1,6,5,3,3,5,5};
		
		int Mean=mean(arra);
		System.out.println("Mean value "+Mean);
		
		double Median=median(arra);
		System.out.println("Median value "+Median);
		
		int Mode=mode(arra);
		System.out.println("Mode value "+Mode);
	}

	private static int mode(int[] arra) {

		int maxAppearence=-1;
		int max=-1;
		
		for(int i=0;i<arra.length;i++) {
			int count=0;
			for(int j=0;j<arra.length;j++) {
				if(arra[i]==arra[j]) {
					count++;
				}
			}
			if(count>maxAppearence) {
				maxAppearence=count;
				max=arra[i];
			}
		}
		return max;
	}

	private static double median(int[] arra) {

		Arrays.sort(arra);//1,2,3,4,5,6
		if(arra.length%2!=0) {
			return arra[arra.length/2];
		}
		else {
			return (double) ( (arra[arra.length/2]+arra[(arra.length/2-1)])/2.0);
		}
		
	}

	private static int mean(int[] arra) {
		int temp=0;
		for(int i=0;i<=arra.length-1;i++) {
			temp=temp+arra[i];
		}
		int Mean=temp/arra.length;
		return Mean;
	}

}
