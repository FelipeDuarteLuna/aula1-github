package Aula_if_else;
import java.util.Scanner;

public class Num_Multiplos_IF {
	public static void main(String[]args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 1 numero inteiro: ");
		num1 = sc.nextInt();
		
		System.out.println("Informe outro numero inteiro: ");
		num2 = sc.nextInt();
		
		if(num1 % num2 ==0 || num2 % num1 ==0) {
			System.out.println("Numero é MULTIPLO");
		}else{
			System.out.println("Numero não é MULTIPLO");
		}
	}

}
