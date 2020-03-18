package Vector_Array;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_Arrays_Exemplo {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quant;
		double [] vect = new double[3];
		double media = 0,avg  =0.0;
		
		System.out.println("Informe a quantidade de vez a ser executada: ");
		quant = sc.nextInt();
		
		for(int i=0; i<quant; i++) {
			System.out.println("Informe a altura desejada, para média: ");
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		
		 avg = media / quant;
		System.out.printf("AVERAGE HEIGHT MEDIA : %.2f%n", avg);
		
		sc.close();
		
	}

}
