package Aula_if_else;
import java.util.Scanner;

public class Num_PAR_Impar_IF {
	public static void main(String[]args) {
		
		int numero; 
		
		System.out.println("Informe um numero para dizer se o mesmo � par ou impar: ");
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		
		if(numero % 2 == 0 ) {
			System.out.println("Numero � PAR.");
			
		}else {
			System.out.println("Numero � impar.");
		}
		
		sc.close();
	}

}
