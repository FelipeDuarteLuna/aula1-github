package O.O_Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		Produto product = new Produto();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.nome = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println(product.nome + ", " + product.price + ", " + product.quantity);
		System.out.println(product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println(product);
		
		System.out.println("Enter the number of products to be Removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println(product);
		
		
		
		sc.close();
		
		
	}
}
