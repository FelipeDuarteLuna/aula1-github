package Vector_Array;

import java.util.Scanner;

public class Matriz_Exerc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int l,c;
		
		System.out.println("Informe o Nº de linhas da MATRIZ: ");
		l = sc.nextInt();
		System.out.println("Informe o Nº de Coluna da MATRIZ: ");
		c = sc.nextInt();
		
		int [][] mat = new int [l][c];
		for(int i = 0; i<l ; i++) {
			for(int j = 0; j<c;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe o numero a ser procurado na MATRIZ: ");
		int prc = sc.nextInt();
		for(int i=0; i< mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 8) {
					System.out.println("Position: " + mat[i][j]);
					System.out.println("Left: " + mat[i][j - 1]);
					System.out.println("Rigth: " + mat[i][j + 1]);
					System.out.println("Down: " + + mat[i + 1][j]);
					System.out.println("up: " + mat[i - 1][j]);
					
				}
			}
		}
		
	}

}
