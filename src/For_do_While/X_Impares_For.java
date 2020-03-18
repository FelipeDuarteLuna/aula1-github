package For_do_While;

import java.util.Scanner;

public class X_Impares_For {
	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um Nº inteiro: ");
		x = sc.nextInt();
		
		
		for (int i=0; i <= x; i++){
			if(i % 2 == 0 ) {
				System.out.println("Numero é PAR. "+i);
				
			}else {
				System.out.println("Numero é impar. " + i);
			}
			
		}
		
		
	}

}
