package O.O_Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario_Main {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		double porcentagem = 0;
		
		System.out.println("Informe seu nome: ");
		func.Name = sc.nextLine();
		System.out.println("Informe seu Sal�rio Bruto: ");
		func.GrossSalary = sc.nextDouble();
		System.out.println("Informe o Imposto de Renda do Sal�rio: ");
		func.Tax = sc.nextDouble();
		
		System.out.println(func.toString());
		
		System.out.println("Informe uma porcentagem para aumentar o Sal�rio: ");
		porcentagem = sc.nextDouble();
		func.IncreaseSalary(porcentagem);
		
		System.out.println(func.toString());
		
	}

}
