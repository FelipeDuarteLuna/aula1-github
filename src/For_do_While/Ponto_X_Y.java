package For_do_While;

import java.util.Scanner;

public class Ponto_X_Y {
	public static void main(String[]args) {
		
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informa a coordenada de X: ");
		x = sc.nextInt();
		System.out.println("Informa a coordenada de Y: ");
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x == 2 && y ==2) {
				System.out.println("Primeiro");
			}else if( x == 3 || y == -2) {
				System.out.println("Segundo");
			}else if(x == -8 || y == -1) {
				System.out.println("Terceiro");
			}
			
			System.out.println("Informa a coordenada de X: ");
			x = sc.nextInt();
			System.out.println("Informa a coordenada de Y: ");
			y = sc.nextInt();
		}
		System.out.println("---------- Saiu --------------");
		
	}
}
