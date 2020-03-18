package For_do_While;

import java.util.Scanner;

public class Senha {
	public static void main(String[] args) {
		
		int senha;
		int senhaCoreta = 2002;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua Senha para loggar no SmartErp:");
		senha = sc.nextInt();
		
		/*while(senha != senhaCoreta) {
			if(senha == senhaCoreta) {
				System.out.println("Acesso Permitido");
				
			}else {
				System.out.println("Senha Invalida");
				System.out.println("Informe sua Senha para loggar no SmartErp:");
				senha = sc.nextInt();
			}
			
		}*/
		
		do {
			if(senha == senhaCoreta) {
				System.out.println("Acesso Permitido");
				
			}else {
				System.out.println("Senha Invalida");
				System.out.println("Informe sua Senha para loggar no SmartErp:");
				senha = sc.nextInt();
			}
		}while(senha != senhaCoreta);
		
		System.out.println("Acesso Permitido");
	}

}
