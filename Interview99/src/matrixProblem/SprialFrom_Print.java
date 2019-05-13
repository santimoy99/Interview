package matrixProblem;

import java.util.Scanner;

public class SprialFrom_Print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num of row");
		int r = sc.nextInt();

		System.out.println("Enter the num of coloum");
		int c = sc.nextInt();

		// user input
		int[][] matrix = new int[r][r];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		// Display the matrix
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		//spiral print
		int k=0,l=0;
		int lastrow=r-1;
		int lastcolumn=c-1;
		while(k<=lastrow && l<=lastcolumn) {
			for(int i=l;i<=lastrow;i++) {
				System.out.print(matrix[k][i]);
			}
			k++;
			for(int i=k;i<=lastcolumn;i++) {
				System.out.print(matrix[i][lastcolumn]);
			}
			lastcolumn--;
			if(k<=lastrow) {
				for(int i=lastcolumn;i>=l;i--) {
					System.out.print(matrix[lastrow][i]);
				}
				lastrow--;
			}
			if(l<=lastcolumn) {
				for(int i=lastrow;i>=k;i--) {
				System.out.print(matrix[i][l]);
				}
				l++;
			}
		}
	}

}
