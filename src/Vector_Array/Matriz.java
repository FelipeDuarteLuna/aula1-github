package Vector_Array;

import java.util.Scanner;

public class Matriz {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de Colunas e Linhas da MaTRIZ:");
		int n = sc.nextInt();
		int [][] mat = new int [n][n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				//System.out.println(mat[i][j] + "  ");
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i] + "  ");
		}
		
		System.out.println();
		
		int count = 0;
		for(int i =0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count ++;
					System.out.println(mat[i][j]);
					System.out.println("Total de numeros negativos: " + count);
				}
			}
		}

		
	}

}
