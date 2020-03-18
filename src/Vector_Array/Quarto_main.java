package Vector_Array;

import java.util.Random;
import java.util.Scanner;

public class Quarto_main {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		int quartos;
		
		System.out.println("How many rooms will be rented ?");
		quartos = sc.nextInt();
		
		
		Quarto_excercicio [] vect = new Quarto_excercicio[10];// Declarando o vetor dos quartos com o tamanho de quartos necessarios
		
		for(int i = 0; i<quartos; i++) {
			sc.nextLine();
			System.out.println("Informe o nome para alugar o quarto: ");
			String nome = sc.nextLine();
			System.out.println("Informe o nome do e-mail do cliente: ");
			String email=sc.nextLine();
			int room = gerador.nextInt(10);
			vect[i] = new Quarto_excercicio(nome,email, room);	
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i<vect.length;i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
			
		}
		
	}

}
