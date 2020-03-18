package For_do_While;

import java.util.Scanner;

public class N_Linhas_for {
	public static void main(String[]args) {
		
		int n,quadrado,cubo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o Nº, N para processa o programa: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			quadrado = i*i;
			cubo = i*i*i;			
			System.out.println(n +" " +i+" "+quadrado+" "+cubo);
		}
	}
}
