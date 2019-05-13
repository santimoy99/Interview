package matrixProblem;

import java.util.Scanner;

public class AnticlockWise90 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the num of row");
		int r=sc.nextInt();
		
		System.out.println("Enter the num of coloum");
		int c=sc.nextInt();
		
		//user input
		int[][] matrix=new int [r][r];
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				 matrix[i][j]=sc.nextInt();
			}
		}
		
		//Display the matrix
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		AntiClock(matrix);
		
		//Display Anticlock Wise
		System.out.println("Display Anticlock Wise");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void AntiClock(int[][] matrix) {
		transpose(matrix);
		
		//display Transpose matrix
		System.out.println("display Transpose matrix");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		//anticlock
		for(int i=0;i<matrix.length/2;i++) {
			for(int j=0;j<matrix.length;j++) {
				int x=matrix[i][j];
				matrix[i][j]=matrix[matrix.length-i-1][j];
				matrix[matrix.length-i-1][j]=x;
			}
		}
		
	}

	private static void transpose(int[][] matrix) {

		int temp=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=i;j<matrix.length;j++) {
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
	}

}
