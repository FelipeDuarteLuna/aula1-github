import java.util.Scanner;

public class PI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Informe o raio de um circulo:");
		Scanner sc =new Scanner(System.in);
		
		double x = sc.nextDouble();
		double pi = 3.14159;
		double area = (pi * x) * x;
		
		System.out.printf("Aréa do Circulo é %.4f%n", area);
		

	}

}
