package matrixProblem;

import java.util.Scanner;

public class AnticlockWise90 {

	public static void main(String[] args) {
		  int[][] mat = { { 1, 2 }, { 3, 4 } };
		    rotate(mat);
	}
	public static void rotate(int[][] matrix) {
	    if (matrix == null) {
	        return;
	    }
	    int n = matrix.length - 1;
	    int temp = 0;
	    int[][] mat2 = new int[n + 1][n + 1];
	    mat2 = matrix;
	    for (int row = 0; row <= n; row++) {
	        for (int col = 0; col <= n; col++) {
	            // mat2[n-col][row] = matrix[row][col];
	            temp = matrix[col][n - row];
	            matrix[col][n - row] = matrix[row][col];
	            matrix[row][col] = temp;
	        }
	    }
	    for (int i = 0; i <= n; i++) {
	        for (int j = 0; j <= n; j++) {
	            matrix[i][j] = mat2[i][j];
	        }
	    }

}
}
