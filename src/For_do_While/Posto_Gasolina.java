package For_do_While;

import java.util.Scanner;

public class Posto_Gasolina {
	public static void main(String[]args) {
		
		int codigo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu combustível Favorito( 1.Álcool 2.Gasolina 3.Diesel 4.Fim ):");
		codigo = sc.nextInt();
		
		/*
		while(codigo != 4) {
			if(codigo == 1) {
				System.out.println("Álcool é seu favorito !");
				break;
			}else if(codigo == 2) {
				System.out.println("Gasolina é seu favorito !");
				break;
			}else if(codigo == 3) {
				System.out.println("Diesel é seu favorito !");
				break;
			}else {
				System.out.println("Código não registrado no Sistema e não identificado. Tente novamente.");
			}
			System.out.println("Informe seu combustível Favorito( 1.Álcool 2.Gasolina 3.Diesel 4.Fim ):");
			codigo = sc.nextInt();
		}
		
		System.out.println("Muito OBrigado, Voltei Sempre !");
	*/
		
		do {
			if(codigo == 1) {
				System.out.println("Álcool é seu favorito !");
				break;
			}else if(codigo == 2) {
				System.out.println("Gasolina é seu favorito !");
				break;
			}else if(codigo == 3) {
				System.out.println("Diesel é seu favorito !");
				break;
			}else {
				System.out.println("Código não registrado no Sistema e não identificado. Tente novamente.");
			}
			System.out.println("Informe seu combustível Favorito( 1.Álcool 2.Gasolina 3.Diesel 4.Fim ):");
			codigo = sc.nextInt();
			
		}while (codigo != 4);
		
		System.out.println("Muito OBrigado, Voltei Sempre !");
	}
}
