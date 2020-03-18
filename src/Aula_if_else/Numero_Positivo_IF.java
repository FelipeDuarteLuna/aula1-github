package Aula_if_else;
import java.util.Scanner;

public class Numero_Positivo_IF {
	public static void main(String[] args) {
		
		int numero;
		System.out.println("Informe um número inteiro: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		if(numero < 0 ){
			System.out.println("Numero é NEGATIVO.");
		}else if (numero == 0){
			System.out.println("Numero NÃO É NEGATIVO");
		}else {
			System.out.println("Numero é positivo.");
		}
	}
}
