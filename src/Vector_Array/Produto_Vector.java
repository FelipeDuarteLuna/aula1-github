package Vector_Array;

import java.util.Locale;
import java.util.Scanner;

public class Produto_Vector {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de vezes, que deseja processar: ");
		int n = sc.nextInt();
		Produto [] vect = new Produto[n];
		
		for(int i = 0; i<n ; i++) {
			sc.nextLine();
			System.out.println("Informe o nome do Produto:");
			String name = sc.nextLine();
			
			System.out.println("Informe o Preço do Produto:");
			double price = sc.nextDouble();
			vect[i] = new Produto(name, price);
			
		}
		
		double sum = 0.0;
		for(int i = 0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		System.out.println("AVERAGE PRICE =  " + avg);
		sc.close();
	}

}
