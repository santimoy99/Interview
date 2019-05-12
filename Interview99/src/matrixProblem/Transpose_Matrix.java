package matrixProblem;
import java.util.Scanner;

public class Transpose_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of row");
		int r = sc.nextInt();
		System.out.println("Enter the no of colum");
		int c = sc.nextInt();

		int[][] matrix = new int[r][c];

		matrix = create(sc, r, c, matrix);
		display(matrix, r, c);

	}

	private static void display(int[][] matrix, int r, int c) {

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("TransposeMatrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}

	}

	private static int[][] create(Scanner sc, int r, int c, int[][] matrix) {

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

}
