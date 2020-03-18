import java.util.Scanner;

public class Exercicio_01 {
	public static void main(String[]args) {
		
		System.out.println("Informe um numero para a soma");
		Scanner sc =new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.println("Informe segundo numero para a soma");
		int y = sc.nextInt();
		
		int total = x + y;
		
		System.out.println("Soma dos numeros " + x +" + " + y +" é :" + total);
		
	}
}
