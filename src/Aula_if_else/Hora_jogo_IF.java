package Aula_if_else;
import java.util.Scanner;

public class Hora_jogo_IF {
	public static void main(String[] args) {
		
		int duracao = 0;
		int horainicial;
		int horafinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informar a hora inicial da Partida");
		horainicial = sc.nextInt();
		System.out.println("Informar a hora final da Partida");
		horafinal = sc.nextInt();
		
		if (horainicial < horafinal) {
			duracao = horafinal - horainicial;
		}else {
			duracao = 24 - horainicial + horafinal;
		}	

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
	}
		
}


