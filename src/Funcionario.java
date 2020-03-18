import java.util.Scanner;

public class Funcionario {
	public static void main(String[] args) {
		
		System.out.println("Informe Nº do Funcionario:");
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		
		System.out.println("Informe quantidade de horas trabalhadas peloFuncionario:");
		int horasTrabalhadas = sc.nextInt();
		
		System.out.println("Informe Valor $ hora do Funcionario:");
		double valorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("Funcionario Nº " + numeroFuncionario + ", Salário R$ %.2f%n " , salario);
	}
}
