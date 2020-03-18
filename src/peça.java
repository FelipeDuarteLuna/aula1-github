import java.util.Scanner;

public class peça {
	public static void main(String[]args) {
		
		System.out.println("Informe código de uma peça: ");
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		
		System.out.println("Informe o numero de peças a ser compradas: ");
		int numero = sc.nextInt();
		
		System.out.println("Informe o valor unitário R$: ");
		double valor = sc.nextDouble();
		
		double total = numero * valor;
				
		System.out.println(total);
	}
}
