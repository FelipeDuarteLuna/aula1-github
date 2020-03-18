import java.util.Scanner;

public class Intervalo {
	public static void main (String[]args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Informe um numero: ");
		num = sc.nextInt();
		
		if(num <= 25) {
			System.out.println("Intervalo (0,25]");
		}else if (num <= 50) {
			System.out.println("Intervalo (25,50]");
		}else if(num <= 75) {
			System.out.println("Intervalo (50,75]");
		}else if(num <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("FORA DO INTERVALO.");
		}
	
	
	}

}
