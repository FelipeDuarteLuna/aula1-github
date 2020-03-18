package Aula_if_else;
import java.util.Scanner;

public class IR_IMPOSTO_IF {
	public static void main(String[]args) {
		
		double renda, imposto;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua renda: ");
		renda = sc.nextDouble();
		
		
		if(renda <= 2000) {
			imposto = renda * 8/100;
			System.out.println("Imposto pago para esta faixtaria de Renda é R$ "+imposto);
			
		}else if(renda > 2000.01 && renda <= 3000.00) {
			imposto = renda * 18/100;
			System.out.println("Imposto pago para esta faixtaria de Renda é R$ "+imposto);
			
		}else {
			imposto = renda * 28/100;
			System.out.println("Imposto pago para esta faixtaria de Renda é R$ "+imposto);
		}
		
		
		
	}

}
