import java.util.Scanner;

public class pe�a {
	public static void main(String[]args) {
		
		System.out.println("Informe c�digo de uma pe�a: ");
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		
		System.out.println("Informe o numero de pe�as a ser compradas: ");
		int numero = sc.nextInt();
		
		System.out.println("Informe o valor unit�rio R$: ");
		double valor = sc.nextDouble();
		
		double total = numero * valor;
				
		System.out.println(total);
	}
}
