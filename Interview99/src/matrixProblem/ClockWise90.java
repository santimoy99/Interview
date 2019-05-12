package matrixProblem;

import java.util.Scanner;

public class ClockWise90 {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the no of Row");
		int r=sc.nextInt();
		System.out.println("Enter the no of Column");
		int c=sc.nextInt();
		
		int[][] matrix=new int[r][c];
		
		//put the value in matrix
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				matrix[i][j]=sc.nextInt();
			}
			
		}
		
		//display the matrix
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		//Rotate matrix by 90 degree
		System.out.println("Rotate matrix by 90 degree");
		for(int i=0;i<r;i++) {
			for(int j=r-1;j>=0;j--) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
