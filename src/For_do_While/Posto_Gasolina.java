package For_do_While;

import java.util.Scanner;

public class Posto_Gasolina {
	public static void main(String[]args) {
		
		int codigo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu combust�vel Favorito( 1.�lcool 2.Gasolina 3.Diesel 4.Fim ):");
		codigo = sc.nextInt();
		
		/*
		while(codigo != 4) {
			if(codigo == 1) {
				System.out.println("�lcool � seu favorito !");
				break;
			}else if(codigo == 2) {
				System.out.println("Gasolina � seu favorito !");
				break;
			}else if(codigo == 3) {
				System.out.println("Diesel � seu favorito !");
				break;
			}else {
				System.out.println("C�digo n�o registrado no Sistema e n�o identificado. Tente novamente.");
			}
			System.out.println("Informe seu combust�vel Favorito( 1.�lcool 2.Gasolina 3.Diesel 4.Fim ):");
			codigo = sc.nextInt();
		}
		
		System.out.println("Muito OBrigado, Voltei Sempre !");
	*/
		
		do {
			if(codigo == 1) {
				System.out.println("�lcool � seu favorito !");
				break;
			}else if(codigo == 2) {
				System.out.println("Gasolina � seu favorito !");
				break;
			}else if(codigo == 3) {
				System.out.println("Diesel � seu favorito !");
				break;
			}else {
				System.out.println("C�digo n�o registrado no Sistema e n�o identificado. Tente novamente.");
			}
			System.out.println("Informe seu combust�vel Favorito( 1.�lcool 2.Gasolina 3.Diesel 4.Fim ):");
			codigo = sc.nextInt();
			
		}while (codigo != 4);
		
		System.out.println("Muito OBrigado, Voltei Sempre !");
	}
}
