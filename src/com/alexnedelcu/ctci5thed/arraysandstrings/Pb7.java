package com.alexnedelcu.ctci5thed.arraysandstrings;

public class Pb7 {
	public static void main(String[] argv) {

		int [][] m = new int[3][3];

		m[0][0] = 1;
		m[0][1] = 2;
		m[0][2] = 3;
		m[1][0] = 4;
		m[1][1] = 0;
		m[1][2] = 5;
		m[2][0] = 6;
		m[2][1] = 7;
		m[2][2] = 8;
		
		printMatrix(m);
		makeZero(m);
		
		System.out.println("Zeroed matrix:");
		printMatrix(m);
	}
	
	public static void makeZero(int [][] m) {
		
		int [][] x = new int[m.length*m.length][2];
		int n=0;
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				if (m[i][j] == 0) {
					
					x[n][0] = i;
					x[n][1] = j;
					System.out.println(i+" "+j);
					n++;
				}
			}
		}
		
		for (int i=0; i<n; i++) {
		
			// make the entire row zero
			for (int k = 0; k <m[x[i][0]].length; k++) 
				m[x[i][0]][k] = 0;
				
			// make the entire column zero
			for (int k = 0; k <m.length; k++) 
				m[k][x[i][1]] = 0;
		
		}
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
