package For_do_While;

import java.util.Scanner;

public class Media_Ponderada_For {
	public static void main(String[]args) {
		
		int numero;
		double val1, val2, val3,media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o numero de CASO DE TESTE: ");
		numero = sc.nextInt();
		
		for(int i= 1; i<=numero; i++) {
			
			System.out.println("Informe o numero real valor Nº 1, R$: ");
			val1=sc.nextDouble();
			System.out.println("Informe o numero real valor Nº 2, R$: ");
			val2=sc.nextDouble();
			System.out.println("Informe o numero real valor Nº 3, R$: ");
			val3=sc.nextDouble();
			
			media = (val1+val2+val3)/3;
			
			System.out.println("Segue média Ponderada dos valores na Rodada "+i+" . Com Média R$ "+media);
			
			
		}
		
	}

}
