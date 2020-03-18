import java.util.Scanner;

public class DIFERENCA {
	public static void main(String[]args) {
		
		System.out.println("Informe um numero inteiro:");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println("Informe um numero inteiro:");
		int b = sc.nextInt();
		
		System.out.println("Informe um numero inteiro:");
		int c = sc.nextInt();
		
		System.out.println("Informe um numero inteiro:");
		int d = sc.nextInt();
		
		int diferenca = a*b - c*d;
		
		System.out.println(diferenca);
	}

}
