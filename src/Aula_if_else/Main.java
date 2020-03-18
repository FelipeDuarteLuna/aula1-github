package Aula_if_else;
import java.util.Locale;

/**
 * @author felipe.luna
 *
 */
public class Main {
	public static void main(String[]args) {
		
		int renan = 1;
		double x = 10.35784;
		
		System.out.println("Hello Word - Curso Udemy");
		
		System.out.println(renan);
		
		System.out.printf("%.2f%n", x); // Para demilitar a casa decimal do valor fracionario.
		Locale.setDefault(Locale.US); // Definindo a localização, desta maneiro para considerar "." e não ",".
		System.out.printf("%.4f%n", x); // Para demilitar a casa decimal do valor fracionario.
	}

}
