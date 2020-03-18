package O.O_Exemplos;

import java.util.Scanner;

public class Retangulo_Main {
	public static void main(String[]args) {
				
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.println("Informe a largura/Width do Retângulo: ");
		ret.width = sc.nextDouble();
		
		System.out.println("Informe a Altura/Height do Retângulo: ");
		ret.height = sc.nextDouble();
		
		ret.Area(ret.width,ret.height);
		ret.Perimeter(ret.width,ret.height);
		ret.Diagonal();
		
		System.out.println(ret);

		
		
	}
}
