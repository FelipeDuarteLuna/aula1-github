

package O.O_Exemplos;

import java.util.Locale;
import java.util.Scanner;

import O.O_Exemplos.CurrencyConverter;

public class Dolar_Main {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price ?");
		double valorDollar = sc.nextDouble();

		System.out.println("How many dollars will be bought ?");
		double quantidadeDollar= sc.nextDouble();
		double result = CurrencyConverter.conversao(valorDollar, quantidadeDollar);
				
		System.out.println("Amount to be paid in Reais R$ = ");
		System.out.println(result);
		
	}
}
