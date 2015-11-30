package com.alexnedelcu.ctci5thed.arraysandstrings;

public class Pb6 {

	public static void main(String[] args) {
		int [][] m = new int[3][3];

		m[0][0] = 0;
		m[0][1] = 1;
		m[0][2] = 2;
		m[1][0] = 3;
		m[1][1] = 4;
		m[1][2] = 5;
		m[2][0] = 6;
		m[2][1] = 7;
		m[2][2] = 8;
		
		System.out.println("Initial matrix: ");
		printMatrix(m);
		
		rotate(m);
		System.out.println("Rotated matrix: ");
		printMatrix(m);

	}
	
	/**
	 * Rotates the matrix by starting with the edge elements only. Once all the edge elements are rotated, the second level edge elements are rotates, and so on until the entire matrix is rotated
	 * @param matrix
	 * @return
	 */
	public static int[][] rotate (int [][] matrix) {
		
		// iterate through the edges of the matrix
		for (int offset = 0; offset<matrix.length/2; offset++) {
			
			// swap the edge elements
			for  (int x=0; x<matrix.length; x++ ) {
				swap(matrix, offset, x);
			}
			
		}
		
		
		return matrix;
	}
	
	public static void swap (int [][] matrix, int offset, int x) {
		int tmp = matrix[offset][matrix.length-offset-x-1];
		matrix[offset][matrix.length-offset-x-1] = matrix[offset+x][offset];
		matrix[offset+x][offset] = matrix[matrix.length-offset-1][offset+x];
		matrix[matrix.length-offset-1][offset+x] = matrix[offset+x][matrix.length-offset-1];
		matrix[offset+x][matrix.length-offset-1] = tmp;
	}

	public static void printMatrix(int[][] matrix){
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}
	}
}
