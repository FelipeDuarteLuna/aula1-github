package Aula_if_else;
import java.util.Scanner;

public class Numero_Positivo_IF {
	public static void main(String[] args) {
		
		int numero;
		System.out.println("Informe um n�mero inteiro: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		if(numero < 0 ){
			System.out.println("Numero � NEGATIVO.");
		}else if (numero == 0){
			System.out.println("Numero N�O � NEGATIVO");
		}else {
			System.out.println("Numero � positivo.");
		}
	}
}
