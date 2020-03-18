package O.O_Exemplos;

import java.util.Scanner;

public class Aluno_Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do Aluno: ");
		aluno.Nome = sc.nextLine();
		System.out.println("Informe a Nota do Aluno, no 1º Trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Informe a Nota do Aluno, no 2º Trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Informe a Nota do Aluno, no 3º Trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		aluno.totalNotas();
		
	}

}
